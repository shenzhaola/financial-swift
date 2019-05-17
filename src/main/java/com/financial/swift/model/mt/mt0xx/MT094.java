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
 * <strong>MT 094 - Broadcast</strong>
 *
 * <p>
 * SWIFT MT094 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="field">Field 135  (M)</li>
<li class="field">Field 136  (O)</li>
<li class="field">Field 137  (O)</li>
<li class="field">Field 129  (O)</li>
<li class="field">Field 130  (M)</li>
<li class="field">Field 132  (O) (repetitive)</li>
<li class="field">Field 133  (O) (repetitive)</li>
<li class="field">Field 134  (M)</li>
<li class="field">Field 312  (M)</li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT094 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT094.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "094";
	
// begin qualifiers constants	

// end qualifiers constants	

	/**
	 * Creates an MT094 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT094 content
	 */
	public MT094(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT094 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT094 content, the parameter can not be null
	 * @see #MT094(String)
	 */
	public MT094(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT094 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT094 content
	 * @return the created object or null if the parameter is null
	 * @see #MT094(String)
	 * @since 7.7
	 */
	public static MT094 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT094(m);
	}
	
	/**
	 * Creates and initializes a new MT094 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT094() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT094 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT094(final String sender, final String receiver) {
		super(94, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT094(String, String)
	* @deprecated Use instead <code>new MT094(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT094(final int messageType, final String sender, final String receiver) {
		super(94, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT094(int, String, String)", "Use the constructor MT094(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT094 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT094(final String fin) {
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
			log.warning("Creating an MT094 object from FIN content with a Service Message. Check if the MT094 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT094 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT094 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT094 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT094 or null if fin is null 
	 * @since 7.7
	 */
	public static MT094 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT094(fin);
    }
    
    /**
	 * Creates a new MT094 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT094(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT094 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT094 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT094 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT094(stream);
    }
    
    /**
	 * Creates a new MT094 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT094(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT094 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT094 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT094 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT094(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "094";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT094 append(final SwiftTagListBlock block) {
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
	public MT094 append(final Tag ... tags) {
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
	public MT094 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT094 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT094 message
	 * @return a new instance of MT094
	 * @since 7.10.3
	 */
	public final static MT094 fromJson(String json) {
		return (MT094) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 135, 
	 * or null if none is found.<br>
	 * The first occurrence of field 135 at MT094 is expected to be the only one.
	 * 
	 * @return a Field135 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field135 getField135() {
		final Tag t = tag("135");
		if (t != null) {
			return new Field135(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 136, 
	 * or null if none is found.<br>
	 * The first occurrence of field 136 at MT094 is expected to be the only one.
	 * 
	 * @return a Field136 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field136 getField136() {
		final Tag t = tag("136");
		if (t != null) {
			return new Field136(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 137, 
	 * or null if none is found.<br>
	 * The first occurrence of field 137 at MT094 is expected to be the only one.
	 * 
	 * @return a Field137 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field137 getField137() {
		final Tag t = tag("137");
		if (t != null) {
			return new Field137(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 129, 
	 * or null if none is found.<br>
	 * The first occurrence of field 129 at MT094 is expected to be the only one.
	 * 
	 * @return a Field129 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field129 getField129() {
		final Tag t = tag("129");
		if (t != null) {
			return new Field129(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 130, 
	 * or null if none is found.<br>
	 * The first occurrence of field 130 at MT094 is expected to be the only one.
	 * 
	 * @return a Field130 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field130 getField130() {
		final Tag t = tag("130");
		if (t != null) {
			return new Field130(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 134, 
	 * or null if none is found.<br>
	 * The first occurrence of field 134 at MT094 is expected to be the only one.
	 * 
	 * @return a Field134 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field134 getField134() {
		final Tag t = tag("134");
		if (t != null) {
			return new Field134(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 312, 
	 * or null if none is found.<br>
	 * The first occurrence of field 312 at MT094 is expected to be the only one.
	 * 
	 * @return a Field312 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field312 getField312() {
		final Tag t = tag("312");
		if (t != null) {
			return new Field312(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 132, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 132 at MT094 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field132 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field132> getField132() {
		final List<Field132> result = new ArrayList<Field132>();
		final Tag[] tags = tags("132");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field132(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 133, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 133 at MT094 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field133 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field133> getField133() {
		final List<Field133> result = new ArrayList<Field133>();
		final Tag[] tags = tags("133");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field133(tag.getValue()));
            }
		}
		return result;
	}
	



}