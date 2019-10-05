package com.javapractice;

public class DefaultModifier {
	String branchName = "karveRoad";
	
	void enquiry() {
		System.out.println("public enquiry");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder a = new AccountHolder();
		System.out.println(a.branchName);
		a.enquiry();


	}

}
