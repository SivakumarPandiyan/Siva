package com.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	public static void excelRead() {
		
		try {
			File f = new File("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); // - to access the workbook
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(1);
			Cell cell = row.getCell(0);
			System.out.println(cell);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void excelRead_AllData() {
		
		try {
			File f = new File("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); // - to access the workbook
			Sheet sheet = wb.getSheet("Sheet1");
			int phsicalNumberofRows = sheet.getPhysicalNumberOfRows();
			
			for(int i=0;i<phsicalNumberofRows; i++ ) { // outter for loop -- row -- 0=0+1=1
				Row row = sheet.getRow(i); // row -- 1
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for(int j=0; j<physicalNumberOfCells;j++) { // inner for loop
					Cell cell = row.getCell(j);// cell - 0 - UserName, cell - 1 - Password, cell2-age
					System.out.print(cell+ "    " + "|");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
    public static void excelRead_CellValue() {
		
		try {
			File f = new File("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); 
			Sheet sheet = wb.getSheet("Sheet1");
			int phsicalNumberofRows = sheet.getPhysicalNumberOfRows();
			
			for(int i=0;i<phsicalNumberofRows; i++ ) { 
				Row row = sheet.getRow(i); // 
				int physicalNumberOfCells = row.getPhysicalNumberOfCells();
				for(int j=0; j<physicalNumberOfCells;j++) { 
					Cell cell = row.getCell(j);
					int cellType = cell.getCellType();
					if(cellType == 1) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					} else if (cellType == 0) {
						if (DateUtil.isCellDateFormatted(cell)) {
							Date dataCellValue = cell.getDateCellValue(); // 11-Feb-2024
							SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy"); // 11/02/2024
							String formatedDate = sim.format(dataCellValue);
							System.out.println(formatedDate);
						} else {
							double numbricCellValue = cell.getNumericCellValue();
							long l = (long) numbricCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	public static void main(String[] args) {
//		excelRead();
//		excelRead_AllData();
		excelRead_CellValue();
		
	}
	
	
	
	

}
