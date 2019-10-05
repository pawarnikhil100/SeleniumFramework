package com.javapractice;

public class AccountHolder {
	protected String branchName = "karveRoad";

	protected void enquiry() {
		System.out.println("public enquiry");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//protected and within the class
		AccountHolder a = new AccountHolder();
		System.out.println(a.branchName);
		a.enquiry();

	}

}
