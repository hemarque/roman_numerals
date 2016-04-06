package com.helder.katas.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRoman {

	private Object intToRoman(int i) {
		String roman = "";
		while (i-- > 0) {
			roman += "I";
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

}
