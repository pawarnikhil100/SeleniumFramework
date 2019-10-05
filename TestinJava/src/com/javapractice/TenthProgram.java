package com.javapractice;

public class TenthProgram {
	String name;

	TenthProgram(String myName) {
		name = myName;

	}

	void m1() {
		System.out.println("name:" + name);
	}

	{
		System.out.println("welcome to SBI");
	}

	static {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TenthProgram t = new TenthProgram("Ram");
		t.m1();

		TenthProgram t1 = new TenthProgram("shyam");
		t1.m1();

	}

}
