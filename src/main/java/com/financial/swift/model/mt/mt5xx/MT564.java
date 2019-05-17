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
 * <strong>MT 564 - Corporate Action Notification</strong>
 *
 * <p>
 * SWIFT MT564 (ISO 15022) message structure:
 * <br>
 <div class="scheme"><ul>
<li class="sequence">
Sequence A - General Information (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 28 E (O)</li>
<li class="fieldset">
Fieldset 20
 (M) (repetitive)<ul><li>FieldsetItem 20 C (M)</li><li>FieldsetItem 20 C (M)</li><li>FieldsetItem 20 C (O)</li></ul></li><li class="field">Field 23 G (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (M)</li><li>FieldsetItem 22 F (M)</li></ul></li><li class="field">Field 98 A,C (O)</li>
<li class="field">Field 25 D (M)</li>
<li class="sequence">
Sequence A1 - Linkages (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 22 F (O)</li>
<li class="field">Field 13 A,B (O)</li>
<li class="field">Field 20 C (M)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B - Underlying Securities (M)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 35 B (M)</li>
<li class="sequence">
Sequence B1 - Financial Instrument Attributes (O)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 94 B (O)</li>
<li class="field">Field 22 F (O)</li>
<li class="fieldset">
Fieldset 12
 (O)<ul><li>FieldsetItem 12 A,C (O)</li><li>FieldsetItem 12 B (O)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="fieldset">
Fieldset 98
 (O)<ul><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 D (O)</li></ul></li><li class="fieldset">
Fieldset 36
 (O)<ul><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence B2 - Account Information (M) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 95 P,R (O)</li>
<li class="field">Field 97 A,C (M)</li>
<li class="field">Field 94 B,C,F (O)</li>
<li class="fieldset">
Fieldset 93
 (O) (repetitive)<ul><li>FieldsetItem 93 B,C (O) (repetitive)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O) (repetitive)</li><li>FieldsetItem 93 B,C (O) (repetitive)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O) (repetitive)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence C - Intermediate Securities (O)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 35 B (M)</li>
<li class="field">Field 36 B,E (O)</li>
<li class="fieldset">
Fieldset 93
 (O)<ul><li>FieldsetItem 93 B,C (O)</li><li>FieldsetItem 93 B,C (O)</li></ul></li><li class="fieldset">
Fieldset 22
 (O)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="field">Field 92 D (O)</li>
<li class="field">Field 90 B (O)</li>
<li class="fieldset">
Fieldset 98
 (M)<ul><li>FieldsetItem 98 A,B (M)</li><li>FieldsetItem 98 A,B (M)</li></ul></li><li class="field">Field 69 A,B,C,D,E,F (O)</li>
<li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence D - Corporate Action Details (O)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 98
 (O)<ul><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B (O)</li><li>FieldsetItem 98 A,B (O)</li><li>FieldsetItem 98 A,B,C (O)</li></ul></li><li class="fieldset">
Fieldset 69
 (O)<ul><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li></ul></li><li class="field">Field 99 A (O)</li>
<li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,K,P (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F (O)</li><li>FieldsetItem 92 A,F (O)</li><li>FieldsetItem 92 A,F (O)</li></ul></li><li class="fieldset">
Fieldset 90
 (O)<ul><li>FieldsetItem 90 A,B,E,L (O)</li><li>FieldsetItem 90 A,B,E,L (O)</li></ul></li><li class="fieldset">
Fieldset 36
 (O)<ul><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li></ul></li><li class="field">Field 13 A,B (O) (repetitive)</li>
<li class="fieldset">
Fieldset 17
 (O)<ul><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li></ul></li><li class="fieldset">
Fieldset 22
 (O) (repetitive)<ul><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li></ul></li><li class="fieldset">
Fieldset 94
 (O)<ul><li>FieldsetItem 94 E (O)</li><li>FieldsetItem 94 E (O)</li><li>FieldsetItem 94 E (O)</li><li>FieldsetItem 94 E (O)</li></ul></li><li class="fieldset">
Fieldset 70
 (O) (repetitive)<ul><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E,G (O)</li><li>FieldsetItem 70 E (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence E - Corporate Action Options (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 13 A (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 F (M)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O) (repetitive)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 94
 (O) (repetitive)<ul><li>FieldsetItem 94 C (O) (repetitive)</li><li>FieldsetItem 94 C (O) (repetitive)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="fieldset">
Fieldset 17
 (M) (repetitive)<ul><li>FieldsetItem 17 B (M)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li><li>FieldsetItem 17 B (O)</li></ul></li><li class="field">Field 35 B (O)</li>
<li class="fieldset">
Fieldset 98
 (O) (repetitive)<ul><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E,F (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C,E,J,K (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 69
 (O)<ul><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li><li>FieldsetItem 69 A,B,C,D,E,F,J (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O) (repetitive)<ul><li>FieldsetItem 92 F,H,J,K (O) (repetitive)</li><li>FieldsetItem 92 A,F,K,R (O) (repetitive)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F,J,K (O) (repetitive)</li><li>FieldsetItem 92 F,J,K (O) (repetitive)</li><li>FieldsetItem 92 F,H,J,K (O) (repetitive)</li><li>FieldsetItem 92 B (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,K,R (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 90
 (O)<ul><li>FieldsetItem 90 A,B,E (O)</li><li>FieldsetItem 90 A,B,E (O)</li><li>FieldsetItem 90 B,E (O)</li><li>FieldsetItem 90 B,E (O)</li><li>FieldsetItem 90 B,E (O)</li></ul></li><li class="fieldset">
Fieldset 36
 (O)<ul><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li><li>FieldsetItem 36 B,C (O)</li></ul></li><li class="sequence">
Sequence E1 - Securities Movement (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 H (M)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li></ul></li><li class="field">Field 35 B (M)</li>
<li class="sequence">
Sequence E1a - Financial Instrument Attributes (O)<ul><li class="field">Field 16 R (M)</li>
<li class="field">Field 94 B (O)</li>
<li class="field">Field 22 F (O)</li>
<li class="fieldset">
Fieldset 12
 (O)<ul><li>FieldsetItem 12 A,C (O)</li><li>FieldsetItem 12 B (O)</li></ul></li><li class="field">Field 11 A (O)</li>
<li class="fieldset">
Fieldset 98
 (O)<ul><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li><li>FieldsetItem 98 A (O)</li></ul></li><li class="field">Field 90 A,B,E (O)</li>
<li class="fieldset">
Fieldset 92
 (O)<ul><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li></ul></li><li class="fieldset">
Fieldset 36
 (O)<ul><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li><li>FieldsetItem 36 B (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="field">Field 36 B (O) (repetitive)</li>
<li class="fieldset">
Fieldset 94
 (O)<ul><li>FieldsetItem 94 B,C,F (O)</li><li>FieldsetItem 94 C (O)</li></ul></li><li class="field">Field 22 F (O)</li>
<li class="field">Field 11 A (O)</li>
<li class="field">Field 69 A,B,C,D,E,F,J (O)</li>
<li class="fieldset">
Fieldset 90
 (O)<ul><li>FieldsetItem 90 A,B,E (O)</li><li>FieldsetItem 90 A,B,E (O)</li><li>FieldsetItem 90 A,B,E,F,J,L (O)</li><li>FieldsetItem 90 A,B,E,K (O)</li><li>FieldsetItem 90 B,E (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O) (repetitive)<ul><li>FieldsetItem 92 D,K,L (O)</li><li>FieldsetItem 92 D,K,L,M,N (O)</li><li>FieldsetItem 92 D,K,L (O)</li><li>FieldsetItem 92 A (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,K (O)</li></ul></li><li class="fieldset">
Fieldset 98
 (M) (repetitive)<ul><li>FieldsetItem 98 A,B,C (M)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence E2 - Cash Movements (O) (repetitive)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 22
 (M) (repetitive)<ul><li>FieldsetItem 22 H (M)</li><li>FieldsetItem 22 H (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O)</li><li>FieldsetItem 22 F (O) (repetitive)</li></ul></li><li class="field">Field 94 C (O)</li>
<li class="field">Field 97 A,E (O)</li>
<li class="fieldset">
Fieldset 19
 (O)<ul><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li><li>FieldsetItem 19 B (O)</li></ul></li><li class="fieldset">
Fieldset 98
 (M) (repetitive)<ul><li>FieldsetItem 98 A,B,C (M)</li><li>FieldsetItem 98 A,B,C (O)</li><li>FieldsetItem 98 A,B,C,E (O)</li><li>FieldsetItem 98 A,B,C (O)</li></ul></li><li class="fieldset">
Fieldset 92
 (O) (repetitive)<ul><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 F,K (O)</li><li>FieldsetItem 92 A,F,K,M (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 F,H,J,K (O) (repetitive)</li><li>FieldsetItem 92 B (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,J,K (O) (repetitive)</li><li>FieldsetItem 92 F,H,J,K (O) (repetitive)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F,K,M (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,F,K,R (O)</li><li>FieldsetItem 92 A,F,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,K (O)</li><li>FieldsetItem 92 A,F,K,R (O)</li><li>FieldsetItem 92 A,F,J,K,R (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 90
 (O)<ul><li>FieldsetItem 90 A,B,E,F,J,L (O)</li><li>FieldsetItem 90 A,B,E,K (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="fieldset">
Fieldset 70
 (O) (repetitive)<ul><li>FieldsetItem 70 E (O)</li><li>FieldsetItem 70 E (O)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
<li class="sequence">
Sequence F - Additional Information (O)<ul><li class="field">Field 16 R (M)</li>
<li class="fieldset">
Fieldset 70
 (O) (repetitive)<ul><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li><li>FieldsetItem 70 E (O) (repetitive)</li></ul></li><li class="fieldset">
Fieldset 95
 (O) (repetitive)<ul><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O) (repetitive)</li><li>FieldsetItem 95 P,Q,R (O) (repetitive)</li><li>FieldsetItem 95 P,Q,R (O) (repetitive)</li><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O)</li><li>FieldsetItem 95 P,Q,R (O) (repetitive)</li><li>FieldsetItem 95 P,Q,R (O) (repetitive)</li><li>FieldsetItem 95 P,Q,R (O)</li></ul></li><li class="field">Field 16 S (M)</li>
</ul></li>
</ul></div>

 *
 * <p>
 * This source code is specific to release <strong>SRU 2018</strong>
 * <p>
 * For additional resources check <a href="https://www.singlee.financial.com/resources">https://www.singlee.financial.com/resources</a>
 */
@Generated
public class MT564 extends AbstractMT implements Serializable {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2018;
	private static final long serialVersionUID = 1L;
	private static final transient java.util.logging.Logger log = java.util.logging.Logger.getLogger(MT564.class.getName());
	
	/**
	* Constant for MT name, this is part of the classname, after <code>MT</code>
	*/
	public static final String NAME = "564";
	
// begin qualifiers constants	

	/**
	* Constant for qualifier with value ACCTINFO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACCTINFO = "ACCTINFO";

	/**
	* Constant for qualifier with value ACIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACIN = "ACIN";

	/**
	* Constant for qualifier with value ACOW 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACOW = "ACOW";

	/**
	* Constant for qualifier with value ACRU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ACRU = "ACRU";

	/**
	* Constant for qualifier with value ADDB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADDB = "ADDB";

	/**
	* Constant for qualifier with value ADDINFO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADDINFO = "ADDINFO";

	/**
	* Constant for qualifier with value ADEX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADEX = "ADEX";

	/**
	* Constant for qualifier with value ADSR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADSR = "ADSR";

	/**
	* Constant for qualifier with value ADTX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ADTX = "ADTX";

	/**
	* Constant for qualifier with value AFFB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AFFB = "AFFB";

	/**
	* Constant for qualifier with value ANOU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ANOU = "ANOU";

	/**
	* Constant for qualifier with value APLI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String APLI = "APLI";

	/**
	* Constant for qualifier with value AREV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AREV = "AREV";

	/**
	* Constant for qualifier with value ATAX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ATAX = "ATAX";

	/**
	* Constant for qualifier with value AVAL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String AVAL = "AVAL";

	/**
	* Constant for qualifier with value BAIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BAIN = "BAIN";

	/**
	* Constant for qualifier with value BASE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BASE = "BASE";

	/**
	* Constant for qualifier with value BIDI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BIDI = "BIDI";

	/**
	* Constant for qualifier with value BLOK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BLOK = "BLOK";

	/**
	* Constant for qualifier with value BOCL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BOCL = "BOCL";

	/**
	* Constant for qualifier with value BOLQ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BOLQ = "BOLQ";

	/**
	* Constant for qualifier with value BORD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BORD = "BORD";

	/**
	* Constant for qualifier with value BORR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BORR = "BORR";

	/**
	* Constant for qualifier with value BWIT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String BWIT = "BWIT";

	/**
	* Constant for qualifier with value CACN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CACN = "CACN";

	/**
	* Constant for qualifier with value CADETL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CADETL = "CADETL";

	/**
	* Constant for qualifier with value CAEP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAEP = "CAEP";

	/**
	* Constant for qualifier with value CAEV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAEV = "CAEV";

	/**
	* Constant for qualifier with value CALD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CALD = "CALD";

	/**
	* Constant for qualifier with value CAMV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAMV = "CAMV";

	/**
	* Constant for qualifier with value CANC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CANC = "CANC";

	/**
	* Constant for qualifier with value CAON 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAON = "CAON";

	/**
	* Constant for qualifier with value CAOP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAOP = "CAOP";

	/**
	* Constant for qualifier with value CAOPTN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAOPTN = "CAOPTN";

	/**
	* Constant for qualifier with value CAPG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAPG = "CAPG";

	/**
	* Constant for qualifier with value CASH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CASH = "CASH";

	/**
	* Constant for qualifier with value CASHMOVE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CASHMOVE = "CASHMOVE";

	/**
	* Constant for qualifier with value CAVA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CAVA = "CAVA";

	/**
	* Constant for qualifier with value CDFI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CDFI = "CDFI";

	/**
	* Constant for qualifier with value CEFI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CEFI = "CEFI";

	/**
	* Constant for qualifier with value CERT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CERT = "CERT";

	/**
	* Constant for qualifier with value CETI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CETI = "CETI";

	/**
	* Constant for qualifier with value CHAN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CHAN = "CHAN";

	/**
	* Constant for qualifier with value CHAR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CHAR = "CHAR";

	/**
	* Constant for qualifier with value CINL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CINL = "CINL";

	/**
	* Constant for qualifier with value CLAS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLAS = "CLAS";

	/**
	* Constant for qualifier with value CLCP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CLCP = "CLCP";

	/**
	* Constant for qualifier with value COAF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COAF = "COAF";

	/**
	* Constant for qualifier with value COAP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COAP = "COAP";

	/**
	* Constant for qualifier with value CODO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODO = "CODO";

	/**
	* Constant for qualifier with value CODS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODS = "CODS";

	/**
	* Constant for qualifier with value CODU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CODU = "CODU";

	/**
	* Constant for qualifier with value COIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COIN = "COIN";

	/**
	* Constant for qualifier with value COLI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COLI = "COLI";

	/**
	* Constant for qualifier with value COLO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COLO = "COLO";

	/**
	* Constant for qualifier with value COMP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COMP = "COMP";

	/**
	* Constant for qualifier with value CONS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CONS = "CONS";

	/**
	* Constant for qualifier with value CONT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CONT = "CONT";

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
	* Constant for qualifier with value CORP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CORP = "CORP";

	/**
	* Constant for qualifier with value COUP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String COUP = "COUP";

	/**
	* Constant for qualifier with value CRDB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CRDB = "CRDB";

	/**
	* Constant for qualifier with value CSPD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CSPD = "CSPD";

	/**
	* Constant for qualifier with value CVPR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String CVPR = "CVPR";

	/**
	* Constant for qualifier with value DAAC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DAAC = "DAAC";

	/**
	* Constant for qualifier with value DDTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DDTE = "DDTE";

	/**
	* Constant for qualifier with value DECL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DECL = "DECL";

	/**
	* Constant for qualifier with value DEEM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEEM = "DEEM";

	/**
	* Constant for qualifier with value DENO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DENO = "DENO";

	/**
	* Constant for qualifier with value DEVI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DEVI = "DEVI";

	/**
	* Constant for qualifier with value DFLT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DFLT = "DFLT";

	/**
	* Constant for qualifier with value DISC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DISC = "DISC";

	/**
	* Constant for qualifier with value DISF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DISF = "DISF";

	/**
	* Constant for qualifier with value DITY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DITY = "DITY";

	/**
	* Constant for qualifier with value DIVI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DIVI = "DIVI";

	/**
	* Constant for qualifier with value DIVR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DIVR = "DIVR";

	/**
	* Constant for qualifier with value DOMI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DOMI = "DOMI";

	/**
	* Constant for qualifier with value DROP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DROP = "DROP";

	/**
	* Constant for qualifier with value DSBT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSBT = "DSBT";

	/**
	* Constant for qualifier with value DSDA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSDA = "DSDA";

	/**
	* Constant for qualifier with value DSDE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSDE = "DSDE";

	/**
	* Constant for qualifier with value DSPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSPL = "DSPL";

	/**
	* Constant for qualifier with value DSSE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSSE = "DSSE";

	/**
	* Constant for qualifier with value DSWA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSWA = "DSWA";

	/**
	* Constant for qualifier with value DSWN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSWN = "DSWN";

	/**
	* Constant for qualifier with value DSWO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSWO = "DSWO";

	/**
	* Constant for qualifier with value DSWS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DSWS = "DSWS";

	/**
	* Constant for qualifier with value DUPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DUPL = "DUPL";

	/**
	* Constant for qualifier with value DVCP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String DVCP = "DVCP";

	/**
	* Constant for qualifier with value EARD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EARD = "EARD";

	/**
	* Constant for qualifier with value EARL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EARL = "EARL";

	/**
	* Constant for qualifier with value ECDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ECDT = "ECDT";

	/**
	* Constant for qualifier with value ECIO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ECIO = "ECIO";

	/**
	* Constant for qualifier with value ECPD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ECPD = "ECPD";

	/**
	* Constant for qualifier with value ECRD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ECRD = "ECRD";

	/**
	* Constant for qualifier with value EFFD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EFFD = "EFFD";

	/**
	* Constant for qualifier with value ELCT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ELCT = "ELCT";

	/**
	* Constant for qualifier with value ELIG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ELIG = "ELIG";

	/**
	* Constant for qualifier with value ENTL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ENTL = "ENTL";

	/**
	* Constant for qualifier with value EQUL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EQUL = "EQUL";

	/**
	* Constant for qualifier with value ESOF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ESOF = "ESOF";

	/**
	* Constant for qualifier with value ESTA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ESTA = "ESTA";

	/**
	* Constant for qualifier with value ETPD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ETPD = "ETPD";

	/**
	* Constant for qualifier with value ETYP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ETYP = "ETYP";

	/**
	* Constant for qualifier with value EUTR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EUTR = "EUTR";

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
	* Constant for qualifier with value EXPI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String EXPI = "EXPI";

	/**
	* Constant for qualifier with value FDAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FDAT = "FDAT";

	/**
	* Constant for qualifier with value FIA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FIA = "FIA";

	/**
	* Constant for qualifier with value FILL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FILL = "FILL";

	/**
	* Constant for qualifier with value FISC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FISC = "FISC";

	/**
	* Constant for qualifier with value FLFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FLFR = "FLFR";

	/**
	* Constant for qualifier with value FOLQ 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FOLQ = "FOLQ";

	/**
	* Constant for qualifier with value FRNR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FRNR = "FRNR";

	/**
	* Constant for qualifier with value FTCA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FTCA = "FTCA";

	/**
	* Constant for qualifier with value FXDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String FXDT = "FXDT";

	/**
	* Constant for qualifier with value GENL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GENL = "GENL";

	/**
	* Constant for qualifier with value GRSS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GRSS = "GRSS";

	/**
	* Constant for qualifier with value GUPA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String GUPA = "GUPA";

	/**
	* Constant for qualifier with value HEAR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String HEAR = "HEAR";

	/**
	* Constant for qualifier with value IDFX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String IDFX = "IDFX";

	/**
	* Constant for qualifier with value IFIX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String IFIX = "IFIX";

	/**
	* Constant for qualifier with value INBA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INBA = "INBA";

	/**
	* Constant for qualifier with value INCE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INCE = "INCE";

	/**
	* Constant for qualifier with value INCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INCO = "INCO";

	/**
	* Constant for qualifier with value INCR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INCR = "INCR";

	/**
	* Constant for qualifier with value INDC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDC = "INDC";

	/**
	* Constant for qualifier with value INDM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDM = "INDM";

	/**
	* Constant for qualifier with value INDX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INDX = "INDX";

	/**
	* Constant for qualifier with value INFA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INFA = "INFA";

	/**
	* Constant for qualifier with value INFO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INFO = "INFO";

	/**
	* Constant for qualifier with value INPE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INPE = "INPE";

	/**
	* Constant for qualifier with value INTP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INTP = "INTP";

	/**
	* Constant for qualifier with value INTR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INTR = "INTR";

	/**
	* Constant for qualifier with value INTSEC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String INTSEC = "INTSEC";

	/**
	* Constant for qualifier with value ISAG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ISAG = "ISAG";

	/**
	* Constant for qualifier with value ISSU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ISSU = "ISSU";

	/**
	* Constant for qualifier with value ITYP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ITYP = "ITYP";

	/**
	* Constant for qualifier with value LAPD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LAPD = "LAPD";

	/**
	* Constant for qualifier with value LAST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LAST = "LAST";

	/**
	* Constant for qualifier with value LEOG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LEOG = "LEOG";

	/**
	* Constant for qualifier with value LINK 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LINK = "LINK";

	/**
	* Constant for qualifier with value LOAN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOAN = "LOAN";

	/**
	* Constant for qualifier with value LOCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOCO = "LOCO";

	/**
	* Constant for qualifier with value LOTO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LOTO = "LOTO";

	/**
	* Constant for qualifier with value LTRD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String LTRD = "LTRD";

	/**
	* Constant for qualifier with value MACI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MACI = "MACI";

	/**
	* Constant for qualifier with value MAEX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAEX = "MAEX";

	/**
	* Constant for qualifier with value MATU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MATU = "MATU";

	/**
	* Constant for qualifier with value MAXP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MAXP = "MAXP";

	/**
	* Constant for qualifier with value MCTD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MCTD = "MCTD";

	/**
	* Constant for qualifier with value MEE3 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MEE3 = "MEE3";

	/**
	* Constant for qualifier with value MEET 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MEET = "MEET";

	/**
	* Constant for qualifier with value MEET2 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MEET2 = "MEET2";

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
	* Constant for qualifier with value MET2 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MET2 = "MET2";

	/**
	* Constant for qualifier with value MET3 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MET3 = "MET3";

	/**
	* Constant for qualifier with value MFDV 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MFDV = "MFDV";

	/**
	* Constant for qualifier with value MFIX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MFIX = "MFIX";

	/**
	* Constant for qualifier with value MICI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MICI = "MICI";

	/**
	* Constant for qualifier with value MICO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MICO = "MICO";

	/**
	* Constant for qualifier with value MIEX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MIEX = "MIEX";

	/**
	* Constant for qualifier with value MILT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MILT = "MILT";

	/**
	* Constant for qualifier with value MINO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MINO = "MINO";

	/**
	* Constant for qualifier with value MINP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MINP = "MINP";

	/**
	* Constant for qualifier with value MKDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MKDT = "MKDT";

	/**
	* Constant for qualifier with value MKTC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MKTC = "MKTC";

	/**
	* Constant for qualifier with value MMCI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MMCI = "MMCI";

	/**
	* Constant for qualifier with value MORE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MORE = "MORE";

	/**
	* Constant for qualifier with value MQSO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MQSO = "MQSO";

	/**
	* Constant for qualifier with value MRKT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String MRKT = "MRKT";

	/**
	* Constant for qualifier with value NAME 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String _NAME = "NAME";

	/**
	* Constant for qualifier with value NBLT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NBLT = "NBLT";

	/**
	* Constant for qualifier with value NDOM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NDOM = "NDOM";

	/**
	* Constant for qualifier with value NELP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NELP = "NELP";

	/**
	* Constant for qualifier with value NETT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NETT = "NETT";

	/**
	* Constant for qualifier with value NEWD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NEWD = "NEWD";

	/**
	* Constant for qualifier with value NEWM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NEWM = "NEWM";

	/**
	* Constant for qualifier with value NEWO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NEWO = "NEWO";

	/**
	* Constant for qualifier with value NOMI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NOMI = "NOMI";

	/**
	* Constant for qualifier with value NPLI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NPLI = "NPLI";

	/**
	* Constant for qualifier with value NRAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NRAT = "NRAT";

	/**
	* Constant for qualifier with value NSER 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NSER = "NSER";

	/**
	* Constant for qualifier with value NSIS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String NSIS = "NSIS";

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
	* Constant for qualifier with value OAPD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OAPD = "OAPD";

	/**
	* Constant for qualifier with value OBAL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OBAL = "OBAL";

	/**
	* Constant for qualifier with value OCMT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OCMT = "OCMT";

	/**
	* Constant for qualifier with value OFFE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OFFE = "OFFE";

	/**
	* Constant for qualifier with value OFFO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OFFO = "OFFO";

	/**
	* Constant for qualifier with value OFFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OFFR = "OFFR";

	/**
	* Constant for qualifier with value ONLY 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String ONLY = "ONLY";

	/**
	* Constant for qualifier with value OPST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OPST = "OPST";

	/**
	* Constant for qualifier with value OPTF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OPTF = "OPTF";

	/**
	* Constant for qualifier with value OPTN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OPTN = "OPTN";

	/**
	* Constant for qualifier with value OSTA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OSTA = "OSTA";

	/**
	* Constant for qualifier with value OSUB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OSUB = "OSUB";

	/**
	* Constant for qualifier with value OVEP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String OVEP = "OVEP";

	/**
	* Constant for qualifier with value PACO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PACO = "PACO";

	/**
	* Constant for qualifier with value PAMM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAMM = "PAMM";

	/**
	* Constant for qualifier with value PARL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PARL = "PARL";

	/**
	* Constant for qualifier with value PAYA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAYA = "PAYA";

	/**
	* Constant for qualifier with value PAYD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PAYD = "PAYD";

	/**
	* Constant for qualifier with value PEND 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PEND = "PEND";

	/**
	* Constant for qualifier with value PENR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PENR = "PENR";

	/**
	* Constant for qualifier with value PLDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PLDT = "PLDT";

	/**
	* Constant for qualifier with value PLIS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PLIS = "PLIS";

	/**
	* Constant for qualifier with value PODT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PODT = "PODT";

	/**
	* Constant for qualifier with value POST 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String POST = "POST";

	/**
	* Constant for qualifier with value PPDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PPDT = "PPDT";

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
	* Constant for qualifier with value PRIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRIN = "PRIN";

	/**
	* Constant for qualifier with value PROC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROC = "PROC";

	/**
	* Constant for qualifier with value PROD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROD = "PROD";

	/**
	* Constant for qualifier with value PROR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PROR = "PROR";

	/**
	* Constant for qualifier with value PRPP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PRPP = "PRPP";

	/**
	* Constant for qualifier with value PSAG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PSAG = "PSAG";

	/**
	* Constant for qualifier with value PTSC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PTSC = "PTSC";

	/**
	* Constant for qualifier with value PUTT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PUTT = "PUTT";

	/**
	* Constant for qualifier with value PWAL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String PWAL = "PWAL";

	/**
	* Constant for qualifier with value QINT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String QINT = "QINT";

	/**
	* Constant for qualifier with value QTSO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String QTSO = "QTSO";

	/**
	* Constant for qualifier with value RATE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RATE = "RATE";

	/**
	* Constant for qualifier with value RCHG 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RCHG = "RCHG";

	/**
	* Constant for qualifier with value RDDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RDDT = "RDDT";

	/**
	* Constant for qualifier with value RDIS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RDIS = "RDIS";

	/**
	* Constant for qualifier with value RDTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RDTE = "RDTE";

	/**
	* Constant for qualifier with value REDP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REDP = "REDP";

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
	* Constant for qualifier with value REGO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REGO = "REGO";

	/**
	* Constant for qualifier with value REGR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REGR = "REGR";

	/**
	* Constant for qualifier with value REIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REIN = "REIN";

	/**
	* Constant for qualifier with value RELA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RELA = "RELA";

	/**
	* Constant for qualifier with value REPE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPE = "REPE";

	/**
	* Constant for qualifier with value REPL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REPL = "REPL";

	/**
	* Constant for qualifier with value RESA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RESA = "RESA";

	/**
	* Constant for qualifier with value RESU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RESU = "RESU";

	/**
	* Constant for qualifier with value REVO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String REVO = "REVO";

	/**
	* Constant for qualifier with value RHDI 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RHDI = "RHDI";

	/**
	* Constant for qualifier with value RINR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RINR = "RINR";

	/**
	* Constant for qualifier with value RLOS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RLOS = "RLOS";

	/**
	* Constant for qualifier with value RMDR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RMDR = "RMDR";

	/**
	* Constant for qualifier with value RSPR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RSPR = "RSPR";

	/**
	* Constant for qualifier with value RTUN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String RTUN = "RTUN";

	/**
	* Constant for qualifier with value SAFE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SAFE = "SAFE";

	/**
	* Constant for qualifier with value SECMOVE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SECMOVE = "SECMOVE";

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
	* Constant for qualifier with value SETT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SETT = "SETT";

	/**
	* Constant for qualifier with value SHIP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SHIP = "SHIP";

	/**
	* Constant for qualifier with value SHRT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SHRT = "SHRT";

	/**
	* Constant for qualifier with value SIZE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SIZE = "SIZE";

	/**
	* Constant for qualifier with value SOFE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SOFE = "SOFE";

	/**
	* Constant for qualifier with value SOIC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SOIC = "SOIC";

	/**
	* Constant for qualifier with value SOLA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SOLA = "SOLA";

	/**
	* Constant for qualifier with value SPLP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SPLP = "SPLP";

	/**
	* Constant for qualifier with value SPLT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SPLT = "SPLT";

	/**
	* Constant for qualifier with value SPOS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SPOS = "SPOS";

	/**
	* Constant for qualifier with value STAM 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STAM = "STAM";

	/**
	* Constant for qualifier with value STEX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STEX = "STEX";

	/**
	* Constant for qualifier with value STIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String STIN = "STIN";

	/**
	* Constant for qualifier with value SUBS 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SUBS = "SUBS";

	/**
	* Constant for qualifier with value SUSP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SUSP = "SUSP";

	/**
	* Constant for qualifier with value SXDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String SXDT = "SXDT";

	/**
	* Constant for qualifier with value TAXB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAXB = "TAXB";

	/**
	* Constant for qualifier with value TAXC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAXC = "TAXC";

	/**
	* Constant for qualifier with value TAXE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAXE = "TAXE";

	/**
	* Constant for qualifier with value TAXR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TAXR = "TAXR";

	/**
	* Constant for qualifier with value TDMT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TDMT = "TDMT";

	/**
	* Constant for qualifier with value TDTA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TDTA = "TDTA";

	/**
	* Constant for qualifier with value TEMP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TEMP = "TEMP";

	/**
	* Constant for qualifier with value TNDP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TNDP = "TNDP";

	/**
	* Constant for qualifier with value TPDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TPDT = "TPDT";

	/**
	* Constant for qualifier with value TRAD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAD = "TRAD";

	/**
	* Constant for qualifier with value TRAN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAN = "TRAN";

	/**
	* Constant for qualifier with value TRAT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAT = "TRAT";

	/**
	* Constant for qualifier with value TRAX 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRAX = "TRAX";

	/**
	* Constant for qualifier with value TRDP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TRDP = "TRDP";

	/**
	* Constant for qualifier with value TSDT 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TSDT = "TSDT";

	/**
	* Constant for qualifier with value TXAP 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXAP = "TXAP";

	/**
	* Constant for qualifier with value TXDF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXDF = "TXDF";

	/**
	* Constant for qualifier with value TXFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXFR = "TXFR";

	/**
	* Constant for qualifier with value TXIN 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXIN = "TXIN";

	/**
	* Constant for qualifier with value TXNR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXNR = "TXNR";

	/**
	* Constant for qualifier with value TXPR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXPR = "TXPR";

	/**
	* Constant for qualifier with value TXRC 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String TXRC = "TXRC";

	/**
	* Constant for qualifier with value UNAF 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNAF = "UNAF";

	/**
	* Constant for qualifier with value UNBA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNBA = "UNBA";

	/**
	* Constant for qualifier with value UNCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNCO = "UNCO";

	/**
	* Constant for qualifier with value UNFR 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String UNFR = "UNFR";

	/**
	* Constant for qualifier with value USECU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String USECU = "USECU";

	/**
	* Constant for qualifier with value VALU 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VALU = "VALU";

	/**
	* Constant for qualifier with value VATA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String VATA = "VATA";

	/**
	* Constant for qualifier with value WAPA 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WAPA = "WAPA";

	/**
	* Constant for qualifier with value WEBB 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WEBB = "WEBB";

	/**
	* Constant for qualifier with value WITH 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WITH = "WITH";

	/**
	* Constant for qualifier with value WITL 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WITL = "WITL";

	/**
	* Constant for qualifier with value WTHD 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WTHD = "WTHD";

	/**
	* Constant for qualifier with value WUCO 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String WUCO = "WUCO";

	/**
	* Constant for qualifier with value XDTE 
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public static final String XDTE = "XDTE";

// end qualifiers constants	

	/**
	 * Creates an MT564 initialized with the parameter SwiftMessage
	 * @param m swift message with the MT564 content
	 */
	public MT564(SwiftMessage m) {
		super(m);
		sanityCheck(m);
	}

	/**
	 * Creates an MT564 initialized with the parameter MtSwiftMessage.
	 * @param m swift message with the MT564 content, the parameter can not be null
	 * @see #MT564(String)
	 */
	public MT564(MtSwiftMessage m) {
		this(m.message());
	}
	
	/**
	 * Creates an MT564 initialized with the parameter MtSwiftMessage.
	 *
	 * @param m swift message with the MT564 content
	 * @return the created object or null if the parameter is null
	 * @see #MT564(String)
	 * @since 7.7
	 */
	public static MT564 parse(MtSwiftMessage m) {
		if (m == null) {
			return null;
		}
		return new MT564(m);
	}
	
	/**
	 * Creates and initializes a new MT564 input message setting TEST BICS as sender and receiver.<br>
	 * All mandatory header attributes are completed with default values.
	 *
	 * @since 7.6
	 */
	public MT564() {
		this(BIC.TEST8, BIC.TEST8);
	}
	
	/**
	 * Creates and initializes a new MT564 input message from sender to receiver.<br>
	 * All mandatory header attributes are completed with default values. 
	 * In particular the sender and receiver addresses will be filled with proper default LT identifier 
	 * and branch codes if not provided,
	 * 
	 * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	 * @since 7.7
	 */
	public MT564(final String sender, final String receiver) {
		super(564, sender, receiver);
	}
	
	/**
	* <em>DO NOT USE THIS METHOD</em>
	* It is kept for compatibility but will be removed very soon, since the
	* <code>messageType</code> parameter is actually ignored.
	*
	* @param messageType the message type number
    * @param sender the sender address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @param receiver the receiver address as a bic8, bic11 or full logical terminal consisting of 12 characters
	* @see #MT564(String, String)
	* @deprecated Use instead <code>new MT564(sender, receiver)</code> instead
	*/
	@Deprecated
	@com.financial.deprecation.ProwideDeprecated(phase4=com.financial.deprecation.TargetYear._2019)
	public MT564(final int messageType, final String sender, final String receiver) {
		super(564, sender, receiver);
		com.financial.deprecation.DeprecationUtils.phase3(getClass(), "MT564(int, String, String)", "Use the constructor MT564(sender, receiver) instead.");
	}
	
	/**
	 * Creates a new MT564 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter is null or the message cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed.
	 *
	 * @param fin a string with the MT message in its FIN swift format
	 * @since 7.7
	 */
	public MT564(final String fin) {
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
			log.warning("Creating an MT564 object from FIN content with a Service Message. Check if the MT564 you are intended to read is prepended with and ACK.");
		} else if (!StringUtils.equals(param.getType(), getMessageType())) {
			log.warning("Creating an MT564 object from FIN content with message type "+param.getType());
		}
    }
	
	/**
	 * Creates a new MT564 by parsing a String with the message content in its swift FIN format.<br>
	 * If the fin parameter cannot be parsed, the returned MT564 will have its internal message object
	 * initialized (blocks will be created) but empty.<br>
	 * If the string contains multiple messages, only the first one will be parsed. 
	 *
	 * @param fin a string with the MT message in its FIN swift format. <em>fin may be null in which case this method returns null</em>
	 * @return a new instance of MT564 or null if fin is null 
	 * @since 7.7
	 */
	public static MT564 parse(final String fin) {
		if (fin == null) {
			return null;
		}
		return new MT564(fin);
    }
    
    /**
	 * Creates a new MT564 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the message content is null or cannot be parsed, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public MT564(final InputStream stream) throws IOException {
		this(Lib.readStream(stream));
    }
    
    /**
	 * Creates a new MT564 by parsing a input stream with the message content in its swift FIN format, using "UTF-8" as encoding.<br>
	 * If the stream contains multiple messages, only the first one will be parsed.
	 *
	 * @param stream an input stream in UTF-8 encoding with the MT message in its FIN swift format.
	 * @return a new instance of MT564 or null if stream is null or the message cannot be parsed 
	 * @throws IOException if the stream data cannot be read
	 * @since 7.7
	 */
	public static MT564 parse(final InputStream stream) throws IOException {
		if (stream == null) {
			return null;
		}
		return new MT564(stream);
    }
    
    /**
	 * Creates a new MT564 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file content is null or cannot be parsed as a message, the internal message object
	 * will be initialized (blocks will be created) but empty.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public MT564(final File file) throws IOException {
		this(Lib.readFile(file));
    }
    
    /**
	 * Creates a new MT564 by parsing a file with the message content in its swift FIN format.<br>
	 * If the file contains multiple messages, only the first one will be parsed.
	 *
	 * @param file a file with the MT message in its FIN swift format.
	 * @return a new instance of MT564 or null if; file is null, does not exist, can't be read, is not a file or the message cannot be parsed
	 * @throws IOException if the file content cannot be read
	 * @since 7.7
	 */
	public static MT564 parse(final File file) throws IOException {
		if (file == null) {
			return null;
		}
		return new MT564(file);
    }
    
	/**
	 * Returns this MT number
	 * @return the message type number of this MT
	 * @since 6.4
	 */
	@Override
	public String getMessageType() {
		return "564";
	}

	/**
	 * Add all tags from block to the end of the block4.
	 *
	 * @param block to append
	 * @return this object to allow method chaining
	 * @since 7.6
	 */
	@Override
	public MT564 append(final SwiftTagListBlock block) {
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
	public MT564 append(final Tag ... tags) {
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
	public MT564 append(final Field ... fields) {
		super.append(fields);
		return this;
	}

    /**
	 * Creates an MT564 messages from its JSON representation.
	 * <p>
	 * For generic conversion of JSON into the corresopnding MT instance
	 * see {@link AbstractMT#fromJson(String)}
	 *
	 * @param json a JSON representation of an MT564 message
	 * @return a new instance of MT564
	 * @since 7.10.3
	 */
	public final static MT564 fromJson(String json) {
		return (MT564) AbstractMT.fromJson(json);
	}

	/**
	 * Iterates through block4 fields and return the first one whose name matches 28E, 
	 * or null if none is found.<br>
	 * The first occurrence of field 28E at MT564 is expected to be the only one.
	 * 
	 * @return a Field28E object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field28E getField28E() {
		final Tag t = tag("28E");
		if (t != null) {
			return new Field28E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 23G, 
	 * or null if none is found.<br>
	 * The first occurrence of field 23G at MT564 is expected to be the only one.
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
	 * Iterates through block4 fields and return the first one whose name matches 25D, 
	 * or null if none is found.<br>
	 * The first occurrence of field 25D at MT564 is expected to be the only one.
	 * 
	 * @return a Field25D object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field25D getField25D() {
		final Tag t = tag("25D");
		if (t != null) {
			return new Field25D(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 36E, 
	 * or null if none is found.<br>
	 * The first occurrence of field 36E at MT564 is expected to be the only one.
	 * 
	 * @return a Field36E object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field36E getField36E() {
		final Tag t = tag("36E");
		if (t != null) {
			return new Field36E(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return the first one whose name matches 99A, 
	 * or null if none is found.<br>
	 * The first occurrence of field 99A at MT564 is expected to be the only one.
	 * 
	 * @return a Field99A object or null if the field is not found
	 * @see SwiftTagListBlock#getTagByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public Field99A getField99A() {
		final Tag t = tag("99A");
		if (t != null) {
			return new Field99A(t.getValue());
		} else {
			return null;
		}
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 20C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 20C at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 22F at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 16R at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13A at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 13B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 16S, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 16S at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 12A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 12A at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 12C at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 12B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92K, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92K at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92K objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92K> getField92K() {
		final List<Field92K> result = new ArrayList<Field92K>();
		final Tag[] tags = tags("92K");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92K(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92D at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92D> getField92D() {
		final List<Field92D> result = new ArrayList<Field92D>();
		final Tag[] tags = tags("92D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 36B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95P at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 95R at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field97C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field97C> getField97C() {
		final List<Field97C> result = new ArrayList<Field97C>();
		final Tag[] tags = tags("97C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field97C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94B at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 94C at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 94F at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 93B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 93B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field93B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field93B> getField93B() {
		final List<Field93B> result = new ArrayList<Field93B>();
		final Tag[] tags = tags("93B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field93B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 93C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 93C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field93C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field93C> getField93C() {
		final List<Field93C> result = new ArrayList<Field93C>();
		final Tag[] tags = tags("93C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field93C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 35B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 35B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98B at MT564 are expected at one sequence or across several sequences.
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
	 * Multiple occurrences of field 98C at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98E> getField98E() {
		final List<Field98E> result = new ArrayList<Field98E>();
		final Tag[] tags = tags("98E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69A at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69A objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69A> getField69A() {
		final List<Field69A> result = new ArrayList<Field69A>();
		final Tag[] tags = tags("69A");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69A(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69B> getField69B() {
		final List<Field69B> result = new ArrayList<Field69B>();
		final Tag[] tags = tags("69B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69C> getField69C() {
		final List<Field69C> result = new ArrayList<Field69C>();
		final Tag[] tags = tags("69C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69D, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69D at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69D objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69D> getField69D() {
		final List<Field69D> result = new ArrayList<Field69D>();
		final Tag[] tags = tags("69D");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69D(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69E> getField69E() {
		final List<Field69E> result = new ArrayList<Field69E>();
		final Tag[] tags = tags("69E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69F> getField69F() {
		final List<Field69F> result = new ArrayList<Field69F>();
		final Tag[] tags = tags("69F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 69J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 69J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field69J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field69J> getField69J() {
		final List<Field69J> result = new ArrayList<Field69J>();
		final Tag[] tags = tags("69J");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field69J(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92F> getField92F() {
		final List<Field92F> result = new ArrayList<Field92F>();
		final Tag[] tags = tags("92F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92P, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92P at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92P objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92P> getField92P() {
		final List<Field92P> result = new ArrayList<Field92P>();
		final Tag[] tags = tags("92P");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92P(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90E> getField90E() {
		final List<Field90E> result = new ArrayList<Field90E>();
		final Tag[] tags = tags("90E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90L at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90L> getField90L() {
		final List<Field90L> result = new ArrayList<Field90L>();
		final Tag[] tags = tags("90L");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90L(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 36C, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 36C at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field36C objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field36C> getField36C() {
		final List<Field36C> result = new ArrayList<Field36C>();
		final Tag[] tags = tags("36C");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field36C(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 17B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 17B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 94E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 94E at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field94E objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field94E> getField94E() {
		final List<Field94E> result = new ArrayList<Field94E>();
		final Tag[] tags = tags("94E");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field94E(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 70E at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 70G, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 70G at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field70G objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field70G> getField70G() {
		final List<Field70G> result = new ArrayList<Field70G>();
		final Tag[] tags = tags("70G");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field70G(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 11A, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 11A at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98F> getField98F() {
		final List<Field98F> result = new ArrayList<Field98F>();
		final Tag[] tags = tags("98F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98J> getField98J() {
		final List<Field98J> result = new ArrayList<Field98J>();
		final Tag[] tags = tags("98J");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98J(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 98K, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 98K at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field98K objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field98K> getField98K() {
		final List<Field98K> result = new ArrayList<Field98K>();
		final Tag[] tags = tags("98K");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field98K(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92B at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92H at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92H objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92H> getField92H() {
		final List<Field92H> result = new ArrayList<Field92H>();
		final Tag[] tags = tags("92H");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92H(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92J> getField92J() {
		final List<Field92J> result = new ArrayList<Field92J>();
		final Tag[] tags = tags("92J");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92J(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92R, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92R at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92R objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92R> getField92R() {
		final List<Field92R> result = new ArrayList<Field92R>();
		final Tag[] tags = tags("92R");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92R(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 22H, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 22H at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90F, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90F at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90F objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90F> getField90F() {
		final List<Field90F> result = new ArrayList<Field90F>();
		final Tag[] tags = tags("90F");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90F(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90J, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90J at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90J objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90J> getField90J() {
		final List<Field90J> result = new ArrayList<Field90J>();
		final Tag[] tags = tags("90J");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90J(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 90K, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 90K at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field90K objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field90K> getField90K() {
		final List<Field90K> result = new ArrayList<Field90K>();
		final Tag[] tags = tags("90K");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field90K(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92L, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92L at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92L objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92L> getField92L() {
		final List<Field92L> result = new ArrayList<Field92L>();
		final Tag[] tags = tags("92L");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92L(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92M, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92M at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92M objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92M> getField92M() {
		final List<Field92M> result = new ArrayList<Field92M>();
		final Tag[] tags = tags("92M");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92M(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 92N, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 92N at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field92N objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field92N> getField92N() {
		final List<Field92N> result = new ArrayList<Field92N>();
		final Tag[] tags = tags("92N");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field92N(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 97E, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 97E at MT564 are expected at one sequence or across several sequences.
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
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 19B, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 19B at MT564 are expected at one sequence or across several sequences.
	 * 
	 * @return a List of Field19B objects or <code>Collections.emptyList()</code> if none is not found
	 * @see SwiftTagListBlock#getTagsByName(String)
	 * @throws IllegalStateException if SwiftMessage object is not initialized
	 */
	public List<Field19B> getField19B() {
		final List<Field19B> result = new ArrayList<Field19B>();
		final Tag[] tags = tags("19B");
		if (tags != null && tags.length > 0) {
            for (Tag tag : tags) {
                result.add(new Field19B(tag.getValue()));
            }
		}
		return result;
	}
	
	/**
	 * Iterates through block4 fields and return all occurrences of fields whose names matches 95Q, 
	 * or <code>Collections.emptyList()</code> if none is found.<br>
	 * Multiple occurrences of field 95Q at MT564 are expected at one sequence or across several sequences.
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
	 * Class to model Sequence "A" in MT 564
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
	 * Class to model Sequence "A1" in MT 564
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
	 * Class to model Sequence "B" in MT 564
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>USECU</em>
		 */
		public static final String START_END_16RS = "USECU";
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
	 * Class to model Sequence "B1" in MT 564
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	@com.financial.swift.internal.NonUniqueSeparator
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
	@com.financial.swift.internal.NonUniqueSeparator
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
	 * Get the single occurrence of SequenceB1 delimited by 16R/16S the value of SequenceB1#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
    *
    * <div><em>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside its parent sequences</em>
    * </div>
    *
    * @see com.financial.swift.model.mt.SequenceUtils
     *
	 * @see SequenceB1#START_END_16RS
	 */
	@com.financial.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceB1 getSequenceB1() {
		/*
		 *  the delimiter FIA is not unique across all sequences, this api can not be resolved without considering nested sequences
		 * In Sequence B1
		 */
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.financial.swift.model.mt.SequenceUtils.resolveMT564GetSequenceB1_sru2018(this);
	}
	
	/**
	 * Get the single occurrence of SequenceB1 delimited by 16R/16S the value of SequenceB1#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceB1#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceB1 within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
    *
    * <div><em>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside its parent sequences</em>
    * </div>
    *
    * @see com.financial.swift.model.mt.SequenceUtils
     *
	 */
	@com.financial.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceB1 getSequenceB1(SwiftTagListBlock parentSequence) {
		/*
		 * The delimiter FIA is not unique across all sequences, this api can not be resolved without considering nested sequences
		 * In Sequence B1
		 */
		return com.financial.swift.model.mt.SequenceUtils.resolveMT564GetSequenceB1_sru2018(new MT564().append(parentSequence));
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=B2]
	/**
	 * Class to model Sequence "B2" in MT 564
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>ACCTINFO</em>
		 */
		public static final String START_END_16RS = "ACCTINFO";
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


// BaseSequenceCodeGenerator [seq=C]
	/**
	 * Class to model Sequence "C" in MT 564
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>INTSEC</em>
		 */
		public static final String START_END_16RS = "INTSEC";
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


// BaseSequenceCodeGenerator [seq=D]
	/**
	 * Class to model Sequence "D" in MT 564
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CADETL</em>
		 */
		public static final String START_END_16RS = "CADETL";
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


// BaseSequenceCodeGenerator [seq=E]
	/**
	 * Class to model Sequence "E" in MT 564
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
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CAOPTN</em>
		 */
		public static final String START_END_16RS = "CAOPTN";
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
	 * Get the list of SequenceE delimited by 16R/16S with value specified in SequenceE#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceE#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceE> getSequenceEList() {
		return getSequenceEList(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceE delimited by 16R/16S with value specified in SequenceE#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceE#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceE within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceE> getSequenceEList(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceE.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE> result = new ArrayList<SequenceE>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceE s = new SequenceE();
				s.setTags(b.getSubBlock(SequenceE.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=E1]
	/**
	 * Class to model Sequence "E1" in MT 564
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceE1 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceE1() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceE1(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>SECMOVE</em>
		 */
		public static final String START_END_16RS = "SECMOVE";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceE1 newInstance(final Tag ... tags) {
			final SequenceE1 result = new SequenceE1();
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
		public static SequenceE1 newInstance() {
			final SequenceE1 result = new SequenceE1();
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
		public static SequenceE1 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceE1 result = new SequenceE1();
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
		private SequenceE1(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceE1 delimited by 16R/16S with value specified in SequenceE1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceE1#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceE1> getSequenceE1List() {
		return getSequenceE1List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceE1 delimited by 16R/16S with value specified in SequenceE1#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceE1#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceE1 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceE1> getSequenceE1List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceE1.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE1> result = new ArrayList<SequenceE1>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceE1 s = new SequenceE1();
				s.setTags(b.getSubBlock(SequenceE1.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=E1a]
	/**
	 * Class to model Sequence "E1a" in MT 564
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	@com.financial.swift.internal.NonUniqueSeparator
	public static class SequenceE1a extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceE1a() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceE1a(final SwiftTagListBlock content) {
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
	@com.financial.swift.internal.NonUniqueSeparator
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceE1a newInstance(final Tag ... tags) {
			final SequenceE1a result = new SequenceE1a();
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
		public static SequenceE1a newInstance() {
			final SequenceE1a result = new SequenceE1a();
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
		public static SequenceE1a newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceE1a result = new SequenceE1a();
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
		private SequenceE1a(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceE1a delimited by 16R/16S with value specified in SequenceE1a#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
    *
    * <div><em>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside its parent sequences</em>
    * </div>
    *
    * @see com.financial.swift.model.mt.SequenceUtils
     *
     * @return the found sequences or an empty list if none is found
	 * @see SequenceE1a#START_END_16RS
	 */
	@com.financial.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceE1a> getSequenceE1aList() {
  	    /*
		 * The delimiter FIA is not unique across all sequences, in this MT.
		 * The usual generated API for accessing this can not be used for sequence E1a.
		 * So we call a special method to resolve this situation until we find a better approach.
		 */
		if (this.getSwiftMessage() == null) {
			return null;
		}
		return com.financial.swift.model.mt.SequenceUtils.resolveMT564GetSequenceE1aList_sru2018(this);
	}
	/**
	 * Get the list of SequenceE1a delimited by 16R/16S with value specified in SequenceE1a#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
    *
    * <div><em>This sequence does not have a unique 16R/S delimiter. In order to be uniquely identified it must be
    * present inside its parent sequences</em>
    * </div>
    *
    * @see com.financial.swift.model.mt.SequenceUtils
     *
	 * @see SequenceE1a#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceE1a within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@com.financial.swift.internal.NonUniqueSeparator
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceE1a> getSequenceE1aList(final SwiftTagListBlock parentSequence) {
  		/*
		 * The delimiter FIA is not unique across all sequences, in this MT.
		 * The usual generated API for accessing this can not be used for sequence E1a.
		 * So we call a special method to resolve this situation until we find a better approach.
		 */
		return com.financial.swift.model.mt.SequenceUtils.resolveMT564GetSequenceE1aList_sru2018(new MT564().append(parentSequence));

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=E2]
	/**
	 * Class to model Sequence "E2" in MT 564
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceE2 extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceE2() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceE2(final SwiftTagListBlock content) {
			super(content.getTags());
		}

		/**
		 * Value for the qualifier of the 16R / 16S tag that indicates start and end of this sequence <em>CASHMOVE</em>
		 */
		public static final String START_END_16RS = "CASHMOVE";
		public static final Tag START_TAG = new Tag(Field16R.NAME, START_END_16RS);
		public static final Tag END_TAG = new Tag(Field16S.NAME, START_END_16RS);

		/**
		 * Creates a new instance of this sequence with the given tags inside.
		 * @param tags may be null, an empty sequence containing only start and end sequence tags will be returned
		 * @return a new instance of the sequence, initialized with the parameter tags
		 */
		@SequenceStyle(Type.GENERATED_16RS)
		public static SequenceE2 newInstance(final Tag ... tags) {
			final SequenceE2 result = new SequenceE2();
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
		public static SequenceE2 newInstance() {
			final SequenceE2 result = new SequenceE2();
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
		public static SequenceE2 newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceE2 result = new SequenceE2();
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
		private SequenceE2(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}

	/**
	 * Get the list of SequenceE2 delimited by 16R/16S with value specified in SequenceE2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
     * @return the found sequences or an empty list if none is found
	 * @see SequenceE2#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public List<SequenceE2> getSequenceE2List() {
		return getSequenceE2List(super.getSwiftMessageNotNullOrException().getBlock4());
	}
	/**
	 * Get the list of SequenceE2 delimited by 16R/16S with value specified in SequenceE2#START_END_16RS
	 * The presence of this method indicates that this sequence can occur more than once according to the Standard.
	 * @see SequenceE2#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceE2 within the complete message
	 * @return the found sequences or an empty list if none is found
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static List<SequenceE2> getSequenceE2List(final SwiftTagListBlock parentSequence) {
		final List<SwiftTagListBlock> blocks = parentSequence.getSubBlocks(SequenceE2.START_END_16RS);
		if (blocks != null && !blocks.isEmpty()) {
			final List<SequenceE2> result = new ArrayList<SequenceE2>(blocks.size());
			for (final SwiftTagListBlock b:blocks) {
				final SequenceE2 s = new SequenceE2();
				s.setTags(b.getSubBlock(SequenceE2.START_END_16RS).getTags());
				result.add(s);
			}
			return result; 
		}
		// TODO if is is mandatory issue a warning log
		return Collections.emptyList();

	} 	
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator


// BaseSequenceCodeGenerator [seq=F]
	/**
	 * Class to model Sequence "F" in MT 564
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static class SequenceF extends SwiftTagListBlock {
		private static final long serialVersionUID = 1L;
		
		/**
		 * Constructs an empty sequence
		 */
	    private SequenceF() {
			super(new ArrayList<Tag>());
		}

		/**
		 * Creates a sequence with the given content.
		 * @see SwiftTagListBlock
		 */
		private SequenceF(final SwiftTagListBlock content) {
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
		public static SequenceF newInstance(final Tag ... tags) {
			final SequenceF result = new SequenceF();
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
		public static SequenceF newInstance() {
			final SequenceF result = new SequenceF();
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
		public static SequenceF newInstance(final SwiftTagListBlock ... sequences) {
			final SequenceF result = new SequenceF();
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
		private SequenceF(final SwiftMessage m) {
			super();
			if (m.getBlock4() != null) {
				setTags(m.getBlock4().getSubBlock(START_END_16RS).getTags());
			}
		}

	}
	/**
	 * Get the single occurrence of SequenceF delimited by 16R/16S the value of SequenceF#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @return the found sequence or an empty sequence if none is found
	 * @see SequenceF#START_END_16RS
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public SequenceF getSequenceF() {
		return new SequenceF(super.getSwiftMessageNotNullOrException());
	}
	
	/**
	 * Get the single occurrence of SequenceF delimited by 16R/16S the value of SequenceF#START_END_16RS.
	 * The presence of this method indicates that this sequence can occur only once according to the Standard.
	 * @see SequenceF#START_END_16RS
	 * @param parentSequence an optional parent sequence or null to find SequenceF within the complete message
	 * @return the found sequence or an empty sequence if none is found, <em>never returns null</em>
	 * @since 7.7
	 */
	@SequenceStyle(Type.GENERATED_16RS)
	public static SequenceF getSequenceF(SwiftTagListBlock parentSequence) {
		final SequenceF s = new SequenceF();
		s.setTags(parentSequence.getSubBlock(SequenceF.START_END_16RS).getTags());
		return s;
	}
 	// Slice debug: com.financial.swift.codegen.velocity.mt.DelimitedSequenceCodeGenerator




}
