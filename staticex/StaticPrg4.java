package com.ex.staticex;

public class StaticPrg4 {
	
	static int num = 0;
	static {
		num = 1;
		int i=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticPrg4.num);
		
	}

}
