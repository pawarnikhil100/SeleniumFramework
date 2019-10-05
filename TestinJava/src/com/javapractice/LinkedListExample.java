package com.javapractice;

//import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedList ll =new LinkedList();
		ll.add(1);
		ll.add(3);
		ll.add("ssp");
		ll.add(0,8);
		ll.remove(1);
		ll.add(2);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.get(0));
		
		LinkedList ll1=new LinkedList();
		ll1.add(111);
		ll1.add(222);
		ll1.addAll(ll);
		
		System.out.println(ll1);
		
		

	}

}
