/*
 * Copyright 2006-2018 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.financial.swift.model;

 import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.financial.swift.model.field.AmountContainer;
import com.financial.swift.model.field.CurrencyContainer;
import com.financial.swift.model.field.Field;

/**
 * A simple POJO to represent money, an amount associated with a currency.
 * <br>
 * This might someday be replaced by an implementation of Java Money: https://java.net/projects/javamoney/pages/Home
 * 
 * @author www.singlee.financial.com
 * @since 7.8.8
 */
final class CurrencyAmount implements Serializable {
	private static final long serialVersionUID = -7552352742105490377L;
	private static final transient Logger log = Logger.getLogger(CurrencyAmount.class.getName());

	private final String currency;
	private final BigDecimal amount;

	/**
	 * @param currency a not null currency
	 * @param amount the value for the amount, may be null
	 */
	CurrencyAmount(final Currency currency, final BigDecimal amount) {
		this(currency.getCurrencyCode(), amount);
	}

	/**
	 * @param currency a not null currency code
	 * @param amount the value for the amount, may be null
	 */
	CurrencyAmount(final String currency, final BigDecimal amount) {
		super();
		Validate.notNull(currency, "currency can not be null");
		this.currency = currency;
		if (amount == null) {
			this.amount = BigDecimal.ZERO;
		} else {
			this.amount = amount;
		}
	}

	/**
	 * @param currency a not null currency
	 * @param value the value for the amount, may be null
	 */
	CurrencyAmount(final Currency currency, Number amount) {
		this(currency.getCurrencyCode(), amount);
	}
	
	/**
	 * @param currency a not null currency code
	 * @param value the value for the amount, may be null
	 */
	CurrencyAmount(final String currency, Number amount) {
		super();
		this.currency = currency;
		if (amount==null) {
			this.amount = BigDecimal.ZERO;
		} else {
			if (amount instanceof BigDecimal) {
				this.amount = (BigDecimal)amount;
			} else if (amount instanceof Long) {
				this.amount = new BigDecimal(((Long)amount).longValue());
			} else if (amount instanceof Integer) {
				this.amount = new BigDecimal(((Integer)amount).intValue());
			} else if (amount instanceof Short) {
				this.amount = new BigDecimal(((Short)amount).intValue());
			} else if (amount instanceof Double) {
				/*
				 * we use valueOf instead of constructor because it uses a string under the covers to eliminate floating point rounding errors
				 */
				this.amount = BigDecimal.valueOf(((Double)amount).doubleValue());
			} else {
				throw new IllegalArgumentException("class "+amount.getClass().getName()+" is not supported");
			}
		}
	}

	public String getCurrency() {
		return currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}
	
	/**
	 * Creates a currency amount from an MT field.<br>
	 * The field must at least implement the {@link AmountContainer} interface and 
	 * either have a currency component or implements the {@link CurrencyContainer}
	 * For some fields like the signed 19A or the 62[F,M] which have a debit/credit mark
	 * component, the amount will be positive or negative accordingly.
	 * 
	 * @param field a field with currency and amount components
	 * @return the created currency amount object or null if field is null or invalid.
	 */
	/*
	 * Do not use API from MTs and Field classes here to avoid cyclic dependency in code generation
	 * Component numbers do not normally change, although keep code below in sync with fields 62FM, 19A and 33B. 
	 */
	static CurrencyAmount of(Field field) {
		if (field != null && field instanceof AmountContainer) {
			/*
			 * amount from interface
			 */
			BigDecimal amount = ((AmountContainer)field).amount();
			if (amount == null) {
				log.warning("cannot extract amount component from field "+field.getName()+":"+field.getValue());
				return null;
			}
			
			/*
			 * special cases
			 */
			String currency = null;
			boolean negative = false;
			if ("62F".equals(field.getName()) || "62M".equals(field.getName())) {
				currency = field.getComponent(3);
				negative = StringUtils.equals("D", field.getComponent(1));
			} else if ("19A".equals(field.getName())) {
				negative = StringUtils.equals("N", field.getComponent(2));
			} else if ("33B".equals(field.getName())) {
				currency = field.getComponent(1);
			}

			/*
			 * currency from interface
			 */
			if (currency == null && field instanceof CurrencyContainer) {
				currency = ((CurrencyContainer)field).currencyString();
			}
			
			if (currency == null) {
				log.warning("cannot extract currency component from field "+field.getName()+":"+field.getValue());
				return null;
			}
			
			if (negative) {
				amount = amount.negate();
			}
			return new CurrencyAmount(currency, amount);
		}
		return null;
	}
	
	/**
	 * Creates a currency amount from the first found field in the block
	 * @param fields
	 * @return
	 */
	static CurrencyAmount ofAny(SwiftTagListBlock block, String ... fieldNames) {
		for (String fieldName : fieldNames) {
			Field field = block.getFieldByName(fieldName);
			if (field != null) {
				return of(field);
			}
		}
		return null;
	}
	
	/**
	 * Creates a currency amount from the sum of all given fields.
	 * Will return null if currencies not match.
	 * @param fields fields to sum, currency must be the same for all
	 * @return total or null if cannot create amount from any field or if not all fields currency match
	 */
	static CurrencyAmount ofSum(Field ... fields) {
		if (fields == null || fields.length == 0) {
			return null;
		}
		BigDecimal total = null;
		String currency = null;
		for (Field field : fields) {
			CurrencyAmount ca = of(field);
			if (ca == null) {
				return null;
			}
			if (total == null) {
				total = ca.getAmount();
				currency = ca.getCurrency();
			} else if (StringUtils.equals(currency, ca.getCurrency())) {
				total = total.add(ca.getAmount());
			} else {
				log.warning("cannot sum amounts with different currencies, expected "+currency+" and found "+ca.getCurrency()+" in field "+field.getName()+":"+field.getValue());
				return null;
			}
		}
		if (total != null && currency != null) {
			return new CurrencyAmount(currency, total);
		} else {
			return null;
		}
	}
}
