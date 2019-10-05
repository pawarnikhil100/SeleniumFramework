package com.javapractice;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter row:");
		int row=sc.nextInt();
		
		System.out.println("enter colum:");
		int column =sc.nextInt();
		int[][] a=new int[row][column];
		
		System.out.println("Enter array elements:");
		
		for(int i=0;i<row;i++)
		{
		 for(int j=0;j<column;j++)
		 {
			 a[i][j]=sc.nextInt();
			
		 }
		 for( int k=0;k<row;k++)
		 {
			for(int l=0;l<column;l++) 
		 
			 
			{
				System.out.println(a[k][l]);
			}
		}
}
	}
}
