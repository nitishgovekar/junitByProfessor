package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
}
/*
  assertEquals("ABC", "ABCD");
   org.junit.ComparisonFailure: expected:<ABC[]>but was:<ABC[D]>
 */