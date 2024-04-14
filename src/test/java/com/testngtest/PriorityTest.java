package com.testngtest;

import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test(priority=-1)
	public void user() {
		System.out.println("Test user Method");
	}
	
	@Test(priority=0)
	public void pass() {
		System.out.println("Test pass Method");
	}
	
	@Test(priority=1)
	public void fail() {
		System.out.println("Test fail Method");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Test login Method");
	}
	
	
	
	

}
