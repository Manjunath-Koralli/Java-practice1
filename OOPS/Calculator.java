package com.ex.OOPS;

abstract class Calculator {
	
	private int a;
	private int b;
	
	//abstract int c;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//final abstract int sum(int a,int b);
	//static abstract int sum(int a,int b);
	abstract int sum(int a,int b);
	abstract int sub(int a,int b);
	abstract int mul(int a,int b);
	abstract double div(int a,int b);
	
	public String toString() {
		return "This is parent and abstract class";
		
	}
	
	public static void main(String[] args) {
		//Calculator c = new Calculator();
		System.out.println("Abstract class");
	}
	

}
