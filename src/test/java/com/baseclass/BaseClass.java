package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void input_text(WebElement element, String value) { // typeText
		element.sendKeys(value);

	}

	public static void click_Value(WebElement element) {
		element.click();

	}

	public static String prop_Test(String data) {
		String value = null;

		try {

			FileReader read = new FileReader(
					"/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/config.properties");
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String excelDataReuse(int i,int j) { //1,0 = 35
		String value = null;

		try {
			File f = new File(
					"/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i); 
		    Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if (cellType == 1) {
						value = cell.getStringCellValue();
						System.out.println(value);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dataCellValue = cell.getDateCellValue(); // 11-Feb-2024
							SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy"); // 11/02/2024
							value = sim.format(dataCellValue);
							System.out.println(value);
						} else {
							double numbricCellValue = cell.getNumericCellValue();
							long l = (long) numbricCellValue;
							value = String.valueOf(l);
							System.out.println(value);
						}

					}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}
	
	public static Object[][] getExcelSheetValue(String sheetName) {
		Object[][] arrayData = null;
		
		try {
			File f = new File(
					"/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			
			int noOfrows = sheet.getPhysicalNumberOfRows();
			System.out.println(noOfrows);
			Row row = sheet.getRow(1); 
			int noOfCells = row.getPhysicalNumberOfCells();
			System.out.println(noOfCells);
		    
		    
		    arrayData = new Object[noOfrows][noOfCells];
		    
		   for (int i = 1; i < noOfrows; i++) {
			   for (int j = 0; j < noOfCells; j++) {
//				   arrayData[i][j] = row.getCell(noOfCells).getStringCellValue();
				   Cell cell = sheet.getRow(i).getCell(j);
				   int cellType = cell.getCellType();
					if (cellType == 1) {
						arrayData[i][j] = cell.getStringCellValue();
						System.out.println(arrayData[i][j]);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dataCellValue = cell.getDateCellValue(); // 11-Feb-2024
							SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy"); // 11/02/2024
							arrayData[i][j] = sim.format(dataCellValue);
							System.out.println(arrayData[i][j]);
						} else {
							double numbricCellValue = cell.getNumericCellValue();
							long l = (long) numbricCellValue;
							arrayData[i][j] = String.valueOf(l);
							System.out.println(arrayData[i][j]);
						}

					}
		}
				   
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return arrayData;
	}
	
	public static void openBrowser(String browserType,String url) {
		switch (browserType) {
		case "edge":
			driver = new EdgeDriver();
			driver.get(url);
			break;
		case "chrome":
			driver = new ChromeDriver();
			driver.get(url);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = new FirefoxDriver();
		}
	}
	
	

}
