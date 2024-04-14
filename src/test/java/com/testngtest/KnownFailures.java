package com.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailures {
	
	
	@Test(retryAnalyzer=Failed_Test_Retry.class)
	public void test1() throws InterruptedException {
			Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(true);
		
	}

}
