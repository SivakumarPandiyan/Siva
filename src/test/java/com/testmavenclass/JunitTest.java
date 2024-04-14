package com.testmavenclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

public class JunitTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test Method 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
}
