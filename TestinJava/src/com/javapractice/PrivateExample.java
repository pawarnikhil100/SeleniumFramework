package com.javapractice;

public class PrivateExample {

	private String branchName = "karveRoad";

	private void enquiry() {
		System.out.println("public enquiry");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//private and within the class
		AccountHolder a = new AccountHolder();
		System.out.println(a.branchName);
		a.enquiry();

	}

}
