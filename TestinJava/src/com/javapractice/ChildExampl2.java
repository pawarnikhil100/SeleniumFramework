package com.javapractice;

public class ChildExampl2 extends ChildExample1 {
	int p = 200;

	void m3() {
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildExampl2 c1 = new ChildExampl2();
		System.out.println(c1.p);
		c1.m3();

		System.out.println(c1.a);
		c1.m1();

		System.out.println(c1.b);
		c1.m2();

	}

}
