package com.ex.Exeptions;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c;
		try {
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}

	}

}
