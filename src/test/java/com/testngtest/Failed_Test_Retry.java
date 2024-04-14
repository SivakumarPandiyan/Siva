package com.testngtest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_Test_Retry implements IRetryAnalyzer {

	int min =1, max=5;
	@Override
	public boolean retry(ITestResult result) {
		if(min<=max) {
			min++;
			return true;
		}
		return false;
	}
	
	

}
