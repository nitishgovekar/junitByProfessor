package com.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		//We can only intialize class level things in @BeforeClasss
		System.out.println("Before Class");
	}
	
	
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
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
