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
package com.financial.swift.model.mt.mt5xx;



import com.financial.Generated;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

import com.financial.swift.model.*;
import com.financial.swift.internal.*;
import com.financial.swift.internal.SequenceStyle.Type;
import com.financial.swift.model.field.*;
import com.financial.swift.model.mt.AbstractMT;
import com.financial.swift.utils.Lib;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;

/**
 * <strong>MT 549 - Request for Statement/Status Advice</strong>
 *
 * <p>
 * SWIFT MT549 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="sequence">
Sequence A - General Information (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 23 G (M)</li>
<li class="field">Field 98 A,C (O)</li>
<li class="field">Field 69 A,B (O)</li>
<li class="field">Field 13 A (M)</li>
<li class="fieldset">
Fieldset 95
 (O)<ul><li>FieldsetItem 95 P,R (O)</li><li>FieldsetItem 95 L (O)</li></ul></li><li class="field">Field 97 A,B (M)</li>
<li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="sequence">
Sequence A1 - Linkages (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 13 A,B (O)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B - Statement by Status/Reason and/or by Financial Instrument (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 25 D (O)</li>
<li class="fieldset">
Fieldset 24
 (O) (repetitive)<ul><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li><li>FieldsetItem 24 B (O) (repetitive)</li></ul></li><li class="field">Field 35 B (O) (repetitive)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C - By Instruction Reference (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 20 C (M) (repetitive)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence D - Additional Information (O)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 95
 (O) (repetitive)<ul><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT549 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT549.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "549";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ACOW 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACOW = "ACOW";

	/**
	* Constant for qualifier with value ADDINFO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADDINFO = "ADDINFO";

	/**
	* Constant for qualifier with value AFFM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AFFM = "AFFM";

	/**
	* Constant for qualifier with value ALOC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ALOC = "ALOC";

	/**
	* Constant for qualifier with value ALTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ALTE = "ALTE";

	/**
	* Constant for qualifier with value BASK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BASK = "BASK";

	/**
	* Constant for qualifier with value BYSTAREA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BYSTAREA = "BYSTAREA";

	/**
	* Constant for qualifier with value CACK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CACK = "CACK";

	/**
	* Constant for qualifier with value CALL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CALL = "CALL";

	/**
	* Constant for qualifier with value CANC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CANC = "CANC";

	/**
	* Constant for qualifier with value CAND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAND = "CAND";

	/**
	* Constant for qualifier with value CANP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CANP = "CANP";

	/**
	* Constant for qualifier with value CGEN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CGEN = "CGEN";

	/**
	* Constant for qualifier with value CODE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODE = "CODE";

	/**
	* Constant for qualifier with value CODU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODU = "CODU";

	/**
	* Constant for qualifier with value COMM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COMM = "COMM";

	/**
	* Constant for qualifier with value COPY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COPY = "COPY";

	/**
	* Constant for qualifier with value CORP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CORP = "CORP";

	/**
	* Constant for qualifier with value CPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CPRC = "CPRC";

	/**
	* Constant for qualifier with value DEND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEND = "DEND";

	/**
	* Constant for qualifier with value DUPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DUPL = "DUPL";

	/**
	* Constant for qualifier with value EPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EPRC = "EPRC";

	/**
	* Constant for qualifier with value ESTA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ESTA = "ESTA";

	/**
	* Constant for qualifier with value GENL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GENL = "GENL";

	/**
	* Constant for qualifier with value INDX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDX = "INDX";

	/**
	* Constant for qualifier with value INMH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INMH = "INMH";

	/**
	* Constant for qualifier with value IPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String IPRC = "IPRC";

	/**
	* Constant for qualifier with value LINK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LINK = "LINK";

	/**
	* Constant for qualifier with value LIST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LIST = "LIST";

	/**
	* Constant for qualifier with value MAST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAST = "MAST";

	/**
	* Constant for qualifier with value MEOR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MEOR = "MEOR";

	/**
	* Constant for qualifier with value MERE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MERE = "MERE";

	/**
	* Constant for qualifier with value MITI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MITI = "MITI";

	/**
	* Constant for qualifier with value MOPN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MOPN = "MOPN";

	/**
	* Constant for qualifier with value MTCH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MTCH = "MTCH";

	/**
	* Constant for qualifier with value NAFI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NAFI = "NAFI";

	/**
	* Constant for qualifier with value NEWM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NEWM = "NEWM";

	/**
	* Constant for qualifier with value NMAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NMAT = "NMAT";

	/**
	* Constant for qualifier with value PACK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PACK = "PACK";

	/**
	* Constant for qualifier with value PCTI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PCTI = "PCTI";

	/**
	* Constant for qualifier with value PEND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PEND = "PEND";

	/**
	* Constant for qualifier with value PENF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PENF = "PENF";

	/**
	* Constant for qualifier with value POOL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String POOL = "POOL";

	/**
	* Constant for qualifier with value PPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PPRC = "PPRC";

	/**
	* Constant for qualifier with value PREV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PREV = "PREV";

	/**
	* Constant for qualifier with value PROG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROG = "PROG";

	/**
	* Constant for qualifier with value REF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REF = "REF";

	/**
	* Constant for qualifier with value REJT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REJT = "REJT";

	/**
	* Constant for qualifier with value RELA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RELA = "RELA";

	/**
	* Constant for qualifier with value REPR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPR = "REPR";

	/**
	* Constant for qualifier with value REQU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REQU = "REQU";

	/**
	* Constant for qualifier with value RERC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RERC = "RERC";

	/**
	* Constant for qualifier with value REST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REST = "REST";

	/**
	* Constant for qualifier with value RPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RPRC = "RPRC";

	/**
	* Constant for qualifier with value SAFE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SAFE = "SAFE";

	/**
	* Constant for qualifier with value SEME 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SEME = "SEME";

	/**
	* Constant for qualifier with value SETT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETT = "SETT";

	/**
	* Constant for qualifier with value SFRE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SFRE = "SFRE";

	/**
	* Constant for qualifier with value STAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STAT = "STAT";

	/**
	* Constant for qualifier with value STBA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STBA = "STBA";

	/**
	* Constant for qualifier with value STTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STTY = "STTY";

	/**
	* Constant for qualifier with value TPRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TPRC = "TPRC";

	/**
	* Constant for qualifier with value TRRF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRRF = "TRRF";

// end qualifiers constants	

	/**
	 * Creates an MT549 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT549 content
	 */
	public MT549(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT549 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT549 content, the parameter can not be null
	 * @see #MT549(String)
	 */
	public MT549(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT549 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT549 content
	 * @return the created object or null if the parameter is null
	 * @see #MT549(String)
	 * @since 7.7
	 */
	public static MT549 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT549(m);
	}
	
	/**
	 * Creates and initializes a new MT549 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT549() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT549 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT549(final String sender, final String receiver) {
		super(549, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT549(String, String)
	* @deprecated Use instead <code>new MT549(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT549(final int messageType, final String sender, final String receiver) {
		super(549, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT549(int, String, String)", "Use the constructor MT549(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT549 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT549(final String fin) {
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
			log.warning("Creating an MT549 object from FIN content with a Service Message. Check if the MT549 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT549 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT549 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT549 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT549 or null if fin is null 
	 * @since 7.7
	 */
	public static MT549 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT549(fin);
    }
    
    /**
	 * Creates a new MT549 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT549(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT549 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT549 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT549 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT549(stream);
    }
    
    /**
	 * Creates a new MT549 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT549(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT549 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT549 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT549 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT549(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "549";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT549 append(final SwiftTagListBlock block) {
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
	public MT549 append(final Tag ... tags) {
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
	public MT549 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT549 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT549 message
	 * @return a new instance of MT549
	 * @since 7.10.3
	 */
	public final static MT549 fromJson(String json) {
		return (MT549) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or null if none is found.<br>
	 * The first occurrence of field 23G at MT549 is expected to be the only one.
	 * 
	 * @return a Field23G object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field23G getField23G() {
		final Tag t = tag("23G");
		if (t != null) {
			return new Field23G(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98A, 
	 * or null if none is found.<br>
	 * The first occurrence of field 98A at MT549 is expected to be the only one.
	 * 
	 * @return a Field98A object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98A getField98A() {
		final Tag t = tag("98A");
		if (t != null) {
			return new Field98A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 98C, 
	 * or null if none is found.<br>
	 * The first occurrence of field 98C at MT549 is expected to be the only one.
	 * 
	 * @return a Field98C object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98C getField98C() {
		final Tag t = tag("98C");
		if (t != null) {
			return new Field98C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 69A, 
	 * or null if none is found.<br>
	 * The first occurrence of field 69A at MT549 is expected to be the only one.
	 * 
	 * @return a Field69A object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field69A getField69A() {
		final Tag t = tag("69A");
		if (t != null) {
			return new Field69A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 69B, 
	 * or null if none is found.<br>
	 * The first occurrence of field 69B at MT549 is expected to be the only one.
	 * 
	 * @return a Field69B object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field69B getField69B() {
		final Tag t = tag("69B");
		if (t != null) {
			return new Field69B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 97A, 
	 * or null if none is found.<br>
	 * The first occurrence of field 97A at MT549 is expected to be the only one.
	 * 
	 * @return a Field97A object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field97A getField97A() {
		final Tag t = tag("97A");
		if (t != null) {
			return new Field97A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 97B, 
	 * or null if none is found.<br>
	 * The first occurrence of field 97B at MT549 is expected to be the only one.
	 * 
	 * @return a Field97B object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field97B getField97B() {
		final Tag t = tag("97B");
		if (t != null) {
			return new Field97B(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95P at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95P> getField95P() {
		final List<Field95P> result = new ArrayList<Field95P>();
		final Tag[] tags = tags("95P");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95P(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95R at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95R> getField95R() {
		final List<Field95R> result = new ArrayList<Field95R>();
		final Tag[] tags = tags("95R");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95R(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95L at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95L> getField95L() {
		final List<Field95L> result = new ArrayList<Field95L>();
		final Tag[] tags = tags("95L");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95L(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 22F at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22F> getField22F() {
		final List<Field22F> result = new ArrayList<Field22F>();
		final Tag[] tags = tags("22F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field22F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 16R at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16R> getField16R() {
		final List<Field16R> result = new ArrayList<Field16R>();
		final Tag[] tags = tags("16R");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field16R(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 13A at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13A> getField13A() {
		final List<Field13A> result = new ArrayList<Field13A>();
		final Tag[] tags = tags("13A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field13A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 13B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 13B at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field13B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field13B> getField13B() {
		final List<Field13B> result = new ArrayList<Field13B>();
		final Tag[] tags = tags("13B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field13B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 20C at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field20C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field20C> getField20C() {
		final List<Field20C> result = new ArrayList<Field20C>();
		final Tag[] tags = tags("20C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field20C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 16S at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field16S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field16S> getField16S() {
		final List<Field16S> result = new ArrayList<Field16S>();
		final Tag[] tags = tags("16S");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field16S(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 25D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 25D at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field25D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field25D> getField25D() {
		final List<Field25D> result = new ArrayList<Field25D>();
		final Tag[] tags = tags("25D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field25D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 24B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 24B at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field24B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field24B> getField24B() {
		final List<Field24B> result = new ArrayList<Field24B>();
		final Tag[] tags = tags("24B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field24B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 35B at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field35B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field35B> getField35B() {
		final List<Field35B> result = new ArrayList<Field35B>();
		final Tag[] tags = tags("35B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field35B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95Q at MT549 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95Q objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95Q> getField95Q() {
		final List<Field95Q> result = new ArrayList<Field95Q>();
		final Tag[] tags = tags("95Q");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95Q(tag.getValue()));
            }
		}
		return result;
	}
	

// BaseSequenceCodeGenerator [seq=A]
	/**
	 * Class to model Sequence "A" in MT 549
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceA extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceA() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceA(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>GENL</em>
		 */
		public static final String START_END_16RS = "GENL";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA newInstance(final Tag ... tags) {
			final SequenceA result = new SequenceA();
			result.append(START_TAG);
			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create an empty $sequenceClassname.
		 * This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		 * @return a new instance of the sequence
		 * @since 7.6
		 */
		public static SequenceA newInstance() {
			final SequenceA result = new SequenceA();
			result.append(START_TAG);
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		 * Mainly intended to create a sequence by adding subsequences
		 * @param sequences a list of blocks to set as the new sequence content
		 * @return a new instance of the sequence, initialized with the parameter sequences content
		 * @since 7.6
		 */
		public static SequenceA newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA result = new SequenceA();
			result.append(START_TAG);
			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}
			result.append(END_TAG);
			return result;
		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}
	/**
	 * Get the single occurrence of SequenceA delimited by 16R/16S the value of SequenceA#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceA#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceA getSequenceA() {
		return new SequenceA(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceA delimited by 16R/16S the value of SequenceA#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceA#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceA within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceA getSequenceA(SwiftTagListBlock parentSequence) {
		final SequenceA s = new SequenceA();
		s.setTags(parentSequence.getSubBlock(SequenceA.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=A1]
	/**
	 * Class to model Sequence "A1" in MT 549
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceA1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceA1() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceA1(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>LINK</em>
		 */
		public static final String START_END_16RS = "LINK";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceA1 newInstance(final Tag ... tags) {
			final SequenceA1 result = new SequenceA1();
			result.append(START_TAG);
			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create an empty $sequenceClassname.
		 * This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		 * @return a new instance of the sequence
		 * @since 7.6
		 */
		public static SequenceA1 newInstance() {
			final SequenceA1 result = new SequenceA1();
			result.append(START_TAG);
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		 * Mainly intended to create a sequence by adding subsequences
		 * @param sequences a list of blocks to set as the new sequence content
		 * @return a new instance of the sequence, initialized with the parameter sequences content
		 * @since 7.6
		 */
		public static SequenceA1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceA1 result = new SequenceA1();
			result.append(START_TAG);
			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}
			result.append(END_TAG);
			return result;
		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceA1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceA1 delimited by 16R/16S with value specified in SequenceA1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceA1#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceA1> getSequenceA1List() {
		return getSequenceA1List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceA1 delimited by 16R/16S with value specified in SequenceA1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceA1#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceA1 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceA1> getSequenceA1List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceA1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceA1> result = new ArrayList<SequenceA1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceA1 s = new SequenceA1();
				s.setTags(b.getSubBlock(SequenceA1.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B]
	/**
	 * Class to model Sequence "B" in MT 549
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceB() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceB(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>BYSTAREA</em>
		 */
		public static final String START_END_16RS = "BYSTAREA";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB newInstance(final Tag ... tags) {
			final SequenceB result = new SequenceB();
			result.append(START_TAG);
			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create an empty $sequenceClassname.
		 * This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		 * @return a new instance of the sequence
		 * @since 7.6
		 */
		public static SequenceB newInstance() {
			final SequenceB result = new SequenceB();
			result.append(START_TAG);
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		 * Mainly intended to create a sequence by adding subsequences
		 * @param sequences a list of blocks to set as the new sequence content
		 * @return a new instance of the sequence, initialized with the parameter sequences content
		 * @since 7.6
		 */
		public static SequenceB newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB result = new SequenceB();
			result.append(START_TAG);
			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}
			result.append(END_TAG);
			return result;
		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceB(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceB delimited by 16R/16S with value specified in SequenceB#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceB#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceB> getSequenceBList() {
		return getSequenceBList(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceB delimited by 16R/16S with value specified in SequenceB#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceB#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceB> getSequenceBList(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceB.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB> result = new ArrayList<SequenceB>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceB s = new SequenceB();
				s.setTags(b.getSubBlock(SequenceB.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C]
	/**
	 * Class to model Sequence "C" in MT 549
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceC extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceC() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceC(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>REF</em>
		 */
		public static final String START_END_16RS = "REF";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC newInstance(final Tag ... tags) {
			final SequenceC result = new SequenceC();
			result.append(START_TAG);
			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create an empty $sequenceClassname.
		 * This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		 * @return a new instance of the sequence
		 * @since 7.6
		 */
		public static SequenceC newInstance() {
			final SequenceC result = new SequenceC();
			result.append(START_TAG);
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		 * Mainly intended to create a sequence by adding subsequences
		 * @param sequences a list of blocks to set as the new sequence content
		 * @return a new instance of the sequence, initialized with the parameter sequences content
		 * @since 7.6
		 */
		public static SequenceC newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC result = new SequenceC();
			result.append(START_TAG);
			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}
			result.append(END_TAG);
			return result;
		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceC(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceC delimited by 16R/16S with value specified in SequenceC#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceC#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC> getSequenceCList() {
		return getSequenceCList(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceC delimited by 16R/16S with value specified in SequenceC#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceC#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceC within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceC> getSequenceCList(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceC.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC> result = new ArrayList<SequenceC>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceC s = new SequenceC();
				s.setTags(b.getSubBlock(SequenceC.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=D]
	/**
	 * Class to model Sequence "D" in MT 549
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceD extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceD() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceD(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ADDINFO</em>
		 */
		public static final String START_END_16RS = "ADDINFO";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceD newInstance(final Tag ... tags) {
			final SequenceD result = new SequenceD();
			result.append(START_TAG);
			if (tags != null && tags.length > 0) {
				for (final Tag t : tags) {
					result.append(t);
				}
			}
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create an empty $sequenceClassname.
		 * This method is intended to avoid disambiguation for the newInstance() with variable list of blocks or tags
		 * @return a new instance of the sequence
		 * @since 7.6
		 */
		public static SequenceD newInstance() {
			final SequenceD result = new SequenceD();
			result.append(START_TAG);
			result.append(END_TAG);
			return result;
		}

		/**
		 * Create a new instance of $sequenceClassname and add the contents of all sequences given inside.
		 * Mainly intended to create a sequence by adding subsequences
		 * @param sequences a list of blocks to set as the new sequence content
		 * @return a new instance of the sequence, initialized with the parameter sequences content
		 * @since 7.6
		 */
		public static SequenceD newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceD result = new SequenceD();
			result.append(START_TAG);
			if (sequences != null && sequences.length > 0) {
				for (final SwiftTagListBlock s : sequences) {
					result.addTags(s.getTags());
				}
			}
			result.append(END_TAG);
			return result;
		}

		@SequenceStyle(Type.GENERATED_16RS)
		private SequenceD(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}
	/**
	 * Get the single occurrence of SequenceD delimited by 16R/16S the value of SequenceD#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceD#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceD getSequenceD() {
		return new SequenceD(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceD delimited by 16R/16S the value of SequenceD#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceD#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceD within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceD getSequenceD(SwiftTagListBlock parentSequence) {
		final SequenceD s = new SequenceD();
		s.setTags(parentSequence.getSubBlock(SequenceD.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator




}
