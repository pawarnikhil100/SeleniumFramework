package com.javapractice;

public class ParentExample1 {
	int a = 50;

	public void m1() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentExample1 p = new ParentExample1();
		System.out.println(p.a);
		p.m1();

	}

}
