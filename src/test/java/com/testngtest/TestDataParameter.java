package com.testngtest;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDataParameter {
	
	
	@Parameters({"username","password"})
	@Test
	public void userName(String user, String password) {
		System.out.println(user);
		System.out.println(password);
	}
	
	@Parameters({"username2","password1"})
	@Test
	public void userName1(@Optional("Mustafa2")String user, String password) {
		System.out.println(user);
		System.out.println(password);
	}
	
	
	
	
	
	

}
