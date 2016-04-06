package com.helder.katas.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRoman {

	private Object intToRoman(int i) {
		return "I";
	}

	@Test
	public void testOne() {
		assertEquals("Not expected roman numeral", "I", intToRoman(1));
	}

}
