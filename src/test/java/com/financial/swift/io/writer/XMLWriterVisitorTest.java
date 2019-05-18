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

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.ParserConfigurationException;

import org.custommonkey.xmlunit.XMLTestCase;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.financial.swift.Constants;
import com.financial.swift.model.SwiftBlock1;
import com.financial.swift.model.SwiftBlock2;
import com.financial.swift.model.SwiftBlock2Input;
import com.financial.swift.model.SwiftBlock2Output;
import com.financial.swift.model.SwiftBlock3;
import com.financial.swift.model.SwiftBlock4;
import com.financial.swift.model.SwiftBlock5;
import com.financial.swift.model.SwiftMessage;
import com.financial.swift.model.Tag;

/**
 * XML writer tests
 *
 * @since 4.0
 */
public class XMLWriterVisitorTest extends XMLTestCase {

	private XMLWriterVisitor visitor;
	private Writer io;
	private SwiftMessage msg;
	
	@Before
	public void setUp() {
		this.io = new StringWriter();
		this.visitor = new XMLWriterVisitor(this.io);
		this.msg = new SwiftMessage();
		this.msg.clear();					// some tests require that there are no extra blocks
		XMLUnit.setIgnoreWhitespace(true);
	}

	@SuppressWarnings("unused")
	private String getResult() {
		return(this.getResult(""));
	}

	private String getResult(String testName) {
		msg.visit(visitor);
		return this.io.toString();
	}
	
	@Test 
	public void testEmpty() throws SAXException, IOException, ParserConfigurationException {
		msg.setBlock1(null);
		msg.setBlock2(null);
		msg.setBlock3(null);
		msg.setBlock4(null);
		msg.setBlock5(null);

		assertXMLEqual("<message/>", getResult("testEmpty"));
	}
	
	@Test 
	public void testEmptyBlocks() throws SAXException, IOException, ParserConfigurationException {
		msg.setBlock1(new SwiftBlock1());
		msg.getBlock1().setApplicationId(null);
		msg.getBlock1().setServiceId(null);
		msg.getBlock1().setSessionNumber(null);
		msg.getBlock1().setSequenceNumber(null);
		msg.setBlock2(new SwiftBlock2Input());
		msg.getBlock2().setMessagePriority(null);
		msg.setBlock3(new SwiftBlock3());
		msg.setBlock4(new SwiftBlock4());
		msg.setBlock5(new SwiftBlock5());

		String xml = "<message><block1/>\n<block2/>\n<block3/>\n<block4/>\n<block5/>\n</message>";
		assertXMLEqual(xml, getResult("testEmptyBlocks"));
	}
	
	@Test 
	public void testWithTags() throws SAXException, IOException, ParserConfigurationException {
		String xml = "<message>" +
				Constants.B1_DATA_XML +
				"\n<block4>" +
				"\n\t<tag>" +
				"\n\t\t<name>t1</name>" +
				"\n\t\t<value>v1</value>"+
				"\n\t</tag>"+
				"\n</block4>"+
				"\n</message>";
		msg.clear();
		SwiftBlock1 b1 = new SwiftBlock1();
		b1.setValue(Constants.B1_DATA);
		SwiftBlock4 b4 = new SwiftBlock4();
		b4.append(new Tag("t1:v1"));
		msg.setBlock1(b1);
		msg.setBlock4(b4);
		assertXMLEqual(xml, getResult("testWithTags"));
	}
	
	@Test 
	public void testBug1539324_1() throws SAXException, IOException, ParserConfigurationException {
		SwiftBlock1 b1 = new SwiftBlock1();
		b1.setValue(Constants.B1_DATA);
		msg.setBlock1(b1);
		
		SwiftBlock2 b2 = new SwiftBlock2Input();
		b2.setValue(Constants.B2_INPUT);
		msg.setBlock2(b2);
		
		String xml = "<message>\n" + 
		Constants.B1_DATA_XML + 
		Constants.B2_INPUT_XML + 
		"</message>";
		assertXMLEqual(xml, getResult("testBug1539324_1"));
	}
	
	@Test 
	public void testBug1539324_2() throws SAXException, IOException, ParserConfigurationException {
		SwiftBlock1 b1 = new SwiftBlock1();
		b1.setValue(Constants.B1_DATA);
		msg.setBlock1(b1);
		
		SwiftBlock3 b3 = new SwiftBlock3();
		b3.append(new Tag("n:v"));
		msg.setBlock3(b3);
		
		msg.setBlock2(new SwiftBlock2Input());
		msg.getBlock2().setMessagePriority(null);
		msg.setBlock4(new SwiftBlock4());
		msg.setBlock5(new SwiftBlock5());

		String xml = "<message>\n" + 
		Constants.B1_DATA_XML+
		"<block2></block2>\n" + 
		"<block3>"+
		"\n\t<tag>"+
		"\n\t\t<name>n</name>"+
		"\n\t\t<value>v</value>"+
		"\n\t</tag>"+
		"\n</block3>"+ 
		"\n<block4>\n</block4>" + 
		"\n<block5>\n</block5>" + 
		"\n</message>";
		assertXMLEqual(xml, getResult("testBug1539324_2"));
	}
	
	@Test 
	public void testBug1540294_1 () throws SAXException, IOException, ParserConfigurationException {
		msg.clear();
		SwiftBlock4 b4 = new SwiftBlock4();
		b4.append(new Tag("t1", "v1"));
		b4.append(new Tag("t2", "v2"));
		msg.setBlock4(b4);
		
		String xml = "<message>\n" + 
		"<block4>"+
		"\n\t<tag>"+
		"\n\t\t<name>t1</name>"+
		"\n\t\t<value>v1</value>"+
		"\n\t</tag>"+
		"\n\t<tag>"+
		"\n\t\t<name>t2</name>"+
		"\n\t\t<value>v2</value>"+
		"\n\t</tag>"+
		"\n</block4>"+ 
		"</message>";
		assertXMLEqual(xml, getResult("testBug1540294_1"));
	}
	
	@Test 
	public void testBlock2Output_1() throws SAXException, IOException, ParserConfigurationException {
		msg.clear();
		SwiftBlock1 b1 = new SwiftBlock1();
		b1.setValue(Constants.B1_DATA);
		msg.setBlock1(b1);
		
		SwiftBlock2 b2 = new SwiftBlock2Output();
		b2.setValue(Constants.B2_OUTPUT);
		msg.setBlock2(b2);
		
		String xml = "<message>\n" + 
		Constants.B1_DATA_XML + 
		Constants.B2_OUTPUT_XML + 
		"</message>";
		assertXMLEqual(xml, getResult("testBlock2Output_1"));
	}
	
	@Test 
	public void testBlock2Output() throws SAXException, IOException, ParserConfigurationException {
		msg.clear();
		
		SwiftBlock2 b2 = new SwiftBlock2Output();
		b2.setValue(Constants.B2_OUTPUT);
		msg.setBlock2(b2);
		
		String xml = "<message>\n" + 
		Constants.B2_OUTPUT_XML + 
		"</message>";
		String got = getResult("testBlock2Output");
		assertXMLEqual(xml, got);
	}
	
	@Test 
	public void testTagSerialization () throws SAXException, IOException, ParserConfigurationException {
		msg.clear();
		SwiftBlock4 b4 = new SwiftBlock4();
		b4.append(new Tag("26C", "/LONDON/UNFOOGOLD"));
		msg.setBlock4(b4);
		
		String xml = "<message>\n" + 
		"<block4>"+
		"\n\t<tag>"+
		"\n\t\t<name>26C</name>"+
		"\n\t\t<value>/LONDON/UNFOOGOLD</value>"+
		"\n\t</tag>"+
		"\n</block4>"+ 
		"</message>";
		assertXMLEqual(xml, getResult("testTagSerialization"));
	}
	
	@Test 
	public void testFieldSerialization () throws SAXException, IOException, ParserConfigurationException {
		msg.clear();
		msg.setBlock4(new SwiftBlock4());
		
		msg.getBlock4().append(new Tag("26C", "/LONDON/UNFOOGOLD"));
		//workaround
		//mt.getSwiftMessage().getBlock4().append(new Tag("26C", "/LONDON/UNFOOGOLD"));
				
		String xml = "<message>\n" + 
		"<block4>"+
		"\n\t<tag>"+
		"\n\t\t<name>26C</name>"+
		"\n\t\t<value>/LONDON/UNFOOGOLD</value>"+
		"\n\t</tag>"+
		"\n</block4>"+ 
		"</message>";
		assertXMLEqual(xml, getResult("testFieldSerialization"));
	}

	@Test 
	public void testWithTags_asField() throws SAXException, IOException, ParserConfigurationException {
		String xml = "<message>" +
				Constants.B1_DATA_XML +
				"\n<block4>" +
				"\n\t<field>" +
				"\n\t\t<name>16R</name>" +
				"\n\t\t<component number=\"1\">TEST</component>"+
				"\n\t</field>"+
				"\n</block4>"+
				"\n</message>";
		msg.clear();
		SwiftBlock1 b1 = new SwiftBlock1();
		b1.setValue(Constants.B1_DATA);
		SwiftBlock4 b4 = new SwiftBlock4();
		b4.append(new Tag("16R:TEST"));
		msg.setBlock1(b1);
		msg.setBlock4(b4);
		this.visitor = new XMLWriterVisitor(this.io, true);
		assertXMLEqual(xml, getResult("testWithTags"));
	}

}