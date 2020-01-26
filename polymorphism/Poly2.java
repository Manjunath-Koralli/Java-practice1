package com.ex.polymorphism;

class Bank{
	int getRateOfInterest() {
		return 0;
	}  
}

class SBI extends Bank{
	int getRateOfInterest() {
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
		b1.getRateOfInterest();
		
		//SBI s1 = new Bank();
		

	}

}
