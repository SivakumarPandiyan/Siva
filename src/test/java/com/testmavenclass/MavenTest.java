package com.testmavenclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.locator.Locators;

public class MavenTest extends BaseClass {
	
	
	
	

	public static void main(String[] args) throws InterruptedException  {
		
		BaseClass.browserLaunch(prop_Test("url"));

		Thread.sleep(3000);

		BaseClass.input_text(Locators.getUserName(), prop_Test("username"));

		BaseClass.input_text(Locators.getPassword(), prop_Test("password"));

		BaseClass.click_Value(Locators.clickLoginButton());

		BaseClass.driver.quit();

		

	}

}
