package com.ex.InnerClasses;


class Outer2 { 
    void outerMethod() { 
        System.out.println("inside outerMethod"); 
        // Inner class is local to outerMethod() 
        class Inner2 { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner2 y = new Inner2(); 
        y.innerMethod(); 
    } 
} 

public class MethodLocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 x = new Outer2(); 
        x.outerMethod();

	}

}
