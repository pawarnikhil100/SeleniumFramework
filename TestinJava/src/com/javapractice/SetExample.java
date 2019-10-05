package com.javapractice;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
   static int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(5);
		//hs.add(null);
		hs.add(6);
		hs.add(7);
		
		
		/*Iterator <Integer> itr=hs.iterator();
        boolean result=itr.hasNext();
		
		System.out.println(itr.next());
		System.out.println(result);
	
		
		Object s =hs.toArray()[0];
		System.out.println(s);
		
		System.out.println(hs);
		System.out.println(hs.size());*/
		
		/*while(itr.hasNext())
		{
			Integer val =itr.next();
			System.out.println(val);
		}*/
		/*boolean result=itr.hasNext();
		
		System.out.println(itr.next());
		System.out.println(result);
	
		
		Object s =hs.toArray()[0];
		System.out.println(s);
		
		System.out.println(hs);
		System.out.println(hs.size());
		*/
		(Object val:hs)
		{
			System.out.println(val);
		}
	}

}
