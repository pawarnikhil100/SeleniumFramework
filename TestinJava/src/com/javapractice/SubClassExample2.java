package com.javapractice;

public class SubClassExample2 extends SubClassExample1 {
	private int b=0;
	private void m2()
	{
		System.out.println("b-m2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassExample2 s=new SubClassExample2();
		//s.m1();
		s.m2();

	}

}
