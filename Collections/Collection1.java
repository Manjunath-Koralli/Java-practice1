package com.ex.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values = new ArrayList();
		values.add(21);
		values.add("manju");
		values.add(21.9f);
		
		//Iterator or foreach
		Iterator i1 = values.iterator();
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println();
		
		for(Object j : values) {
			System.out.println(j);
		}
		System.out.println();
		
		Collection<Integer> ivalues = new ArrayList<Integer>();
		ivalues.add(21);
		ivalues.add(3);
		ivalues.add(77);
		Iterator i2 = ivalues.iterator();
		
		
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println();
	
		for(Object j : ivalues) {
			System.out.println(j);
		}

	}

}
