package com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Locators_WithPageFactory extends BaseClass { //with PageFactory
	
	// @FindBy -- @FindBYs -- @FindAll --- PageFactory
	
	//@FindBy - we can identity unique web elements, it can be used to locate the following: 
	// id, name, className, tagName, linkText, partialLinkText, Xpath, and CSS
	
	//We need to match more than one locator for the Web Element, there are two options:
	// FindBys - AND operator == both conditions should pass
	
	// FindAll - OR condition == either one condition should pass
	//We need to match more than one locator for the Web Element, there are two options:
	
	//@FindBy
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement logingBtn;
	
    public Locators_WithPageFactory() {
		PageFactory.initElements(driver, this);
	}
    public WebElement getUserName() {
    	return userName;
    }
    public WebElement getPassword() {
    	return password;
    }
    public WebElement getLoginBtn() {
    	return logingBtn;
    }

}
