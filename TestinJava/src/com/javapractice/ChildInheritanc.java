package com.javapractice;

public class ChildInheritanc extends ParentInheritanc {
	void WhatsAppCall() {
		System.out.println("i can call on whatsapp");
	}

	public static void main(String[] args) {
		ChildInheritanc c = new ChildInheritanc();
		c.callAndMsg();

		// TODO Auto-generated method stub

	}

}
