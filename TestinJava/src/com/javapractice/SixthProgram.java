package com.javapractice;

public class SixthProgram {
	int a = 10; // instance variable
	int b = 50;
	static int c = 100;// static variable
	static int d = 200;

	void m1() // instance method
	{
		System.out.println(a);
		System.out.println(b);
		int x = 300; // local variable
		System.out.println(x);

		System.out.println(c);
		System.out.println(d);
		m2();

	}

	static void m2() // static method
	{
		int y = 400; // local variable
		System.out.println(y);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SixthProgram s = new SixthProgram();
		s.m1();

		m2();
		System.out.println(c);
		System.out.println(d);

	}

}
