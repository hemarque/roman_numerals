package com.helder.katas.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRoman {

	private Object intToRoman(int decimal) {
		final int[] baseDecimals = { 1000, 900, 500, 400, 100, 90, 50, 40, 10,
				9, 5, 4, 1 };
		final String[] baseRomans = { "M", "CM", "D", "CD", "C", "XC", "L",
				"XL", "X", "IX", "V", "IV", "I" };
		String roman = "";
		for (int i = 0; i < baseDecimals.length; i++) {
			while (decimal > (baseDecimals[i] - 1)) {
				roman += baseRomans[i];
				decimal -= baseDecimals[i];
			}
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

	@Test
	public void testFive() throws Exception {
		assertEquals("Not expected roman numeral", "V", intToRoman(5));
	}

	@Test
	public void testSix() throws Exception {
		assertEquals("Not expected roman numeral", "VI", intToRoman(6));
	}

	@Test
	public void testSeven() throws Exception {
		assertEquals("Not expected roman numeral", "VII", intToRoman(7));
	}

	@Test
	public void test1999() throws Exception {
		assertEquals("Not expected roman numeral", "MCMXCIX", intToRoman(1999));
	}

	@Test
	public void test2444() throws Exception {
		assertEquals("Not expected roman numeral", "MMCDXLIV", intToRoman(2444));
	}
}
