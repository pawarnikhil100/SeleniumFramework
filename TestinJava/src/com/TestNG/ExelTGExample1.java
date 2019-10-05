package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExelTGExample1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\HOME\\Desktop\\TestData.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rows=sh.getRows();
		System.out.println(rows);
		int cols=sh.getColumns();
		System.out.println(cols);
		System.out.println(sh.getCell(0,0).getContents());
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				
				System.out.println(sh.getCell(j,i).getContents());
			}
			
			
		}
		

	}

}
