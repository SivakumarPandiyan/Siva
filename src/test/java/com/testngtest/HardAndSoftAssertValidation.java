package com.testngtest;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertValidation {
	
//	@Test
//	public void hardAssert() {
//		
//		System.out.println("Before Hard Assertion");
//		String s = "Aiite";
//		Assert.assertTrue(s.contains("a"));
//		System.out.println("After Hard Assertion");
//		
//	}
	
	@Test
	public void softAssert() {
		
		System.out.println("Before Soft Assertion");
		String s = "Aiite";
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(s.contains("A"));
		System.out.println("After Soft Assertion");
		
	}

}
