package com.javapractice;

public class ForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 2; j++)

				System.out.println(a[i][j]);
			// System.out.println(a[0][1]);
			// System.out.println(a[1][0]);
			// System.out.println(a[1][1]);

		}

	}

}
