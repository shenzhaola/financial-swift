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
package com.financial.swift.model.mt.mt6xx;



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
 * <strong>MT 605 - Commodity Notice to Receive</strong>
 *
 * <p>
 * SWIFT MT605 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="field">Field 20  (M)</li>
<li class="field">Field 26 C (M)</li>
<li class="field">Field 25  (O)</li>
<li class="field">Field 30  (M)</li>
<li class="field">Field 72  (O)</li>
<li class="sequence">
Sequence _A (M) (repetitive)<ul><li class="field">Field 21  (M)</li>
<li class="field">Field 23  (M)</li>
<li class="field">Field 26 D (O)</li>
<li class="field">Field 32 F (M)</li>
<li class="field">Field 82 A,B,D (O)</li>
<li class="field">Field 86 A,B,D (O)</li>
<li class="field">Field 87 A,B,D (M)</li>
<li class="field">Field 88 A,B,D (O)</li>
<li class="field">Field 72  (O)</li>
</ul></li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT605 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT605.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "605";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ALLOC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ALLOC = "ALLOC";

	/**
	* Constant for qualifier with value ALUM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ALUM = "ALUM";

	/**
	* Constant for qualifier with value AMEG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AMEG = "AMEG";

	/**
	* Constant for qualifier with value ANUG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ANUG = "ANUG";

	/**
	* Constant for qualifier with value BRIT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BRIT = "BRIT";

	/**
	* Constant for qualifier with value CFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CFR = "CFR";

	/**
	* Constant for qualifier with value CIF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CIF = "CIF";

	/**
	* Constant for qualifier with value CIP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CIP = "CIP";

	/**
	* Constant for qualifier with value COIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COIN = "COIN";

	/**
	* Constant for qualifier with value COPP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COPP = "COPP";

	/**
	* Constant for qualifier with value CORO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CORO = "CORO";

	/**
	* Constant for qualifier with value CPT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CPT = "CPT";

	/**
	* Constant for qualifier with value DAF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DAF = "DAF";

	/**
	* Constant for qualifier with value DDP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DDP = "DDP";

	/**
	* Constant for qualifier with value DDU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DDU = "DDU";

	/**
	* Constant for qualifier with value DEQ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEQ = "DEQ";

	/**
	* Constant for qualifier with value DES 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DES = "DES";

	/**
	* Constant for qualifier with value DTD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DTD = "DTD";

	/**
	* Constant for qualifier with value DUCA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DUCA = "DUCA";

	/**
	* Constant for qualifier with value EXW 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXW = "EXW";

	/**
	* Constant for qualifier with value FAS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FAS = "FAS";

	/**
	* Constant for qualifier with value FCA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FCA = "FCA";

	/**
	* Constant for qualifier with value FOB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FOB = "FOB";

	/**
	* Constant for qualifier with value FOZ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FOZ = "FOZ";

	/**
	* Constant for qualifier with value FRFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FRFR = "FRFR";

	/**
	* Constant for qualifier with value GECU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GECU = "GECU";

	/**
	* Constant for qualifier with value GOLD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GOLD = "GOLD";

	/**
	* Constant for qualifier with value GOZ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GOZ = "GOZ";

	/**
	* Constant for qualifier with value GRM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GRM = "GRM";

	/**
	* Constant for qualifier with value IRID 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String IRID = "IRID";

	/**
	* Constant for qualifier with value KLO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String KLO = "KLO";

	/**
	* Constant for qualifier with value KRUG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String KRUG = "KRUG";

	/**
	* Constant for qualifier with value LBTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LBTY = "LBTY";

	/**
	* Constant for qualifier with value LEAD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LEAD = "LEAD";

	/**
	* Constant for qualifier with value LIT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LIT = "LIT";

	/**
	* Constant for qualifier with value LOC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOC = "LOC";

	/**
	* Constant for qualifier with value LOT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOT = "LOT";

	/**
	* Constant for qualifier with value MAPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAPL = "MAPL";

	/**
	* Constant for qualifier with value MEXP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MEXP = "MEXP";

	/**
	* Constant for qualifier with value NBUF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NBUF = "NBUF";

	/**
	* Constant for qualifier with value NICK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NICK = "NICK";

	/**
	* Constant for qualifier with value NOBL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NOBL = "NOBL";

	/**
	* Constant for qualifier with value NSOV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NSOV = "NSOV";

	/**
	* Constant for qualifier with value OSMI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OSMI = "OSMI";

	/**
	* Constant for qualifier with value OSOV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OSOV = "OSOV";

	/**
	* Constant for qualifier with value OTH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OTH = "OTH";

	/**
	* Constant for qualifier with value OTHR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OTHR = "OTHR";

	/**
	* Constant for qualifier with value PALL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PALL = "PALL";

	/**
	* Constant for qualifier with value PLAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PLAT = "PLAT";

	/**
	* Constant for qualifier with value PND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PND = "PND";

	/**
	* Constant for qualifier with value POIL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String POIL = "POIL";

	/**
	* Constant for qualifier with value RHOD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RHOD = "RHOD";

	/**
	* Constant for qualifier with value RUTH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RUTH = "RUTH";

	/**
	* Constant for qualifier with value SAEG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SAEG = "SAEG";

	/**
	* Constant for qualifier with value SECU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SECU = "SECU";

	/**
	* Constant for qualifier with value SILV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SILV = "SILV";

	/**
	* Constant for qualifier with value STAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STAT = "STAT";

	/**
	* Constant for qualifier with value STEE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STEE = "STEE";

	/**
	* Constant for qualifier with value TAL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAL = "TAL";

	/**
	* Constant for qualifier with value TINA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TINA = "TINA";

	/**
	* Constant for qualifier with value TITA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TITA = "TITA";

	/**
	* Constant for qualifier with value TOL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TOL = "TOL";

	/**
	* Constant for qualifier with value TON 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TON = "TON";

	/**
	* Constant for qualifier with value TOZ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TOZ = "TOZ";

	/**
	* Constant for qualifier with value UNALL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNALL = "UNALL";

	/**
	* Constant for qualifier with value UNT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNT = "UNT";

	/**
	* Constant for qualifier with value VREN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VREN = "VREN";

	/**
	* Constant for qualifier with value ZINC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ZINC = "ZINC";

// end qualifiers constants	

	/**
	 * Creates an MT605 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT605 content
	 */
	public MT605(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT605 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT605 content, the parameter can not be null
	 * @see #MT605(String)
	 */
	public MT605(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT605 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT605 content
	 * @return the created object or null if the parameter is null
	 * @see #MT605(String)
	 * @since 7.7
	 */
	public static MT605 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT605(m);
	}
	
	/**
	 * Creates and initializes a new MT605 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT605() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT605 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT605(final String sender, final String receiver) {
		super(605, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT605(String, String)
	* @deprecated Use instead <code>new MT605(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT605(final int messageType, final String sender, final String receiver) {
		super(605, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT605(int, String, String)", "Use the constructor MT605(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT605 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT605(final String fin) {
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
			log.warning("Creating an MT605 object from FIN content with a Service Message. Check if the MT605 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT605 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT605 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT605 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT605 or null if fin is null 
	 * @since 7.7
	 */
	public static MT605 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT605(fin);
    }
    
    /**
	 * Creates a new MT605 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT605(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT605 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT605 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT605 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT605(stream);
    }
    
    /**
	 * Creates a new MT605 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT605(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT605 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT605 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT605 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT605(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "605";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT605 append(final SwiftTagListBlock block) {
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
	public MT605 append(final Tag ... tags) {
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
	public MT605 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT605 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT605 message
	 * @return a new instance of MT605
	 * @since 7.10.3
	 */
	public final static MT605 fromJson(String json) {
		return (MT605) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 20, 
	 * or null if none is found.<br>
	 * The first occurrence of field 20 at MT605 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 26C, 
	 * or null if none is found.<br>
	 * The first occurrence of field 26C at MT605 is expected to be the only one.
	 * 
	 * @return a Field26C object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field26C getField26C() {
		final Tag t = tag("26C");
		if (t != null) {
			return new Field26C(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 25, 
	 * or null if none is found.<br>
	 * The first occurrence of field 25 at MT605 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 30, 
	 * or null if none is found.<br>
	 * The first occurrence of field 30 at MT605 is expected to be the only one.
	 * 
	 * @return a Field30 object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field30 getField30() {
		final Tag t = tag("30");
		if (t != null) {
			return new Field30(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 21, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 21 at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field21 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field21> getField21() {
		final List<Field21> result = new ArrayList<Field21>();
		final Tag[] tags = tags("21");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field21(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 23, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 23 at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field23 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field23> getField23() {
		final List<Field23> result = new ArrayList<Field23>();
		final Tag[] tags = tags("23");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field23(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 26D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 26D at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field26D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field26D> getField26D() {
		final List<Field26D> result = new ArrayList<Field26D>();
		final Tag[] tags = tags("26D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field26D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 32F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 32F at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field32F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field32F> getField32F() {
		final List<Field32F> result = new ArrayList<Field32F>();
		final Tag[] tags = tags("32F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field32F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 82A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 82A at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field82A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field82A> getField82A() {
		final List<Field82A> result = new ArrayList<Field82A>();
		final Tag[] tags = tags("82A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field82A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 82B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 82B at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field82B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field82B> getField82B() {
		final List<Field82B> result = new ArrayList<Field82B>();
		final Tag[] tags = tags("82B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field82B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 82D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 82D at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field82D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field82D> getField82D() {
		final List<Field82D> result = new ArrayList<Field82D>();
		final Tag[] tags = tags("82D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field82D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 86A at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86A> getField86A() {
		final List<Field86A> result = new ArrayList<Field86A>();
		final Tag[] tags = tags("86A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field86A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 86B at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86B> getField86B() {
		final List<Field86B> result = new ArrayList<Field86B>();
		final Tag[] tags = tags("86B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field86B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 86D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 86D at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field86D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field86D> getField86D() {
		final List<Field86D> result = new ArrayList<Field86D>();
		final Tag[] tags = tags("86D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field86D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 87A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 87A at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field87A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field87A> getField87A() {
		final List<Field87A> result = new ArrayList<Field87A>();
		final Tag[] tags = tags("87A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field87A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 87B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 87B at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field87B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field87B> getField87B() {
		final List<Field87B> result = new ArrayList<Field87B>();
		final Tag[] tags = tags("87B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field87B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 87D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 87D at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field87D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field87D> getField87D() {
		final List<Field87D> result = new ArrayList<Field87D>();
		final Tag[] tags = tags("87D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field87D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 88A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 88A at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field88A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field88A> getField88A() {
		final List<Field88A> result = new ArrayList<Field88A>();
		final Tag[] tags = tags("88A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field88A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 88B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 88B at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field88B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field88B> getField88B() {
		final List<Field88B> result = new ArrayList<Field88B>();
		final Tag[] tags = tags("88B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field88B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 88D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 88D at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field88D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field88D> getField88D() {
		final List<Field88D> result = new ArrayList<Field88D>();
		final Tag[] tags = tags("88D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field88D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 72, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 72 at MT605 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field72 objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field72> getField72() {
		final List<Field72> result = new ArrayList<Field72>();
		final Tag[] tags = tags("72");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field72(tag.getValue()));
            }
		}
		return result;
	}
	



}
