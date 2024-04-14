package com.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void excelRead() {

		try {
			File f = new File(
					"/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); // - to access the workbook
			Sheet createSheet = wb.createSheet("Practise");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue("Java Selenium");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("Updated Successfully.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void excelModify() {

		try {
			File f = new File(
					"/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/ExcelRead.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis); // - to access the workbook
			Sheet getSheet = wb.getSheet("Practise");
			Row row = getSheet.getRow(0);
			Cell cell = row.getCell(1);
			String value = cell.getStringCellValue();
			if(value.equals("pass")) {
				cell.setCellValue("fail"); // write 
			}
			
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			System.out.println("Updated Successfully.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		excelModify();

	}

}
