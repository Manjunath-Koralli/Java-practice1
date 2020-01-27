package com.ex.Singleton;


class Singleton 
{ 
    // static variable single_instance of type Singleton 
    private static Singleton single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        s = "string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
    
    public static Singleton Singleton() 
    { 
        // To ensure only one instance is created 
        if (single_instance == null) 
        { 
            single_instance = new Singleton(); 
        } 
        return single_instance; 
    }
}

public class Singleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		x.s = (x.s).toUpperCase(); 
		System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s);
        
        y.s = (y.s).toLowerCase(); 
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s);
        
        Singleton a = Singleton.Singleton();
		Singleton b = Singleton.Singleton();
		a.s = (a.s).toUpperCase(); 
		System.out.println("String from a is " + a.s); 
        System.out.println("String from b is " + b.s);
        
        b.s = (b.s).toLowerCase(); 
        System.out.println("String from a is " + a.s); 
        System.out.println("String from b is " + b.s);

	}

}
