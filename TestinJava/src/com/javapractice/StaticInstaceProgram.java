package com.javapractice;

public class StaticInstaceProgram {
	double per = 50.99;
	static String college = "ssp";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInstaceProgram s = new StaticInstaceProgram();
		System.out.println(s.per);
		System.out.println(s.college);

		s.per = 60.11;
		s.college = "pune";

		System.out.println(s.per);
		System.out.println(s.college);

		StaticInstaceProgram s1 = new StaticInstaceProgram();
		System.out.println(s1.per);
		System.out.println(s1.college);

		s1.per = 99.99;
		s1.college = "mumbai";

		System.out.println(s1.per);
		System.out.println(s1.college);

		StaticInstaceProgram s2 = new StaticInstaceProgram();
		System.out.println(s2.per);
		System.out.println(s2.college);
	}

}
