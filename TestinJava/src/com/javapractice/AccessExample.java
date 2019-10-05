package com.javapractice;

public class AccessExample {
	public int id=10;
	
	public void m1()
	{
		System.out.println("hi");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//public and within the class
		AccessExample a =new AccessExample();
		System.out.println(a.id);
		a.m1();
	}
	
}
