package com.testmavenclass;

import com.baseclass.BaseClass;
import com.locator.Locators;
import com.locator.Locators_WithPageFactory;

public class ExecutionWithPageFactory extends BaseClass {
	
public static void main(String[] args) throws InterruptedException {
		
		BaseClass.browserLaunch(prop_Test("url"));

		Thread.sleep(3000);
		Locators_WithPageFactory pgFac = new Locators_WithPageFactory();

		BaseClass.input_text(pgFac.getUserName(), excelDataReuse(1, 0));

		BaseClass.input_text(pgFac.getPassword(), prop_Test("password"));

		BaseClass.click_Value(pgFac.getLoginBtn());

		BaseClass.driver.quit();

		

	}
	
	
	

}
