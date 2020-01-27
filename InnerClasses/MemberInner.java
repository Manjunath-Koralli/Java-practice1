package com.ex.InnerClasses;

class Outer1 { 
	class Inner1 { 
		public void show() { 
			System.out.println("In a nested class method"); 
	    } 
	} 
} 
public class MemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1.Inner1 in1 = new Outer1().new Inner1();
		in1.show();

	}

}
