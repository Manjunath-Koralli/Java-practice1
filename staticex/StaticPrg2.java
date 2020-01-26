package com.ex.staticex;

public class StaticPrg2{
	
	static int i=10;
	int j = 20;
	
	static class Staticex{
		
		Staticex(){
			System.out.println(i);
			//System.out.println(j);
		}
		
		public void display() {
			System.out.println(i);
			//System.out.println(j);
		}
		
	}
	
}
