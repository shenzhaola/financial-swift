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
package com.financial.swift.model.mt.mt9xx;



import com.financial.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.financial.swift.model.*;
import com.financial.swift.model.field.*;
import com.financial.swift.model.mt.AbstractMT;
import com.financial.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <strong>MT 942_RUR6 - Interim Transaction Report</strong>
 *
 * <p>
 * SWIFT MT942_RUR6 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="field">Field 20  (M)</li>
<li class="field">Field 21  (O)</li>
<li class="field">Field 25  (M)</li>
<li class="field">Field 28 C (M)</li>
<li class="field">Field 34 F (M) (repetitive)</li>
<li class="field">Field 13 D (M)</li>
<li class="sequence">
Sequence _A (O) (repetitive)<ul><li class="field">Field 61  (O)</li>
<li class="field">Field 86  (O)</li>
</ul></li>
<li class="field">Field 90 D (O)</li>
<li class="field">Field 90 C (O)</li>
<li class="field">Field 86  (O)</li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT942_RUR6 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT942_RUR6.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "942_RUR6";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value C 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String C = "C";

	/**
	* Constant for qualifier with value D 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String D = "D";

	/**
	* Constant for qualifier with value EC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EC = "EC";

	/**
	* Constant for qualifier with value ED 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ED = "ED";

	/**
	* Constant for qualifier with value F 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String F = "F";

	/**
	* Constant for qualifier with value N 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String N = "N";

	/**
	* Constant for qualifier with value RC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RC = "RC";

	/**
	* Constant for qualifier with value RD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RD = "RD";

	/**
	* Constant for qualifier with value S 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String S = "S";

// end qualifiers constants	

	/**
	 * Creates an MT942_RUR6 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT942_RUR6 content
	 */
	public MT942_RUR6(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT942_RUR6 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT942_RUR6 content, the parameter can not be null
	 * @see #MT942_RUR6(String)
	 */
	public MT942_RUR6(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT942_RUR6 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT942_RUR6 content
	 * @return the created object or null if the parameter is null
	 * @see #MT942_RUR6(String)
	 * @since 7.7
	 */
	public static MT942_RUR6 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT942_RUR6(m);
	}
	
	/**
	 * Creates and initializes a new MT942_RUR6 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT942_RUR6() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT942_RUR6 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT942_RUR6(final String sender, final String receiver) {
		super(942, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT942_RUR6(String, String)
	* @deprecated Use instead <code>new MT942_RUR6(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT942_RUR6(final int messageType, final String sender, final String receiver) {
		super(942, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT942_RUR6(int, String, String)", "Use the constructor MT942_RUR6(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT942_RUR6 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT942_RUR6(final String fin) {
		super();
		if (fin != null) {
			final SwiftMessage parsed = read(fin);
			if (parsed != null) {
				super.m = parsed;
				sanityCheck(parsed);
			}
		}
    }
    
    private void sanityCheck(final SwiftMessage param) {
    	if (param.isServiceMessage()) {
			log.warning("Creating an MT942_RUR6 object from FIN content with a Service Message. Check if the MT942_RUR6 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT942_RUR6 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT942_RUR6 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT942_RUR6 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT942_RUR6 or null if fin is null 
	 * @since 7.7
	 */
	public static MT942_RUR6 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT942_RUR6(fin);
    }
    
    /**
	 * Creates a new MT942_RUR6 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT942_RUR6(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT942_RUR6 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT942_RUR6 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT942_RUR6 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT942_RUR6(stream);
    }
    
    /**
	 * Creates a new MT942_RUR6 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT942_RUR6(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT942_RUR6 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT942_RUR6 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT942_RUR6 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT942_RUR6(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "942";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT942_RUR6 append(final SwiftTagListBlock block) {
		super.append(block);
		return this;
	}
	
	/**
	 * Add all tags to the end of the block4.
	 *
	 * @param tags to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT942_RUR6 append(final Tag ... tags) {
		super.append(tags);
		return this;
	}
	
	/**
	 * Add all the fields to the end of the block4.
	 *
	 * @param fields to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT942_RUR6 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT942_RUR6 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT942_RUR6 message
	 * @return a new instance of MT942_RUR6
	 * @since 7.10.3
	 */
	public final static MT942_RUR6 fromJson(String json) {
		return (MT942_RUR6) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or null if none is found.<br>
	 * The first occurrence of field 20 at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field20 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field20 getField20() {
		final Tag t = tag("20");
		if (t != null) {
			return new Field20(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 21, 
	 * or null if none is found.<br>
	 * The first occurrence of field 21 at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field21 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field21 getField21() {
		final Tag t = tag("21");
		if (t != null) {
			return new Field21(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 25, 
	 * or null if none is found.<br>
	 * The first occurrence of field 25 at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field25 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field25 getField25() {
		final Tag t = tag("25");
		if (t != null) {
			return new Field25(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 28C, 
	 * or null if none is found.<br>
	 * The first occurrence of field 28C at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field28C object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field28C getField28C() {
		final Tag t = tag("28C");
		if (t != null) {
			return new Field28C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 13D, 
	 * or null if none is found.<br>
	 * The first occurrence of field 13D at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field13D object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field13D getField13D() {
		final Tag t = tag("13D");
		if (t != null) {
			return new Field13D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 90D, 
	 * or null if none is found.<br>
	 * The first occurrence of field 90D at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field90D object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field90D getField90D() {
		final Tag t = tag("90D");
		if (t != null) {
			return new Field90D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 90C, 
	 * or null if none is found.<br>
	 * The first occurrence of field 90C at MT942_RUR6 is expected to be the only one.
	 * 
	 * @return a Field90C object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field90C getField90C() {
		final Tag t = tag("90C");
		if (t != null) {
			return new Field90C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 34F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 34F at MT942_RUR6 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field34F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field34F> getField34F() {
		final List<Field34F> result = new ArrayList<Field34F>();
		final Tag[] tags = tags("34F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field34F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 61, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 61 at MT942_RUR6 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field61 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field61> getField61() {
		final List<Field61> result = new ArrayList<Field61>();
		final Tag[] tags = tags("61");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field61(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 86 at MT942_RUR6 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86> getField86() {
		final List<Field86> result = new ArrayList<Field86>();
		final Tag[] tags = tags("86");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field86(tag.getValue()));
            }
		}
		return result;
	}
	



}
