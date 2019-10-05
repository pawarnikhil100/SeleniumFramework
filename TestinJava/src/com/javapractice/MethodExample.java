package com.javapractice;

public class MethodExample {

	int amt = 500;
	String version = "v1";

	void versionInfo() {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample m = new MethodExample();

		m.versionInfo();
		System.out.println(m.amt);
		System.out.println(m.version);

	}

}
