package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.base.TestBase;

public class Datasource extends TestBase{
	private static WebDriver driver;

	public static String[][] Data(String sheetname1) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ARUN\\git\\Ecom_mayAutomation\\Testdata\\E quarz login.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet(sheetname1);

		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(1).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		DataFormatter dataFormatter = new DataFormatter();
		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet1.getRow(i);
			if (row != null) {
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {

						data[i - 1][j] = dataFormatter.formatCellValue(cell);

					}

				}
			}
		}
		return data;
}
}