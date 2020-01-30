package com.ex.polymorphism;

class Bank{
	int getRateOfInterest() {
		return 0;
	}  
}

class SBI extends Bank{
	Bank b = new Bank();
	
	int getRateOfInterest() {
		System.out.println(b.getRateOfInterest());
		return 7;
	}
}

class HDFC extends Bank{
	int getRateOfInterest() {
		return 9;
	}
	
	
}
public class Poly2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new SBI();
		System.out.println(b1.getRateOfInterest());
		
		//SBI s1 = new Bank();
		
		SBI sbi = new SBI();
		System.out.println(sbi.getRateOfInterest());
		//sbi.b;
		

	}

}
