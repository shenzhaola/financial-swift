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
 * <strong>SWIFT MT Field 57D</strong>
 * <p>
 * Model and parser for field 57D of a SWIFT MT message.
 *
 * <p>Subfields (components) Data types
 * <ol> 
 * 		<li><code>String</code></li> 
 * 		<li><code>String</code></li> 
 * 		<li><code>String</code></li> 
 * 		<li><code>String</code></li> 
 * 		<li><code>String</code></li> 
 * 		<li><code>String</code></li> 
 * </ol>
 *
 * <p>Structure definition
 * <ul>
 * 		<li>validation pattern: <code>[[/&lt;DC&gt;][/34x]$]35x[$35x]0-3</code></li>
 * 		<li>parser pattern: <code>[[/c][/S]$]S[$S]0-3</code></li>
 * 		<li>components pattern: <code>SSSSSS</code></li>
 * </ul>
 *		 
 * <p>
 * This class complies with standard release <strong>SRU2018</strong>
 */
@SuppressWarnings("unused") 
@Generated
public class Field57D extends Field implements Serializable, com.financial.swift.model.field.MultiLineField {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 57D
	 */
    public static final String NAME = "57D";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_57D = "57D";
	public static final String PARSER_PATTERN ="[[/c][/S]$]S[$S]0-3";
	public static final String COMPONENTS_PATTERN = "SSSSSS";

	/**
	 * Component number for the D/C Mark subfield
	 */
	public static final Integer DC_MARK = 1;

	/**
	 * Component number for the Account subfield
	 */
	public static final Integer ACCOUNT = 2;

	/**
	 * Component number for the Name And Address subfield
	 */
	public static final Integer NAME_AND_ADDRESS = 3;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field57D() {
		super(6);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field57D(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field57D(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "57D")) {
			throw new IllegalArgumentException("cannot create field 57D from tag "+tag.getName()+", tagname must match the name of the field.");
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
		init(6);
		List<String> lines = SwiftParseUtils.getLines(value);
		if (lines.isEmpty()) {
			return;
		}
		if (lines.get(0).startsWith("/")) {
			String dcMark = SwiftParseUtils.getTokenFirst(lines.get(0), "/", "/");
			if (StringUtils.isNotEmpty(dcMark) && dcMark.length() == 1) {
				setComponent1(dcMark);
				setComponent2(SwiftParseUtils.getTokenSecondLast(StringUtils.substring(lines.get(0), 1), "/"));
			} else {
				setComponent2(StringUtils.substring(lines.get(0), 1));
			}
			SwiftParseUtils.setComponentsFromLines(this, 3, null, 1, lines);
		} else {
			SwiftParseUtils.setComponentsFromLines(this, 3, null, 0, lines);
		}
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field57D newInstance(Field57D source) {
		Field57D cp = new Field57D();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		if (getComponent1() != null) {
			result.append("/").append(getComponent1());
		}
		if (getComponent2() != null) {
			result.append("/").append(getComponent2());
		}
		appendInLines(result, 3, 6);
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
	 * Gets the D/C Mark (component1).
	 * @return the D/C Mark from component1
	 */
	public String getDCMark() {
		return getComponent(1);
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field57D setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the D/C Mark (component1).
	 * @param component1 the D/C Mark to set
	 */
	public Field57D setDCMark(String component1) {
		setComponent(1, component1);
		return this;
	}
	/**
	 * Gets the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Same as getComponent(2)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent2AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent2AsString()", "Use use #getComponent(int) instead.");
		return getComponent(2);
	}

	/**
	 * Gets the Account (component2) removing its starting slashes if any.
	 * @return the Account from component2
	 */
	public String getAccount() {
		String c = getComponent(2);
		if (c != null) {
			for (int i=0; i<c.length(); i++) {
				if (c.charAt(i) != '/') {
					return c.substring(i);
				}
			}
			return "";
		}
		return null;
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field57D setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Account (component2).
	 * @param component2 the Account to set
	 */
	public Field57D setAccount(String component2) {
		setComponent(2, component2);
		return this;
	}
	/**
	 * Gets the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Same as getComponent(3)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent3AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent3AsString()", "Use use #getComponent(int) instead.");
		return getComponent(3);
	}

	/**
	 * Gets the Name And Address (component3).
	 * @return the Name And Address from component3
	 */
	public String getNameAndAddressLine1() {
		return getComponent(3);
	}

	/**
	 * Gets the Name And Address (component4).
	 * @return the Name And Address from component4
	 */
	public String getNameAndAddressLine2() {
		return getComponent(4);
	}

	/**
	 * Gets the Name And Address (component5).
	 * @return the Name And Address from component5
	 */
	public String getNameAndAddressLine3() {
		return getComponent(5);
	}

	/**
	 * Gets the Name And Address (component6).
	 * @return the Name And Address from component6
	 */
	public String getNameAndAddressLine4() {
		return getComponent(6);
	}

	/**
	 * Gets the Name And Address as a concatenation of component3 to component6.
	 * @return the Name And Address from components
	 */
	public String getNameAndAddress() {
		StringBuilder result = new StringBuilder();
		for (int i = 3 ; i < 7 ; i++) {
			if (StringUtils.isNotBlank(getComponent(i))) {
				if (result.length() > 0) {
					result.append(com.financial.swift.io.writer.FINWriterVisitor.SWIFT_EOL);
				}
				result.append(StringUtils.trimToEmpty(getComponent(i)));
			}
		}
		return result.toString();
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field57D setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}

	/**
	 * Set the Name And Address (component3).
	 * @param component3 the Name And Address to set
	 */
	public Field57D setNameAndAddressLine1(String component3) {
		setComponent(3, component3);
		return this;
	}

	/**
	 * Set the Name And Address (component4).
	 * @param component4 the Name And Address to set
	 */
	public Field57D setNameAndAddressLine2(String component4) {
		setComponent(4, component4);
		return this;
	}

	/**
	 * Set the Name And Address (component5).
	 * @param component5 the Name And Address to set
	 */
	public Field57D setNameAndAddressLine3(String component5) {
		setComponent(5, component5);
		return this;
	}

	/**
	 * Set the Name And Address (component6).
	 * @param component6 the Name And Address to set
	 */
	public Field57D setNameAndAddressLine4(String component6) {
		setComponent(6, component6);
		return this;
	}

	/**
	 * Set the Name And Address splitting the parameter lines into components 3 to 6.
	 * @param value the Name And Address to set, may contain line ends and each line will be set to its correspondent component attribute
	 */
	public Field57D setNameAndAddress(String value) {
		List<String> lines = SwiftParseUtils.getLines(value);
		SwiftParseUtils.setComponentsFromLines(this, 3, 4, 0, lines);
		return this;
	}
	/**
	 * Gets the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Same as getComponent(4)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent4AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent4AsString()", "Use use #getComponent(int) instead.");
		return getComponent(4);
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field57D setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	/**
	 * Gets the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Same as getComponent(5)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent5AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent5AsString()", "Use use #getComponent(int) instead.");
		return getComponent(5);
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field57D setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	/**
	 * Gets the component6
	 * @return the component6
	 */
	public String getComponent6() {
		return getComponent(6);
	}

	/**
	 * Same as getComponent(6)
	 * @deprecated use {@link #getComponent(int)} instead
	 */
	@Deprecated
	@ProwideDeprecated(phase3=TargetYear._2019)
	public java.lang.String getComponent6AsString() {
		com.financial.deprecation.DeprecationUtils.phase2(getClass(), "getComponent6AsString()", "Use use #getComponent(int) instead.");
		return getComponent(6);
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field57D setComponent6(String component6) {
		setComponent(6, component6);
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
       if (component == 1) {
           return true;
       }
       if (component == 2) {
           return true;
       }
       if (component == 4) {
           return true;
       }
       if (component == 5) {
           return true;
       }
       if (component == 6) {
           return true;
       }
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
	 * @return the static value of Field57D.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field57D.COMPONENTS_PATTERN
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
		return "[[/<DC>][/34x]$]35x[$35x]0-3";
	}

	/**
	 * Gets the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field57D get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field57D(t) ;
	}
	
	/**
	 * Gets the first instance of Field57D in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field57D get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Gets a list of all occurrences of the field Field57D in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static List<Field57D> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Gets a list of all occurrences of the field Field57D from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static List<Field57D> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length > 0) {
			final List<Field57D> result = new ArrayList<Field57D>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field57D(f));
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
		return 6;
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
		Field57D cp = newInstance(this);
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
		Field57D cp = newInstance(this);
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
		Field57D cp = newInstance(this);
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
		if (component < 1 || component > 6) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 57D");
		}
		if (component == 1) {
			//default format (as is)
			return getComponent(1);
		}
		if (component == 2) {
			//default format (as is)
			return getComponent(2);
		}
		if (component == 3) {
			//default format (as is)
			return getComponent(3);
		}
		if (component == 4) {
			//default format (as is)
			return getComponent(4);
		}
		if (component == 5) {
			//default format (as is)
			return getComponent(5);
		}
		if (component == 6) {
			//default format (as is)
			return getComponent(6);
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
		result.add("D/C Mark");
		result.add("Account");
		result.add("Name And Address");
		result.add("Name And Address 2");
		result.add("Name And Address 3");
		result.add("Name And Address 4");
		return result;
	}

	/**
	 * Returns a mapping between component numbers and their label in camel case format.
	 * @since 7.10.3
	 */
	protected Map<Integer, String> getComponentMap() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		result.put(1, "dCMark");
		result.put(2, "account");
		result.put(3, "nameAndAddress");
		result.put(4, "nameAndAddress2");
		result.put(5, "nameAndAddress3");
		result.put(6, "nameAndAddress4");
		return result;
	}

	/**
	 * This method deserializes the JSON data into a Field57D object.
	 * @param json JSON structure including tuples with label and value for all field components
	 * @return a new field instance with the JSON data parsed into field components or an empty field id the JSON is invalid
	 * @since 7.10.3
	 * @see Field#fromJson(String)
	 */
	public static Field57D fromJson(final String json) {
		Field57D field = new Field57D();
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(json);
		if (jsonObject.get("dCMark") != null) {
			field.setComponent1(jsonObject.get("dCMark").getAsString());
		}
		if (jsonObject.get("account") != null) {
			field.setComponent2(jsonObject.get("account").getAsString());
		}
		if (jsonObject.get("nameAndAddress") != null) {
			field.setComponent3(jsonObject.get("nameAndAddress").getAsString());
		}
		if (jsonObject.get("nameAndAddress2") != null) {
			field.setComponent4(jsonObject.get("nameAndAddress2").getAsString());
		}
		if (jsonObject.get("nameAndAddress3") != null) {
			field.setComponent5(jsonObject.get("nameAndAddress3").getAsString());
		}
		if (jsonObject.get("nameAndAddress4") != null) {
			field.setComponent6(jsonObject.get("nameAndAddress4").getAsString());
		}
		return field;
	}
	

}
