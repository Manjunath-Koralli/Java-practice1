package com.ex.polymorphism;

public class Poly1 {

	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	/*public static float add(int a,int b) {
		return a+b;
	}*/
	
	public static double add(int a,double b) {
		return (a+b);
	}
	
	public static double add(double a,int b) {
		return (a+b);
	}
	
	void sum(int a,long b) {
		System.out.println("a method invoked");
	}  
	
	void sum(long a,int b) { 
		System.out.println("b method invoked");
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2.5));
		System.out.println(add(2.5,1));
		//sum(20,20);

	}

}
