package com.javapractice;

public class NinethProgram {
	int a;
	String s;
	static boolean b;
	
	static void m1()
	{
		System.out.println("m1 method");
		System.out.println(b);
		m2();
	}
	
	static void m2()
	{
		System.out.println("m2 method");
//		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
		NinethProgram.m1();
		m2();
		NinethProgram.m2();
		

	}

}
