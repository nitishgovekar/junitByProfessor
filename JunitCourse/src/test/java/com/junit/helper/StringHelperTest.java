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
	
	// ABCD ==> false , ABAB ==> true, AB ==> false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharacters_TheNegativePositiveScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
/*
  assertEquals("ABC", "ABCD");
   org.junit.ComparisonFailure: expected:<ABC[]>but was:<ABC[D]>
 */