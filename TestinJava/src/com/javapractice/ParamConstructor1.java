package com.javapractice;

public class ParamConstructor1 {
	int id;
	String name;
	double Salary;
	static long phone;
	
	ParamConstructor1(int empId, String empName, double empSalary,long empPhone) {
		// TODO Auto-generated constructor stub
		id = empId;
		name = empName;
		Salary = empSalary;
		phone=empPhone;
		

	}

	void m1() {
		System.out.println("id" + id + "name" + name + "Salary" + Salary+"Phone"+phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConstructor1 p = new ParamConstructor1(10, "ssp", 1000.10,9657749913l);
		p.m1();

	}

}
