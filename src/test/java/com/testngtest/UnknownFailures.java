package com.testngtest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailures  {
	
	@Test
	public void test1()  {
			AssertJUnit.assertTrue(false);
	}
	
	@Test
	public void test2() {
		AssertJUnit.assertTrue(false);
		
	}
	
	@Test
	public void test3() {
		AssertJUnit.assertTrue(true);
		
	}

}
