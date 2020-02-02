package com.ex.polymorphism;

public class Poly3 {

	int i;
	String s;
	static String s1;
	public static void m1(String str) {
		System.out.println("From String arguement method");
	}
	
	public static void m1(Object obj) {
		System.out.println("From Object arguement method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly3 p = new Poly3();
		System.out.println(p.i + " " + p.s );
		
		System.out.println(Poly3.s1);
		Poly3.m1(null);

	}

}
