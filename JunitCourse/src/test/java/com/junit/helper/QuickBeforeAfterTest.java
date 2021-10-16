package com.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setup() {
		System.out.println("Before runs before every test method");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@After
	public void tearDown() {
		System.out.println("After runs after every test method");
	}

}
