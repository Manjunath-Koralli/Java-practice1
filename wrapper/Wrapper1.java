package com.ex.wrapper;

import java.util.ArrayList;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer b = Integer.valueOf(a);
		Integer c = a;
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(a);
		
		System.out.println(iList.get(0));
		
		//ArrayList<int> iList1 = new ArrayList<Integer>();
		//iList.add(a);
		
		System.out.println(iList.get(0));
		
		System.out.println();
		Integer d = new Integer(21);
		System.out.println(d);
		modify(d);
		System.out.println("from main");
		System.out.println(d);
		
		System.out.println();
		int g = 21;
		System.out.println(g);
		modify1(g);
		System.out.println("from main");
		System.out.println(g);
		
		System.out.println();
		
		Integer e = new Integer("25");
		System.out.println(e);
		
		Integer f =  new Integer(25);
		System.out.println(f);
		
		
		

	}
	
	private static void modify(Integer i) 
    { 
        i = i + 1; 
        System.out.println("from method");
        System.out.println(i);
    }
	
	private static void modify1(int i) 
    { 
        i = i + 1; 
        System.out.println("from method");
        System.out.println(i);
    }
}
