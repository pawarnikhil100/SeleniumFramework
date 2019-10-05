package com.javapractice;

public class EigthProgram {

	void m1() {
		System.out.println("m1 method");
		m2();

	}

	void m2() {
		System.out.println("m2 method");
		m3();
	}

	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EigthProgram e = new EigthProgram();
		e.m1();
		e.m2();
		e.m3();
	}

}
