package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExelGeneric {

	public static String[][] getexel() throws BiffException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HOME\\Desktop\\TestData.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		int cols = sh.getColumns();

		String data[][] = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = sh.getCell(j, i).getContents();

			}

		}
		return data;

	}
}
