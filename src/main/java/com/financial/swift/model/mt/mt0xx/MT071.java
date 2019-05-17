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
package com.financial.swift.model.mt.mt0xx;



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
 * <strong>MT 071 - Undelivered SSI Update Notification Report</strong>
 *
 * <p>
 * SWIFT MT071 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="field">Field 202  (M)</li>
<li class="field">Field 203  (M)</li>
<li class="field">Field 171  (M)</li>
<li class="field">Field 175  (M)</li>
<li class="field">Field 251  (M)</li>
<li class="field">Field 209  (M)</li>
<li class="sequence">
Sequence _A - Information on undelivered MTs 671 (O) (repetitive)<ul><li class="field">Field 102  (M)</li>
<li class="field">Field 431  (M)</li>
<li class="field">Field 281  (O) (repetitive)</li>
</ul></li>
<li class="sequence">
Sequence _B - Count of undelivered MTs 671 (O)<ul><li class="sequence">
Sequence _B1 - Message count (O)<ul><li class="field">Field 313  (O)</li>
</ul></li>
<li class="sequence">
Sequence _B2 - Report code (O)<ul><li class="field">Field 461  (O)</li>
</ul></li>
</ul></li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT071 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT071.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "071";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value 1 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String _1 = "1";

	/**
	* Constant for qualifier with value 2 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String _2 = "2";

// end qualifiers constants	

	/**
	 * Creates an MT071 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT071 content
	 */
	public MT071(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT071 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT071 content, the parameter can not be null
	 * @see #MT071(String)
	 */
	public MT071(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT071 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT071 content
	 * @return the created object or null if the parameter is null
	 * @see #MT071(String)
	 * @since 7.7
	 */
	public static MT071 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT071(m);
	}
	
	/**
	 * Creates and initializes a new MT071 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT071() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT071 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT071(final String sender, final String receiver) {
		super(71, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT071(String, String)
	* @deprecated Use instead <code>new MT071(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT071(final int messageType, final String sender, final String receiver) {
		super(71, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT071(int, String, String)", "Use the constructor MT071(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT071 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT071(final String fin) {
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
			log.warning("Creating an MT071 object from FIN content with a Service Message. Check if the MT071 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT071 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT071 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT071 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT071 or null if fin is null 
	 * @since 7.7
	 */
	public static MT071 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT071(fin);
    }
    
    /**
	 * Creates a new MT071 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT071(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT071 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT071 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT071 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT071(stream);
    }
    
    /**
	 * Creates a new MT071 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT071(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT071 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT071 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT071 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT071(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "071";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT071 append(final SwiftTagListBlock block) {
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
	public MT071 append(final Tag ... tags) {
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
	public MT071 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT071 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT071 message
	 * @return a new instance of MT071
	 * @since 7.10.3
	 */
	public final static MT071 fromJson(String json) {
		return (MT071) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 202, 
	 * or null if none is found.<br>
	 * The first occurrence of field 202 at MT071 is expected to be the only one.
	 * 
	 * @return a Field202 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field202 getField202() {
		final Tag t = tag("202");
		if (t != null) {
			return new Field202(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 203, 
	 * or null if none is found.<br>
	 * The first occurrence of field 203 at MT071 is expected to be the only one.
	 * 
	 * @return a Field203 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field203 getField203() {
		final Tag t = tag("203");
		if (t != null) {
			return new Field203(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 171, 
	 * or null if none is found.<br>
	 * The first occurrence of field 171 at MT071 is expected to be the only one.
	 * 
	 * @return a Field171 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field171 getField171() {
		final Tag t = tag("171");
		if (t != null) {
			return new Field171(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 175, 
	 * or null if none is found.<br>
	 * The first occurrence of field 175 at MT071 is expected to be the only one.
	 * 
	 * @return a Field175 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field175 getField175() {
		final Tag t = tag("175");
		if (t != null) {
			return new Field175(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 251, 
	 * or null if none is found.<br>
	 * The first occurrence of field 251 at MT071 is expected to be the only one.
	 * 
	 * @return a Field251 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field251 getField251() {
		final Tag t = tag("251");
		if (t != null) {
			return new Field251(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 209, 
	 * or null if none is found.<br>
	 * The first occurrence of field 209 at MT071 is expected to be the only one.
	 * 
	 * @return a Field209 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field209 getField209() {
		final Tag t = tag("209");
		if (t != null) {
			return new Field209(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 313, 
	 * or null if none is found.<br>
	 * The first occurrence of field 313 at MT071 is expected to be the only one.
	 * 
	 * @return a Field313 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field313 getField313() {
		final Tag t = tag("313");
		if (t != null) {
			return new Field313(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 461, 
	 * or null if none is found.<br>
	 * The first occurrence of field 461 at MT071 is expected to be the only one.
	 * 
	 * @return a Field461 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field461 getField461() {
		final Tag t = tag("461");
		if (t != null) {
			return new Field461(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 102, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 102 at MT071 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field102 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field102> getField102() {
		final List<Field102> result = new ArrayList<Field102>();
		final Tag[] tags = tags("102");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field102(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 431, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 431 at MT071 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field431 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field431> getField431() {
		final List<Field431> result = new ArrayList<Field431>();
		final Tag[] tags = tags("431");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field431(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 281, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 281 at MT071 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field281 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field281> getField281() {
		final List<Field281> result = new ArrayList<Field281>();
		final Tag[] tags = tags("281");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field281(tag.getValue()));
            }
		}
		return result;
	}
	



}