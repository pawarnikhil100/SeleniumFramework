package com.javapractice;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add("ssp");
		al.add(0, 5);
		al.add(null);
		al.remove(0);
		al.add(null);
		al.add(2);
		al.add(null);
		
		
		System.out.println(al);
		System.out.println(al.get(1));
	//System.out.println(al.);
		
		ArrayList al1=new ArrayList();
		al1.add(111);
		al1.add(222);
		al1.addAll(al);
		
		System.out.println(al1);

	}

}
