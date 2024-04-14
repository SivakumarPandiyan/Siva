package com.testngtest;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
	
	@Test(dependsOnMethods= {"login"},alwaysRun=true)
	public void searchHotel() {
		System.out.println("Test user Method");
	}
	
	@Test(dependsOnMethods= {"searchHotel"},alwaysRun=true)
	public void pass() {
		System.out.println("Test pass Method");
	}
	
//	@Test
//	public void fail() {
//		System.out.println("Test fail Method");
//	}
	
	@Test(description="This method belongs to login funcationality")
	public void login() {
		Assert.assertFalse(true);
		System.out.println("Test login Method");
	}

}
