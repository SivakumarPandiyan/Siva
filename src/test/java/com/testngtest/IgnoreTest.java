package com.testngtest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	// One of the options to skip a test 
	@Ignore
	@Test
	public void test1() {
		System.out.println("test 1 method");
	}
	
	// another example to skip a test 
	@Test(enabled=false)
	public void test2() {
		System.out.println("test 2 method");
	}
	
	@Test(enabled=true)
	public void test3() {
		System.out.println("test 3 method");
	}
	
	
	
	
	
	

}
