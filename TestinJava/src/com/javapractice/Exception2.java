package com.javapractice;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];

		try {
			System.out.println(a[4]);
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("hello");
		}

	}

}
