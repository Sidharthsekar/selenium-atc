package com.ap.reuselibrary;

import com.ap.baselibrary.BaseClass;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtility extends BaseClass {
	
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	
	private static FileInputStream excelFile;
	
	public static Object[][] readExcelData(String sheetName) throws Exception{
		
		
		excelFile = new FileInputStream("./TestData.xlsx");
		ExcelWBook = new XSSFWorkbook(excelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		int rowCount = ExcelWSheet.getLastRowNum();
		int columnCount = ExcelWSheet.getRow(0).getLastCellNum();
		String[][] arrExcelData = new String[rowCount][columnCount];
		for(int i = 0;i<rowCount;i++)
		{
			XSSFRow row = ExcelWSheet.getRow(i+1);
			for(int j = 0;j<columnCount; j++)
			{
				String cellValue = "";				
				try {
					cellValue = row.getCell(j).getStringCellValue();
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
				arrExcelData [i][j] = cellValue;				
			}
		}
		
		return arrExcelData;
	}

}
