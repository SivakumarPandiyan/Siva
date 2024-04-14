package com.testmavenclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import com.baseclass.BaseClass;
import com.locator.Locators_WithPageFactory;

public class JunitExecution extends BaseClass {
	
	
	@BeforeClass
	public static void browserLoad() {
		BaseClass.browserLaunch(prop_Test("url"));
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		// refresh
		// username and password field need to cleared. 
	}
	
	@Test
	public void validUsnAndPwd() {
		Locators_WithPageFactory pgFac = new Locators_WithPageFactory();

		BaseClass.input_text(pgFac.getUserName(), excelDataReuse(1, 0));

		BaseClass.input_text(pgFac.getPassword(), prop_Test("password"));

		BaseClass.click_Value(pgFac.getLoginBtn());
		
//		String userTitle = "Hello Nandhini07!";
		
//		Assert.assertEquals(false, userTitle);
	}
	
	
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	@AfterClass
	public static void browserQuit() {
		BaseClass.driver.quit();
	}
	
	
	

}
