package com.javapractice;

public class B extends A {
	public int a = 100;

	public void m1() {
		System.out.println("B-m1");
		System.out.println(super.a);
	}
	public void m2()
	{
		m1();
		super.m1();
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.a);
		//System.out.println(super.a);
		b.m1();
		
	}

}
