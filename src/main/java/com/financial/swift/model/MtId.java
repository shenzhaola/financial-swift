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

import com.financial.swift.model.mt.MTVariant;

import com.financial.swift.utils.Objects;

/**
 * Class for identification of MT messages.
 * <br >
 * Composed by the business process, message type and variant or message user group (MUG).
 * <br>
 * The business process is currently set to a fixed value "fin", however it is kept as
 * class attribute because eventually could be used also for "apc".
 * 
 * @author sebastian@prowidesoftware.com
 * @since 7.8.4
 */
public class MtId {
	private String businessProcess = "fin";
	private String messageType;
	private String variant;

	/**
	 * Creates an identification given the message type, with no variant. 
	 * @param messageType the message type number
	 * @since 7.8.6
	 */
	public MtId(String messageType) {
		this(messageType, (String)null);
	}
	
	/**
	 * @param messageType the message type number
	 * @param variant An MT variant (STP, REMIT, COV), a MUG identifier or null if none applies
	 */
	public MtId(String messageType, String variant) {
		super();
		this.messageType = messageType;
		this.variant = variant;
	}

	/**
	 * @param messageType the message type number
	 * @param variant a message variant (STP, REMIT, COV) or null if none applies
	 */
	public MtId(String messageType, MTVariant variant) {
		this(messageType, variant != null? variant.name() : null);
	}
	
	public String getBusinessProcess() {
		return businessProcess;
	}
	
	public void setBusinessProcess(String businessProcess) {
		this.businessProcess = businessProcess;
	}
	
	public String getMessageType() {
		return messageType;
	}
	
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
	public String getVariant() {
		return variant;
	}
	
	public void setVariant(String variant) {
		this.variant = variant;
	}
	
	@Override
	public String toString() {
		return id();
	}
	
	/**
	 * Get a string in the form of businessprocess.messagetype.variant
	 * @return a string with the MT message type identification 
	 * @since 7.8.4
	 */
	public String id() {
		final StringBuilder sb = new StringBuilder();
		if (businessProcess != null) {
			sb.append(businessProcess);
		} else {
			return null;
		}
		if (messageType != null) {
			sb.append("." + messageType);
		} else {
			return null;
		}
		if (variant != null) {
			sb.append("." + variant);
		}
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MtId mtId = (MtId) o;
		return Objects.equals(businessProcess, mtId.businessProcess) &&
				Objects.equals(messageType, mtId.messageType) &&
				Objects.equals(variant, mtId.variant);
	}

	@Override
	public int hashCode() {
		return Objects.hash(businessProcess, messageType, variant);
	}
}
