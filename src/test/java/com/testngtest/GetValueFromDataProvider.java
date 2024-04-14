package com.testngtest;

import org.testng.annotations.Test;

public class GetValueFromDataProvider {
	
	
	@Test(dataProvider="factory",dataProviderClass=TestDataProvider.class)
	public void getData(Object val1,Object val2,Object val3,Object val4) {
		System.out.println("User Name: " + val1 + " Password: " + val2 + " Age: " + val3 + " DOB: " + val4);
	}
	
	// We can read data from data provider using methodName!
//	@DataProvider
//	public Object[][] dataFactory() {
//		return new Object[][] {
//			{"Mohamed","Mustafa"},
//			{20,false},
//			{4000.0,'a'}
//		};
//	}
	
//	 We can read data from data provider using name attribute!
//	@DataProvider(name="factory")
//	public Object[][] dataFactory() {
//		return new Object[][] {
//			{"Mohamed","Mustafa"},{20,false},{4000.0,'a'}
//		};
//	}
	
	
	
	
	
	

}
