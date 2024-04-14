package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class Locators extends BaseClass {   /// without pagefactory
	
	
	public static WebElement getUserName() {
		return driver.findElement(By.id("username"));
	}
	
	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement clickLoginButton() {
		 return driver.findElement(By.id("login"));
	}

}
