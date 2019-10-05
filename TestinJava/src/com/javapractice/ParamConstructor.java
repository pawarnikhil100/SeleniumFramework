package com.javapractice;

public class ParamConstructor {
	int a = 10;
	int b = 20;

	void m1(int a, int b) {
		System.out.println(this.a + this.b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConstructor p = new ParamConstructor();
		p.m1(100, 200);

	}

}
