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
 * <strong>MT 502 - Order to Buy or Sell</strong>
 *
 * <p>
 * SWIFT MT502 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="sequence">
Sequence A - General Information (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 23 G (M)</li>
<li class="field">Field 98 A,C,E (O)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 F (M)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="sequence">
Sequence A1 - Linkages (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 22 F (O)</li>
<li class="field">Field 13 A,B (O)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B - Order Details (M)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 94
 (O) (repetitive)<ul><li>FieldsetItem 94 B,L (O) (repetitive)</li><li>FieldsetItem 94 B,C,F,L (O) (repetitive)</li></ul></li><li class="sequence">
Sequence B1 - Price (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 90 A,B (M)</li>
<li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 H (M)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 H (M)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="fieldset">
Fieldset 98
 (M) (repetitive)<ul><li>FieldsetItem 98 A,C (M)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,C (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="sequence">
Sequence B2 - Trading Parties (M) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 95
 (M) (repetitive)<ul><li>FieldsetItem 95 P,Q,R (M)</li><li>FieldsetItem 95 L,S (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 97
 (O)<ul><li>FieldsetItem 97 A,B (O)</li><li>FieldsetItem 97 A,E (O)</li></ul></li><li class="field">Field 98 A,C (O)</li>
<li class="field">Field 20 C (O)</li>
<li class="fieldset">
Fieldset 70
 (O)<ul><li>FieldsetItem 70 C (O)</li><li>FieldsetItem 70 E (O)</li></ul></li><li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="fieldset">
Fieldset 36
 (O) (repetitive)<ul><li>FieldsetItem 36 B (O) (repetitive)</li><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li></ul></li><li class="fieldset">
Fieldset 19
 (O)<ul><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li></ul></li><li class="field">Field 35 B (M)</li>
<li class="sequence">
Sequence B3 - Financial Instrument Attributes (O)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 94 B (O)</li>
<li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="fieldset">
Fieldset 12
 (O)<ul><li>FieldsetItem 12 A,C (O)</li><li>FieldsetItem 12 B (O)</li><li>FieldsetItem 12 B (O)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="fieldset">
Fieldset 98
 (O)<ul><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li></ul></li><li class="fieldset">
Fieldset 13
 (O)<ul><li>FieldsetItem 13 A,B (O)</li><li>FieldsetItem 13 B (O)</li><li>FieldsetItem 13 B (O)</li><li>FieldsetItem 13 A,B (O)</li></ul></li><li class="fieldset">
Fieldset 17
 (O)<ul><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li></ul></li><li class="fieldset">
Fieldset 90
 (O)<ul><li>FieldsetItem 90 A,B (O)</li><li>FieldsetItem 90 A,B (O)</li></ul></li><li class="fieldset">
Fieldset 36
 (O)<ul><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li></ul></li><li class="field">Field 35 B (O) (repetitive)</li>
<li class="field">Field 70 E (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="fieldset">
Fieldset 13
 (O) (repetitive)<ul><li>FieldsetItem 13 B (O) (repetitive)</li><li>FieldsetItem 13 A (O)</li><li>FieldsetItem 13 A (O)</li></ul></li><li class="field">Field 70 E (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C - Settlement Details (O)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 F (M)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="sequence">
Sequence C1 - Settlement Parties (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 95
 (M) (repetitive)<ul><li>FieldsetItem 95 P,Q,R,C (M)</li><li>FieldsetItem 95 L,S (O) (repetitive)</li></ul></li><li class="field">Field 97 A,B (O)</li>
<li class="field">Field 98 A,C (O)</li>
<li class="field">Field 20 C (O)</li>
<li class="fieldset">
Fieldset 70
 (O)<ul><li>FieldsetItem 70 D (O)</li><li>FieldsetItem 70 C (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C2 - Cash Parties (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 95
 (M) (repetitive)<ul><li>FieldsetItem 95 P,Q,R (M)</li><li>FieldsetItem 95 L,S (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 97
 (O)<ul><li>FieldsetItem 97 A,E (O)</li><li>FieldsetItem 97 A,E (O)</li><li>FieldsetItem 97 A,E (O)</li><li>FieldsetItem 97 A,E (O)</li></ul></li><li class="field">Field 98 A,C (O)</li>
<li class="field">Field 20 C (O)</li>
<li class="field">Field 70 C (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C3 - Amounts (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 17
 (O)<ul><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li></ul></li><li class="fieldset">
Fieldset 19
 (M) (repetitive)<ul><li>FieldsetItem 19 A (M)</li><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li></ul></li><li class="field">Field 98 A,C (O)</li>
<li class="field">Field 92 B (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence D - Other Parties (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 95
 (M) (repetitive)<ul><li>FieldsetItem 95 P,Q,R (M)</li><li>FieldsetItem 95 L,S (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 97
 (O)<ul><li>FieldsetItem 97 A,B (O)</li><li>FieldsetItem 97 A,E (O)</li></ul></li><li class="field">Field 70 C (O)</li>
<li class="field">Field 20 C (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence E - Two Leg Transaction Details (O)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 98
 (O)<ul><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,C (O)</li></ul></li><li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="fieldset">
Fieldset 20
 (O)<ul><li>FieldsetItem 20 C (O)</li><li>FieldsetItem 20 C (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 C (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A,C (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A (O)</li></ul></li><li class="fieldset">
Fieldset 99
 (O)<ul><li>FieldsetItem 99 B (O)</li><li>FieldsetItem 99 B (O)</li></ul></li><li class="fieldset">
Fieldset 19
 (O)<ul><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li><li>FieldsetItem 19 A (O)</li></ul></li><li class="field">Field 70 C (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT502 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT502.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "502";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ACCW 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACCW = "ACCW";

	/**
	* Constant for qualifier with value ACRU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACRU = "ACRU";

	/**
	* Constant for qualifier with value ALTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ALTE = "ALTE";

	/**
	* Constant for qualifier with value AMT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AMT = "AMT";

	/**
	* Constant for qualifier with value AUTO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AUTO = "AUTO";

	/**
	* Constant for qualifier with value BASK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BASK = "BASK";

	/**
	* Constant for qualifier with value BENE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BENE = "BENE";

	/**
	* Constant for qualifier with value BENM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BENM = "BENM";

	/**
	* Constant for qualifier with value BRCR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BRCR = "BRCR";

	/**
	* Constant for qualifier with value BUSE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BUSE = "BUSE";

	/**
	* Constant for qualifier with value BUYR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BUYR = "BUYR";

	/**
	* Constant for qualifier with value CADE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CADE = "CADE";

	/**
	* Constant for qualifier with value CALD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CALD = "CALD";

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
	* Constant for qualifier with value CANR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CANR = "CANR";

	/**
	* Constant for qualifier with value CAOP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAOP = "CAOP";

	/**
	* Constant for qualifier with value CASH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CASH = "CASH";

	/**
	* Constant for qualifier with value CASY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CASY = "CASY";

	/**
	* Constant for qualifier with value CATB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CATB = "CATB";

	/**
	* Constant for qualifier with value CERT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CERT = "CERT";

	/**
	* Constant for qualifier with value CFRE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CFRE = "CFRE";

	/**
	* Constant for qualifier with value CHAR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CHAR = "CHAR";

	/**
	* Constant for qualifier with value CLAS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLAS = "CLAS";

	/**
	* Constant for qualifier with value CLBR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLBR = "CLBR";

	/**
	* Constant for qualifier with value CLCL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLCL = "CLCL";

	/**
	* Constant for qualifier with value CLTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLTY = "CLTY";

	/**
	* Constant for qualifier with value COAX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COAX = "COAX";

	/**
	* Constant for qualifier with value CODU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODU = "CODU";

	/**
	* Constant for qualifier with value COLR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COLR = "COLR";

	/**
	* Constant for qualifier with value COMM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COMM = "COMM";

	/**
	* Constant for qualifier with value CONV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CONV = "CONV";

	/**
	* Constant for qualifier with value COPY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COPY = "COPY";

	/**
	* Constant for qualifier with value CORA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CORA = "CORA";

	/**
	* Constant for qualifier with value COST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COST = "COST";

	/**
	* Constant for qualifier with value COUN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COUN = "COUN";

	/**
	* Constant for qualifier with value COUP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COUP = "COUP";

	/**
	* Constant for qualifier with value COVE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COVE = "COVE";

	/**
	* Constant for qualifier with value COWA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COWA = "COWA";

	/**
	* Constant for qualifier with value CSHPRTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CSHPRTY = "CSHPRTY";

	/**
	* Constant for qualifier with value CUFC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CUFC = "CUFC";

	/**
	* Constant for qualifier with value DBNM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DBNM = "DBNM";

	/**
	* Constant for qualifier with value DDTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DDTE = "DDTE";

	/**
	* Constant for qualifier with value DEAL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEAL = "DEAL";

	/**
	* Constant for qualifier with value DEBT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEBT = "DEBT";

	/**
	* Constant for qualifier with value DECL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DECL = "DECL";

	/**
	* Constant for qualifier with value DENO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DENO = "DENO";

	/**
	* Constant for qualifier with value DUPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DUPL = "DUPL";

	/**
	* Constant for qualifier with value EXCH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXCH = "EXCH";

	/**
	* Constant for qualifier with value EXEC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXEC = "EXEC";

	/**
	* Constant for qualifier with value EXER 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXER = "EXER";

	/**
	* Constant for qualifier with value EXPI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXPI = "EXPI";

	/**
	* Constant for qualifier with value FCOU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FCOU = "FCOU";

	/**
	* Constant for qualifier with value FIA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FIA = "FIA";

	/**
	* Constant for qualifier with value FIAN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FIAN = "FIAN";

	/**
	* Constant for qualifier with value FORF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FORF = "FORF";

	/**
	* Constant for qualifier with value FORM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FORM = "FORM";

	/**
	* Constant for qualifier with value FRNF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FRNF = "FRNF";

	/**
	* Constant for qualifier with value FRNR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FRNR = "FRNR";

	/**
	* Constant for qualifier with value FXIB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FXIB = "FXIB";

	/**
	* Constant for qualifier with value FXIS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FXIS = "FXIS";

	/**
	* Constant for qualifier with value GENL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GENL = "GENL";

	/**
	* Constant for qualifier with value INBR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INBR = "INBR";

	/**
	* Constant for qualifier with value INCA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INCA = "INCA";

	/**
	* Constant for qualifier with value INDC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDC = "INDC";

	/**
	* Constant for qualifier with value INDX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDX = "INDX";

	/**
	* Constant for qualifier with value INTM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INTM = "INTM";

	/**
	* Constant for qualifier with value INTR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INTR = "INTR";

	/**
	* Constant for qualifier with value INVE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INVE = "INVE";

	/**
	* Constant for qualifier with value ISDI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ISDI = "ISDI";

	/**
	* Constant for qualifier with value ISSU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ISSU = "ISSU";

	/**
	* Constant for qualifier with value LEGA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LEGA = "LEGA";

	/**
	* Constant for qualifier with value LEOG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LEOG = "LEOG";

	/**
	* Constant for qualifier with value LEVY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LEVY = "LEVY";

	/**
	* Constant for qualifier with value LIMI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LIMI = "LIMI";

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
	* Constant for qualifier with value LOCL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOCL = "LOCL";

	/**
	* Constant for qualifier with value LOCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOCO = "LOCO";

	/**
	* Constant for qualifier with value LOTS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOTS = "LOTS";

	/**
	* Constant for qualifier with value MAIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAIN = "MAIN";

	/**
	* Constant for qualifier with value MAST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAST = "MAST";

	/**
	* Constant for qualifier with value MATU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MATU = "MATU";

	/**
	* Constant for qualifier with value MAXF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAXF = "MAXF";

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
	* Constant for qualifier with value MFKT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MFKT = "MFKT";

	/**
	* Constant for qualifier with value MICO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MICO = "MICO";

	/**
	* Constant for qualifier with value MINI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MINI = "MINI";

	/**
	* Constant for qualifier with value MINO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MINO = "MINO";

	/**
	* Constant for qualifier with value MPLE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MPLE = "MPLE";

	/**
	* Constant for qualifier with value NAVD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NAVD = "NAVD";

	/**
	* Constant for qualifier with value NEWM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NEWM = "NEWM";

	/**
	* Constant for qualifier with value NWFC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NWFC = "NWFC";

	/**
	* Constant for qualifier with value NXRT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NXRT = "NXRT";

	/**
	* Constant for qualifier with value OCMT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OCMT = "OCMT";

	/**
	* Constant for qualifier with value ODDC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ODDC = "ODDC";

	/**
	* Constant for qualifier with value OPST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OPST = "OPST";

	/**
	* Constant for qualifier with value OPTI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OPTI = "OPTI";

	/**
	* Constant for qualifier with value ORDR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ORDR = "ORDR";

	/**
	* Constant for qualifier with value ORDRDET 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ORDRDET = "ORDRDET";

	/**
	* Constant for qualifier with value ORGV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ORGV = "ORGV";

	/**
	* Constant for qualifier with value OTHR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OTHR = "OTHR";

	/**
	* Constant for qualifier with value OTHRPRTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OTHRPRTY = "OTHRPRTY";

	/**
	* Constant for qualifier with value PACO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PACO = "PACO";

	/**
	* Constant for qualifier with value PAYE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAYE = "PAYE";

	/**
	* Constant for qualifier with value PAYM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAYM = "PAYM";

	/**
	* Constant for qualifier with value PAYS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAYS = "PAYS";

	/**
	* Constant for qualifier with value PFRE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PFRE = "PFRE";

	/**
	* Constant for qualifier with value PLIS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PLIS = "PLIS";

	/**
	* Constant for qualifier with value POOL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String POOL = "POOL";

	/**
	* Constant for qualifier with value PRCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRCO = "PRCO";

	/**
	* Constant for qualifier with value PREP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PREP = "PREP";

	/**
	* Constant for qualifier with value PREV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PREV = "PREV";

	/**
	* Constant for qualifier with value PRFC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRFC = "PRFC";

	/**
	* Constant for qualifier with value PRIC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRIC = "PRIC";

	/**
	* Constant for qualifier with value PRIR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRIR = "PRIR";

	/**
	* Constant for qualifier with value PROC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROC = "PROC";

	/**
	* Constant for qualifier with value PROG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROG = "PROG";

	/**
	* Constant for qualifier with value PUTT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PUTT = "PUTT";

	/**
	* Constant for qualifier with value REGF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REGF = "REGF";

	/**
	* Constant for qualifier with value REGI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REGI = "REGI";

	/**
	* Constant for qualifier with value REGT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REGT = "REGT";

	/**
	* Constant for qualifier with value RELA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RELA = "RELA";

	/**
	* Constant for qualifier with value REPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPL = "REPL";

	/**
	* Constant for qualifier with value REPO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPO = "REPO";

	/**
	* Constant for qualifier with value REPP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPP = "REPP";

	/**
	* Constant for qualifier with value REPT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPT = "REPT";

	/**
	* Constant for qualifier with value RERA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RERA = "RERA";

	/**
	* Constant for qualifier with value RERT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RERT = "RERT";

	/**
	* Constant for qualifier with value REST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REST = "REST";

	/**
	* Constant for qualifier with value RESU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RESU = "RESU";

	/**
	* Constant for qualifier with value REVA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REVA = "REVA";

	/**
	* Constant for qualifier with value RMTH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RMTH = "RMTH";

	/**
	* Constant for qualifier with value RPOR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RPOR = "RPOR";

	/**
	* Constant for qualifier with value RQBR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RQBR = "RQBR";

	/**
	* Constant for qualifier with value RSET 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RSET = "RSET";

	/**
	* Constant for qualifier with value RSPR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RSPR = "RSPR";

	/**
	* Constant for qualifier with value RTGS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RTGS = "RTGS";

	/**
	* Constant for qualifier with value SAFE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SAFE = "SAFE";

	/**
	* Constant for qualifier with value SECO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SECO = "SECO";

	/**
	* Constant for qualifier with value SELL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SELL = "SELL";

	/**
	* Constant for qualifier with value SEME 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SEME = "SEME";

	/**
	* Constant for qualifier with value SETDET 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETDET = "SETDET";

	/**
	* Constant for qualifier with value SETG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETG = "SETG";

	/**
	* Constant for qualifier with value SETPRTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETPRTY = "SETPRTY";

	/**
	* Constant for qualifier with value SETR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETR = "SETR";

	/**
	* Constant for qualifier with value SETS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETS = "SETS";

	/**
	* Constant for qualifier with value SHAI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SHAI = "SHAI";

	/**
	* Constant for qualifier with value SHIP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SHIP = "SHIP";

	/**
	* Constant for qualifier with value SIZE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SIZE = "SIZE";

	/**
	* Constant for qualifier with value SLMG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SLMG = "SLMG";

	/**
	* Constant for qualifier with value SPCN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SPCN = "SPCN";

	/**
	* Constant for qualifier with value STAM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STAM = "STAM";

	/**
	* Constant for qualifier with value STBR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STBR = "STBR";

	/**
	* Constant for qualifier with value STCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STCO = "STCO";

	/**
	* Constant for qualifier with value STEX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STEX = "STEX";

	/**
	* Constant for qualifier with value STOP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STOP = "STOP";

	/**
	* Constant for qualifier with value SWRT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SWRT = "SWRT";

	/**
	* Constant for qualifier with value TAPC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAPC = "TAPC";

	/**
	* Constant for qualifier with value TAXE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAXE = "TAXE";

	/**
	* Constant for qualifier with value TERM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TERM = "TERM";

	/**
	* Constant for qualifier with value TILI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TILI = "TILI";

	/**
	* Constant for qualifier with value TOCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TOCO = "TOCO";

	/**
	* Constant for qualifier with value TOOR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TOOR = "TOOR";

	/**
	* Constant for qualifier with value TPRO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TPRO = "TPRO";

	/**
	* Constant for qualifier with value TRAD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAD = "TRAD";

	/**
	* Constant for qualifier with value TRADPRTY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRADPRTY = "TRADPRTY";

	/**
	* Constant for qualifier with value TRAG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAG = "TRAG";

	/**
	* Constant for qualifier with value TRAN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAN = "TRAN";

	/**
	* Constant for qualifier with value TRAX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAX = "TRAX";

	/**
	* Constant for qualifier with value TRCA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRCA = "TRCA";

	/**
	* Constant for qualifier with value TRCN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRCN = "TRCN";

	/**
	* Constant for qualifier with value TRRE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRRE = "TRRE";

	/**
	* Constant for qualifier with value TRSE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRSE = "TRSE";

	/**
	* Constant for qualifier with value TRTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRTE = "TRTE";

	/**
	* Constant for qualifier with value TRTR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRTR = "TRTR";

	/**
	* Constant for qualifier with value TTCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TTCO = "TTCO";

	/**
	* Constant for qualifier with value VALU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VALU = "VALU";

	/**
	* Constant for qualifier with value VASU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VASU = "VASU";

	/**
	* Constant for qualifier with value VATA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VATA = "VATA";

	/**
	* Constant for qualifier with value VEND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VEND = "VEND";

	/**
	* Constant for qualifier with value VERN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VERN = "VERN";

	/**
	* Constant for qualifier with value WITH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WITH = "WITH";

	/**
	* Constant for qualifier with value WRTS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WRTS = "WRTS";

	/**
	* Constant for qualifier with value YTMR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String YTMR = "YTMR";

// end qualifiers constants	

	/**
	 * Creates an MT502 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT502 content
	 */
	public MT502(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT502 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT502 content, the parameter can not be null
	 * @see #MT502(String)
	 */
	public MT502(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT502 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT502 content
	 * @return the created object or null if the parameter is null
	 * @see #MT502(String)
	 * @since 7.7
	 */
	public static MT502 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT502(m);
	}
	
	/**
	 * Creates and initializes a new MT502 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT502() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT502 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT502(final String sender, final String receiver) {
		super(502, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT502(String, String)
	* @deprecated Use instead <code>new MT502(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT502(final int messageType, final String sender, final String receiver) {
		super(502, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT502(int, String, String)", "Use the constructor MT502(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT502 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT502(final String fin) {
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
			log.warning("Creating an MT502 object from FIN content with a Service Message. Check if the MT502 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT502 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT502 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT502 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT502 or null if fin is null 
	 * @since 7.7
	 */
	public static MT502 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT502(fin);
    }
    
    /**
	 * Creates a new MT502 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT502(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT502 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT502 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT502 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT502(stream);
    }
    
    /**
	 * Creates a new MT502 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT502(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT502 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT502 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT502 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT502(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "502";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT502 append(final SwiftTagListBlock block) {
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
	public MT502 append(final Tag ... tags) {
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
	public MT502 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT502 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT502 message
	 * @return a new instance of MT502
	 * @since 7.10.3
	 */
	public final static MT502 fromJson(String json) {
		return (MT502) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or null if none is found.<br>
	 * The first occurrence of field 23G at MT502 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 98E, 
	 * or null if none is found.<br>
	 * The first occurrence of field 98E at MT502 is expected to be the only one.
	 * 
	 * @return a Field98E object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field98E getField98E() {
		final Tag t = tag("98E");
		if (t != null) {
			return new Field98E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 22F at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16R at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13A at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13B at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 20C at MT502 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16S at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94B> getField94B() {
		final List<Field94B> result = new ArrayList<Field94B>();
		final Tag[] tags = tags("94B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field94B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94C> getField94C() {
		final List<Field94C> result = new ArrayList<Field94C>();
		final Tag[] tags = tags("94C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field94C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94F at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94F> getField94F() {
		final List<Field94F> result = new ArrayList<Field94F>();
		final Tag[] tags = tags("94F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field94F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94L at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94L> getField94L() {
		final List<Field94L> result = new ArrayList<Field94L>();
		final Tag[] tags = tags("94L");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field94L(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90A> getField90A() {
		final List<Field90A> result = new ArrayList<Field90A>();
		final Tag[] tags = tags("90A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90B> getField90B() {
		final List<Field90B> result = new ArrayList<Field90B>();
		final Tag[] tags = tags("90B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 22H at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field22H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field22H> getField22H() {
		final List<Field22H> result = new ArrayList<Field22H>();
		final Tag[] tags = tags("22H");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field22H(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98A> getField98A() {
		final List<Field98A> result = new ArrayList<Field98A>();
		final Tag[] tags = tags("98A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98B> getField98B() {
		final List<Field98B> result = new ArrayList<Field98B>();
		final Tag[] tags = tags("98B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98C> getField98C() {
		final List<Field98C> result = new ArrayList<Field98C>();
		final Tag[] tags = tags("98C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92A> getField92A() {
		final List<Field92A> result = new ArrayList<Field92A>();
		final Tag[] tags = tags("92A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95L at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95P at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95Q at MT502 are expected at one sequence or across several sequences.
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
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95R at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95S at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95S objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95S> getField95S() {
		final List<Field95S> result = new ArrayList<Field95S>();
		final Tag[] tags = tags("95S");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95S(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97A> getField97A() {
		final List<Field97A> result = new ArrayList<Field97A>();
		final Tag[] tags = tags("97A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field97A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97B> getField97B() {
		final List<Field97B> result = new ArrayList<Field97B>();
		final Tag[] tags = tags("97B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field97B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97E at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97E> getField97E() {
		final List<Field97E> result = new ArrayList<Field97E>();
		final Tag[] tags = tags("97E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field97E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 70C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70C> getField70C() {
		final List<Field70C> result = new ArrayList<Field70C>();
		final Tag[] tags = tags("70C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field70C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 70E at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70E> getField70E() {
		final List<Field70E> result = new ArrayList<Field70E>();
		final Tag[] tags = tags("70E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field70E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 36B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36B> getField36B() {
		final List<Field36B> result = new ArrayList<Field36B>();
		final Tag[] tags = tags("36B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field36B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 19A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19A> getField19A() {
		final List<Field19A> result = new ArrayList<Field19A>();
		final Tag[] tags = tags("19A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field19A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 12A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12A> getField12A() {
		final List<Field12A> result = new ArrayList<Field12A>();
		final Tag[] tags = tags("12A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field12A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 12C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12C> getField12C() {
		final List<Field12C> result = new ArrayList<Field12C>();
		final Tag[] tags = tags("12C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field12C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 12B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field12B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field12B> getField12B() {
		final List<Field12B> result = new ArrayList<Field12B>();
		final Tag[] tags = tags("12B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field12B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 11A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 11A at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field11A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field11A> getField11A() {
		final List<Field11A> result = new ArrayList<Field11A>();
		final Tag[] tags = tags("11A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field11A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 17B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 17B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field17B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field17B> getField17B() {
		final List<Field17B> result = new ArrayList<Field17B>();
		final Tag[] tags = tags("17B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field17B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 35B at MT502 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field95C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field95C> getField95C() {
		final List<Field95C> result = new ArrayList<Field95C>();
		final Tag[] tags = tags("95C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field95C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 70D at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70D> getField70D() {
		final List<Field70D> result = new ArrayList<Field70D>();
		final Tag[] tags = tags("70D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field70D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92B> getField92B() {
		final List<Field92B> result = new ArrayList<Field92B>();
		final Tag[] tags = tags("92B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92C at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92C> getField92C() {
		final List<Field92C> result = new ArrayList<Field92C>();
		final Tag[] tags = tags("92C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 99B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 99B at MT502 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field99B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field99B> getField99B() {
		final List<Field99B> result = new ArrayList<Field99B>();
		final Tag[] tags = tags("99B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field99B(tag.getValue()));
            }
		}
		return result;
	}
	

// BaseSequenceCodeGenerator [seq=A]
	/**
	 * Class to model Sequence "A" in MT 502
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
	 * Class to model Sequence "A1" in MT 502
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
	 * Class to model Sequence "B" in MT 502
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ORDRDET</em>
		 */
		public static final String START_END_16RS = "ORDRDET";
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
	 * Get the single occurrence of SequenceB delimited by 16R/16S the value of SequenceB#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceB#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB getSequenceB() {
		return new SequenceB(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceB delimited by 16R/16S the value of SequenceB#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceB#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB getSequenceB(SwiftTagListBlock parentSequence) {
		final SequenceB s = new SequenceB();
		s.setTags(parentSequence.getSubBlock(SequenceB.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B1]
	/**
	 * Class to model Sequence "B1" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceB1() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceB1(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>PRIC</em>
		 */
		public static final String START_END_16RS = "PRIC";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB1 newInstance(final Tag ... tags) {
			final SequenceB1 result = new SequenceB1();
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
		public static SequenceB1 newInstance() {
			final SequenceB1 result = new SequenceB1();
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
		public static SequenceB1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB1 result = new SequenceB1();
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
		private SequenceB1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceB1 delimited by 16R/16S with value specified in SequenceB1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceB1#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceB1> getSequenceB1List() {
		return getSequenceB1List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceB1 delimited by 16R/16S with value specified in SequenceB1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceB1#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB1 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceB1> getSequenceB1List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceB1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB1> result = new ArrayList<SequenceB1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceB1 s = new SequenceB1();
				s.setTags(b.getSubBlock(SequenceB1.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B2]
	/**
	 * Class to model Sequence "B2" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceB2() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceB2(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>TRADPRTY</em>
		 */
		public static final String START_END_16RS = "TRADPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB2 newInstance(final Tag ... tags) {
			final SequenceB2 result = new SequenceB2();
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
		public static SequenceB2 newInstance() {
			final SequenceB2 result = new SequenceB2();
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
		public static SequenceB2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB2 result = new SequenceB2();
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
		private SequenceB2(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceB2 delimited by 16R/16S with value specified in SequenceB2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceB2#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceB2> getSequenceB2List() {
		return getSequenceB2List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceB2 delimited by 16R/16S with value specified in SequenceB2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceB2#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB2 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceB2> getSequenceB2List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceB2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceB2> result = new ArrayList<SequenceB2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceB2 s = new SequenceB2();
				s.setTags(b.getSubBlock(SequenceB2.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B3]
	/**
	 * Class to model Sequence "B3" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceB3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceB3() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceB3(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>FIA</em>
		 */
		public static final String START_END_16RS = "FIA";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceB3 newInstance(final Tag ... tags) {
			final SequenceB3 result = new SequenceB3();
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
		public static SequenceB3 newInstance() {
			final SequenceB3 result = new SequenceB3();
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
		public static SequenceB3 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceB3 result = new SequenceB3();
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
		private SequenceB3(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}
	/**
	 * Get the single occurrence of SequenceB3 delimited by 16R/16S the value of SequenceB3#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceB3#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB3 getSequenceB3() {
		return new SequenceB3(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceB3 delimited by 16R/16S the value of SequenceB3#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceB3#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB3 within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB3 getSequenceB3(SwiftTagListBlock parentSequence) {
		final SequenceB3 s = new SequenceB3();
		s.setTags(parentSequence.getSubBlock(SequenceB3.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C]
	/**
	 * Class to model Sequence "C" in MT 502
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SETDET</em>
		 */
		public static final String START_END_16RS = "SETDET";
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
	 * Get the single occurrence of SequenceC delimited by 16R/16S the value of SequenceC#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceC#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceC getSequenceC() {
		return new SequenceC(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceC delimited by 16R/16S the value of SequenceC#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceC#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceC within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceC getSequenceC(SwiftTagListBlock parentSequence) {
		final SequenceC s = new SequenceC();
		s.setTags(parentSequence.getSubBlock(SequenceC.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C1]
	/**
	 * Class to model Sequence "C1" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceC1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceC1() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceC1(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SETPRTY</em>
		 */
		public static final String START_END_16RS = "SETPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC1 newInstance(final Tag ... tags) {
			final SequenceC1 result = new SequenceC1();
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
		public static SequenceC1 newInstance() {
			final SequenceC1 result = new SequenceC1();
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
		public static SequenceC1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC1 result = new SequenceC1();
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
		private SequenceC1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceC1 delimited by 16R/16S with value specified in SequenceC1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceC1#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC1> getSequenceC1List() {
		return getSequenceC1List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceC1 delimited by 16R/16S with value specified in SequenceC1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceC1#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceC1 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceC1> getSequenceC1List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceC1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC1> result = new ArrayList<SequenceC1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceC1 s = new SequenceC1();
				s.setTags(b.getSubBlock(SequenceC1.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C2]
	/**
	 * Class to model Sequence "C2" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceC2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceC2() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceC2(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CSHPRTY</em>
		 */
		public static final String START_END_16RS = "CSHPRTY";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC2 newInstance(final Tag ... tags) {
			final SequenceC2 result = new SequenceC2();
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
		public static SequenceC2 newInstance() {
			final SequenceC2 result = new SequenceC2();
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
		public static SequenceC2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC2 result = new SequenceC2();
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
		private SequenceC2(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceC2 delimited by 16R/16S with value specified in SequenceC2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceC2#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC2> getSequenceC2List() {
		return getSequenceC2List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceC2 delimited by 16R/16S with value specified in SequenceC2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceC2#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceC2 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceC2> getSequenceC2List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceC2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC2> result = new ArrayList<SequenceC2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceC2 s = new SequenceC2();
				s.setTags(b.getSubBlock(SequenceC2.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=C3]
	/**
	 * Class to model Sequence "C3" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceC3 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceC3() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceC3(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>AMT</em>
		 */
		public static final String START_END_16RS = "AMT";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceC3 newInstance(final Tag ... tags) {
			final SequenceC3 result = new SequenceC3();
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
		public static SequenceC3 newInstance() {
			final SequenceC3 result = new SequenceC3();
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
		public static SequenceC3 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceC3 result = new SequenceC3();
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
		private SequenceC3(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceC3 delimited by 16R/16S with value specified in SequenceC3#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceC3#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceC3> getSequenceC3List() {
		return getSequenceC3List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceC3 delimited by 16R/16S with value specified in SequenceC3#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceC3#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceC3 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceC3> getSequenceC3List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceC3.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceC3> result = new ArrayList<SequenceC3>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceC3 s = new SequenceC3();
				s.setTags(b.getSubBlock(SequenceC3.START_END_16RS).getTags());
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
	 * Class to model Sequence "D" in MT 502
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>OTHRPRTY</em>
		 */
		public static final String START_END_16RS = "OTHRPRTY";
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
	 * Get the list of SequenceD delimited by 16R/16S with value specified in SequenceD#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceD#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceD> getSequenceDList() {
		return getSequenceDList(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceD delimited by 16R/16S with value specified in SequenceD#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceD#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceD within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceD> getSequenceDList(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceD.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceD> result = new ArrayList<SequenceD>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceD s = new SequenceD();
				s.setTags(b.getSubBlock(SequenceD.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=E]
	/**
	 * Class to model Sequence "E" in MT 502
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceE extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceE() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceE(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>REPO</em>
		 */
		public static final String START_END_16RS = "REPO";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceE newInstance(final Tag ... tags) {
			final SequenceE result = new SequenceE();
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
		public static SequenceE newInstance() {
			final SequenceE result = new SequenceE();
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
		public static SequenceE newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceE result = new SequenceE();
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
		private SequenceE(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}
	/**
	 * Get the single occurrence of SequenceE delimited by 16R/16S the value of SequenceE#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceE#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceE getSequenceE() {
		return new SequenceE(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceE delimited by 16R/16S the value of SequenceE#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceE#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceE within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceE getSequenceE(SwiftTagListBlock parentSequence) {
		final SequenceE s = new SequenceE();
		s.setTags(parentSequence.getSubBlock(SequenceE.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator




}
