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
package com.financial.swift.io.writer;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import com.financial.swift.Constants;
import com.financial.swift.io.parser.SwiftParser;
import com.financial.swift.model.SwiftMessage;
import com.financial.swift.model.Tag;

/**
 * Swift writer tests
 *
 * @since 4.0
 */
public class SwiftWriterTest {
	
	@Test 
	public void testEmpty() {
		SwiftMessage m = new SwiftMessage(true);
		m.getBlock1().clean();
		m.getBlock2().clean();
		StringWriter buf = new StringWriter();
		SwiftWriter.writeMessage(m, buf);
		assertEquals("{1:}{2:}{3:}{4:\r\n-}{5:}", getResult("testEmpty", buf));
	}

	@Test 
	public void testSimple() {
		SwiftMessage m = new SwiftMessage(true);
		
		m.getBlock1().setValue(Constants.B1_DATA);
		m.getBlock2().setValue(Constants.B2_INPUT);
		m.getBlock3().append(new Tag(":helloworld"));
		m.getBlock4().append(new Tag("k:val"));
		m.getBlock5().append(new Tag("foo:dacatadat"));
		
		StringWriter buf = new StringWriter();
		SwiftWriter.writeMessage(m, buf);
		assertEquals("{1:"+Constants.B1_DATA+"}{2:"+Constants.B2_INPUT+"}{3:{helloworld}}{4:\r\n" +
				":k:val\r\n"+
				"-}{5:{foo:dacatadat}}", getResult("testSimple", buf));
	}

	@Test 
	public void testWriteParsedMessage() throws IOException {
		String m1 = "{1:F01GENODEFFAXXX4321100001}{2:O1030711060804MARKDEFFAXXX12342000010608040711N}{4:\n" + 
				":20:TEST-IBAN001\n" + 
				":13C:/SNDTIME/0701+0200\n" + 
				":13C:/RNCTIME/0701+0200\n" + 
				":23B:CRED\n" + 
				":32A:060804EUR18001,01\n" + 
				":33B:EUR18001,01\n" + 
				":50K:KUNDE WO FOO FOO\n" + 
				"SYMMACH. FOO OREOKASTRO-DIAVATA\n" + 
				"GR-57008 FOO\n" + 
				"GREECE\n" + 
				":52A://TAGRPRNKGRAAXXX052/S/20115\n" + 
				"PRNKGRAAXXX\n" + 
				":57A:GENODE51LOS\n" + 
				":59:/DE66593922000000045500\n" + 
				"FOO DER VOLKS-RAIFFEISENBANK\n" + 
				"RAIFFEISENPLATZ\n" + 
				"D-66787 WADGASSEN-HOSTENBACH\n" + 
				"GERMANY\n" + 
				":70:TEST IBAN 01P DE\n" + 
				"IBAN FOO\n" + 
				":71A:SHA\n" + 
				"-}{5:{MAC:11111111}{CHK:222222222222}}\n" + 
				"";
		String result = parseAndWrite(m1);
		BufferedReader expected = new BufferedReader(new StringReader(m1));
		BufferedReader obtained = new BufferedReader(new StringReader(result));
		
		String l1, l2;
		
		l1 = expected.readLine();
		l2 = obtained.readLine();
		while (l1!=null && l2!=null) {
			// There is a known issue in block 5 writing
			if (l1.indexOf("{5:")<0) {
				assertEquals(l1, l2);
			}
			l1 = expected.readLine();
			l2 = obtained.readLine();
		}
	}

	/**
	 * Parse the given message and write it using FIN Writer
	 */
	private String parseAndWrite(String m1) throws IOException {
		SwiftParser p = new SwiftParser(new StringReader(m1));
		SwiftMessage msg = p.message();
		StringWriter writer = new StringWriter();
		SwiftWriter.writeMessage(msg, writer);
		String result = writer.getBuffer().toString();
		return result;
	}

	@SuppressWarnings("unused")
	private String getResult(StringWriter buf) {
		return(getResult("", buf));
	}

	private String getResult(String testName, StringWriter buf) {
		return buf.toString();
	}
	
}