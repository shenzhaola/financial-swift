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
 package com.financial.swift.model.field;

import com.financial.swift.model.Tag;
import com.financial.Generated;
import com.financial.deprecation.ProwideDeprecated;
import com.financial.deprecation.TargetYear;

import java.io.Serializable;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

import com.financial.swift.model.field.SwiftParseUtils;
import com.financial.swift.model.field.Field;
import com.financial.swift.model.*;
import com.financial.swift.utils.SwiftFormatUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * <strong>SWIFT MT Field 49H</strong>
 * <p>
 * Model and parser for field 49H of a SWIFT MT message.
 *
 * <p>Subfields (components) Data types
 * <ol> 
 * 		<li><code>String</code></li> 
 * </ol>
 *
 * <p>Structure definition
 * <ul>
 * 		<li>validation pattern: <code>CUSTOM</code></li>
 * 		<li>parser pattern: <code>S</code></li>
 * 		<li>components pattern: <code>S</code></li>
 * </ul>
 *		 
 * <p>
 * This class complies with standard release <strong>SRU2018</strong>
 */
@SuppressWarnings("unused") 
@Generated
public class Field49H extends Field implements Serializable, com.financial.swift.model.field.MultiLineField {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 49H
	 */
    public static final String NAME = "49H";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_49H = "49H";
	public static final String PARSER_PATTERN ="S";
	public static final String COMPONENTS_PATTERN = "S";

	/**
	 * Component number for the Narrative subfield
	 */
	public static final Integer NARRATIVE = 1;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field49H() {
		super(1);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field49H(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field49H(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "49H")) {
			throw new IllegalArgumentException("cannot create field 49H from tag "+tag.getName()+", tagname must match the name of the field.");
		}
		parse(tag.getValue());
	}
	
	/**
	 * Parses the parameter value into the internal components structure.
	 * <br>
	 * Used to update all components from a full new value, as an alternative
	 * to setting individual components. Previous component values are overwritten.
	 *
	 * @param value complete field value including separators and CRLF
	 * @since 7.8
	 */
	@Override
	public void parse(final String value) {
		init(1);
		setComponent1(value);
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field49H newInstance(Field49H source) {
		Field49H cp = new Field49H();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		append(result, 1);
		return result.toString();
	}

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}
	
	/**
	 * Gets the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Same as getComponent(1)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent1AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent1AsString()", "Use use #getComponent(int) instead.");
		return getComponent(1);
	}

	/**
	 * Gets the Narrative (component1).
	 * @return the Narrative from component1
	 */
	public String getNarrative() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field49H setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the Narrative (component1).
	 * @param component1 the Narrative to set
	 */
	public Field49H setNarrative(String component1) {
		setComponent(1, component1);
		return this;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br>
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	 * Returns the field's name composed by the field number and the letter option (if any)
	 * @return the static value of Field49H.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field49H.COMPONENTS_PATTERN
	 */
	@Override
	public final String componentsPattern() {
		return COMPONENTS_PATTERN;
	}

	/**
	 * Returns the field's validators pattern
	 */
	@Override
	public final String validatorPattern() {
		return "CUSTOM";
	}

	/**
	 * Gets the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field49H get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field49H(t) ;
	}
	
	/**
	 * Gets the first instance of Field49H in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field49H get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Gets a list of all occurrences of the field Field49H in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static List<Field49H> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Gets a list of all occurrences of the field Field49H from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static List<Field49H> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length > 0) {
			final List<Field49H> result = new ArrayList<Field49H>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field49H(f));
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	/**
	 * Returns the defined amount of components.<br>
	 * This is not the amount of components present in the field instance, but the total amount of components 
	 * that this field accepts as defined. 
	 * @since 7.7
	 */
	@Override
	public int componentsSize() {
		return 1;
	}
	
	/**
	 * Returns a specific line from the field's value.<br>
	 *
	 * @see MultiLineField#getLine(int)
	 * @param line a reference to a specific line in the field, first line being 1
	 * @return line content or null if not present or if line number is above the expected
	 * @since 7.7
	 */
	public String getLine(int line) {
		return getLine(line, 0);
	}
	
	/**
	 * Returns a specific line from the field's value.<br>
	 * 
	 * @see MultiLineField#getLine(int, int)
	 * @param line a reference to a specific line in the field, first line being 1
	 * @param offset an optional component number used as offset when counting lines
	 * @return line content or null if not present or if line number is above the expected
	 * @since 7.7
	 */
	public String getLine(int line, int offset) {
		Field49H cp = newInstance(this);
		return getLine(cp, line, null, offset);
	}
	
	/**
	 * Returns the field value split into lines.<br>
	 *
	 * @see MultiLineField#getLines()
	 * @return lines content or empty list if field's value is empty
	 * @since 7.7
	 */
	public List<String> getLines() {
		return SwiftParseUtils.getLines(getValue());
	}

	/**
	 * Returns the field value starting at the offset component, split into lines.<br>
	 *
	 * @see MultiLineField#getLines(int)
	 * @param offset an optional component number used as offset when counting lines
	 * @return found lines or empty list if lines are not present or the offset is invalid
	 * @since 7.7
	 */
	public List<String> getLines(int offset) {
		Field49H cp = newInstance(this);
		return SwiftParseUtils.getLines(getLine(cp, null, null, offset));
	}
	
	/**
	 * Returns a specific subset of lines from the field's value, given a range.<br>
	 *
	 * @see MultiLineField#getLinesBetween(int, int )
	 * @param start a reference to a specific line in the field, first line being 1
	 * @param end a reference to a specific line in the field, must be greater than start
	 * @return found lines or empty list if value is empty
	 * @since 7.7
	 */
	public List<String> getLinesBetween(int start, int end) {
		return getLinesBetween(start, end, 0);
	}

	/**
	 * Returns a specific subset of lines from the field's value, starting at the offset component.<br>
	 *
	 * @see MultiLineField#getLinesBetween(int start, int end, int offset)
	 * @param start a reference to a specific line in the field, first line being 1
	 * @param end a reference to a specific line in the field, must be greater than start
	 * @param offset an optional component number used as offset when counting lines
	 * @return found lines or empty list if lines are not present or the offset is invalid
	 * @since 7.7
	 */
	public List<String> getLinesBetween(int start, int end, int offset) {
		Field49H cp = newInstance(this);
		return SwiftParseUtils.getLines(getLine(cp, start, end, offset));
	}
	

	/**
	 * Returns a localized suitable for showing to humans string of a field component.<br>
	 *
	 * @param component number of the component to display
	 * @param locale optional locale to format date and amounts, if null, the default locale is used
	 * @return formatted component value or null if component number is invalid or not present
	 * @throws IllegalArgumentException if component number is invalid for the field
	 * @since 7.8
	 */
	@Override
	public String getValueDisplay(int component, Locale locale) {
		if (component < 1 || component > 1) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 49H");
		}
		if (component == 1) {
			//default format (as is)
			return getComponent(1);
		}
		return null;	
	}
	
	/**
	 * Returns english label for components.
	 * <br>
	 * The index in the list is in sync with specific field component structure.
	 * @see #getComponentLabel(int)
	 * @since 7.8.4
	 */
	@Override
	protected List<String> getComponentLabels() {
		List<String> result = new ArrayList<String>();
		result.add("Narrative");
		return result;
	}

	/**
	 * Returns a mapping between component numbers and their label in camel case format.
	 * @since 7.10.3
	 */
	protected Map<Integer, String> getComponentMap() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		result.put(1, "narrative");
		return result;
	}

	/**
	 * This method deserializes the JSON data into a Field49H object.
	 * @param json JSON structure including tuples with label and value for all field components
	 * @return a new field instance with the JSON data parsed into field components or an empty field id the JSON is invalid
	 * @since 7.10.3
	 * @see Field#fromJson(String)
	 */
	public static Field49H fromJson(final String json) {
		Field49H field = new Field49H();
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(json);
		if (jsonObject.get("narrative") != null) {
			field.setComponent1(jsonObject.get("narrative").getAsString());
		}
		return field;
	}
	

}