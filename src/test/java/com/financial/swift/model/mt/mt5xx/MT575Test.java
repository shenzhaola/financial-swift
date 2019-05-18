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

import static org.junit.Assert.*;

import org.junit.Test;

import com.financial.swift.model.mt.mt5xx.MT575;


public class MT575Test {

	@Test
	public void test1() {
		MT575 m = new MT575();
		m.append(MT575.SequenceA1.newInstance());
		assertTrue(m.getSequenceB1a1List().isEmpty());
		assertTrue(m.getSequenceC1List().isEmpty());
	}
	
	@Test
	public void test2() {
		MT575 m = new MT575();
		m.append(MT575.SequenceB1a1.newInstance());
		assertTrue(m.getSequenceA1List().isEmpty());
		assertTrue(m.getSequenceC1List().isEmpty());
	}
	
	@Test
	public void test3() {
		MT575 m = new MT575();
		m.append(MT575.SequenceC1.newInstance());
		assertTrue(m.getSequenceA1List().isEmpty());
		assertTrue(m.getSequenceB1a1List().isEmpty());
	}
	
	@Test
	public void test4() {
		MT575 m = new MT575();
		m.append(MT575.SequenceB1a4.newInstance());
		assertTrue(m.getSequenceC2aList().isEmpty());
	}
	
	@Test
	public void test5() {
		MT575 m = new MT575();
		m.append(MT575.SequenceC2a.newInstance());
		assertTrue(m.getSequenceB1a4List().isEmpty());
	}
	
}
