package com.javapractice;

public class ConstructorExample {
	int id;
	String name;
	double Salary;
	 
	public ConstructorExample()
	{
		// TODO Auto-generated constructor stub
		id=10;
		name="Ajay";
		Salary=1000;
		
	}
	
	void m1()
	{
		System.out.println("id"+id +"name"+name +"Salary"+Salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample c =new ConstructorExample();
		c.m1();
		
		ConstructorExample c1 =new ConstructorExample();
		c1.m1();

	}

}
