package com.ex.staticex;

public class StaticPrg1 {
	
	static int i=10;
	int j = 20;
	static {
		System.out.println("static block display");
		System.out.println(i);
		//System.out.println(j);
	}
	{
		System.out.println("instance block display");
		System.out.println(i);
		System.out.println(j);
	}
	public static void display1() {
		System.out.println("static method display");
		System.out.println(i);
		//System.out.println(j);
	}
	public void display() {
		System.out.println("non static method display");
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticPrg1 pr = new StaticPrg1();
		pr.display();
		//System.out.println(StaticPrg1.i);
		//System.out.println(i);
		StaticPrg1.display1();
		//System.out.println(j);
		//System.out.println(pr.j);
		StaticPrg1 pr1 = new StaticPrg1();
	}

}
