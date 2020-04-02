package com.epam.TDDJUNIT;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class RemoveCharATest {

	/*TODO LIST
	 * 1. "" = ""  - SUCCESS
	 * 2. A = "" , Z = Z   - SUCCESS
	 * 3. AA = "" , ZZ = ZZ  ,AZ = Z  - SUCCESS
	 * 4. AZZF = ZZF,ASASAS = SSS , BAD = BD , WIN = WIN , AABAA = BAA  - SUCCESS
	 */
	RemoveCharA removeChara;
	@BeforeEach
	void initialization()
	{
		removeChara = new RemoveCharA(); 
	}

	@Test
	void testNull() {
		assertEquals("",removeChara.removeA(""));
	}
	@Test
	void testOneChar() {
		assertEquals("",removeChara.removeA("A"));
		assertEquals("Z",removeChara.removeA("Z"));
	}
	@Test
	void testTwoChar() {
		assertEquals("",removeChara.removeA("AA"));
		assertEquals("Z",removeChara.removeA("ZA"));
		assertEquals("Z",removeChara.removeA("AZ"));
		assertEquals("ZZ",removeChara.removeA("ZZ"));
	}
	@Test
	void testNChar() {
		assertEquals("ZZF",removeChara.removeA("AZZF"));
		assertEquals("SAS",removeChara.removeA("ASAS"));
		assertEquals("BD",removeChara.removeA("BAD"));
		assertEquals("WIN",removeChara.removeA("WIN"));
		assertEquals("BAA",removeChara.removeA("AABAA"));
	}

}