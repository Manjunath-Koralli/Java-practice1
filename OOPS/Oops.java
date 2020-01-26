package com.ex.OOPS;

class Calci extends Calculator{
	
	@Override
	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public String toString() {
		//System.out.println(super.toString());
		return super.toString() + " " + " and called from This is child class";
		
	}
	
}
public class Oops {
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int subt(int a,int b,int c) {
		return a-b-c;
	}
	
	public static int mult(int a,int b,int c) {
		return a*b*c;
	}
	
	public static double divi(int a,int b,int c) {
		return (a/b)/c;
	}
	
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static int subt(int a,int b,int c,int d) {
		return a-b-c-d;
	}
	
	public static int mult(int a,int b,int c,int d) {
		return a*b*c*d;
	}
	
	public static double divi(int a,int b,int c,int d) {
		return (a/b)/(c/d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calci c = new Calci();
		c.setA(1);
		c.setB(2);
		System.out.println(c.sum(c.getA(), c.getB()));
		System.out.println(c.sub(2, 1));
		System.out.println(c.mul(2, 1));
		System.out.println(c.div(2, 1));
		System.out.println(c.toString());
		
		System.out.println();
		
		System.out.println(add(1,2,3));
		System.out.println(subt(4,2,1));
		
		System.out.println();
		

	}

}
