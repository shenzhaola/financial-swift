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

package com.financial.swift.model.mx;

import static org.junit.Assert.assertNotNull;

import javax.xml.bind.annotation.XmlRootElement;

import org.junit.Test;
import org.w3c.dom.Element;

public class AbstractMXTest {

	@Test
	public void testElement() {
		MockMsg m = new MockMsg();
		m.setContent("Hello World!");
		Element e = m.element();
		assertNotNull(e);
	}

}

@XmlRootElement
final class MockMsg extends AbstractMX {
	private String content;
	
	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getClasses() {
		return new Class[]{MockMsg.class};
	}

	@Override
	public String getNamespace() {
		return "foo:namespace";
	}

	@Override
	public String getBusinessProcess() {
		return null;
	}

	@Override
	public int getFunctionality() {
		return 0;
	}

	@Override
	public int getVariant() {
		return 0;
	}

	@Override
	public int getVersion() {
		return 0;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
