package com.excelutils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {

		getRowCount();
		getCellDataString(0, 1);
		getCellDataEmail(1, 2);
		getCellDataNumeric(2, 1);
	}

	public static void getRowCount() {

		try {
			String projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath + ".\\Excel\\UserData.xlsx");

			sheet = workbook.getSheet("Employee Data");

			int rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("Number of rows : " + rowCount);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getCellDataString(int rowNum, int colNum) {

		try {
			String projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath + ".\\Excel\\UserData.xlsx");

			sheet = workbook.getSheet("Employee Data");

			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getCellDataEmail(int rowNum, int colNum) {

		try {
			String projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath + ".\\Excel\\UserData.xlsx");

			sheet = workbook.getSheet("Employee Data");

			String cellData1 = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getCellDataNumeric(int rowNum, int colNum) {

		try {
			String projectPath = System.getProperty("user.dir");

			workbook = new XSSFWorkbook(projectPath + ".\\Excel\\UserData.xlsx");

			sheet = workbook.getSheet("Employee Data");

			String cellData2 = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
