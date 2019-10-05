package com.TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.read.biff.BiffException;


public class FetchDataFromGenericExample1 {

	public static void main(String[] args) throws BiffException, IOException   {
		// TODO Auto-generated method stub
		
		String[][] data = ReadDataFromExelGeneric.getexel();
		int rows = data.length;
		System.out.println("Rows:" + rows);
		int cols = data[0].length;
		System.out.println("Cols:" + cols);
		//Sheet sh = wb.getSheet("Sheet1");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(" " + data[i][j]);

			}
			System.out.println("\n");

		}

	}
}
