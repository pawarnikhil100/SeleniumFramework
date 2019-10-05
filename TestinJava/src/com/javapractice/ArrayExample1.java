package com.javapractice;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
