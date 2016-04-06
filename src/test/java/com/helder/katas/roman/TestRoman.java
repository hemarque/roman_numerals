package com.helder.katas.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRoman {

	private Object intToRoman(int i) {
		String roman = "";
		while (i > 3) {
			roman += "IV";
			i -= 4;
		}
		while (i > 0) {
			roman += "I";
			i -= 1;
		}

		return roman;
	}

	@Test
	public void testOne() {
		assertEquals("Not expected roman numeral", "I", intToRoman(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals("Not expected roman numeral", "II", intToRoman(2));
	}

	@Test
	public void testThree() throws Exception {
		assertEquals("Not expected roman numeral", "III", intToRoman(3));
	}

	@Test
	public void testFour() throws Exception {
		assertEquals("Not expected roman numeral", "IV", intToRoman(4));
	}
}
