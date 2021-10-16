package com.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testAssertArrayEquals() {

	int [] numbers = {12,10,1,2};
	int [] expectedValue = {1,2,10,12};
	Arrays.sort(numbers);
	assertArrayEquals(expectedValue, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int [] numbers = null;
		Arrays.sort(numbers);
	}
}
