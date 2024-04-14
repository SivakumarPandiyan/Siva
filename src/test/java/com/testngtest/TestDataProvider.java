package com.testngtest;

import org.testng.annotations.DataProvider;

import com.baseclass.BaseClass;

public class TestDataProvider extends BaseClass{
	
	
//	@DataProvider(name="factory")
//	public Object[][] dataFactory() {
//		return new Object[][] {
//			{"Mohamed","Mustafa"},{20,false},{4000.0,'a'}
//		};
//	}
	
	@DataProvider(name="factory")
	public Object[][] dataFactory() {
		return new Object[][] {
			{BaseClass.excelDataReuse(1, 0),BaseClass.excelDataReuse(1, 1),BaseClass.excelDataReuse(1, 2),BaseClass.excelDataReuse(1, 3)}
//			{BaseClass.getExcelSheetValue("Sheet1")}
		};
	}

}
