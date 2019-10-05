package com.javapractice;

public class ChildExample1 extends ParentExample1 {
	int b = 100;

	void m2() {
		System.out.println("m2 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildExample1 c = new ChildExample1();
		System.out.println(c.b);
		c.m1();

		System.out.println(c.a);
		c.m1();

	}

}
