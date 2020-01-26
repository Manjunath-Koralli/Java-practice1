package com.ex.keywords;


public class FinalEx {
	
	final int i = 10;
	final int THRESHOLD = 5; 
    final int CAPACITY; 
    final int  MINIMUM; 
    static final double PI = 3.141592653589793; 
    static final double EULERCONSTANT; 
    
    { 
        CAPACITY = 25; 
    } 
      
    
    static { 
        EULERCONSTANT = 2.3; 
    } 
      
    
    public FinalEx()  
    { 
        MINIMUM = -1; 
    } 
    
    public void method1() {
		System.out.println(i);
		System.out.println(THRESHOLD);
        System.out.println(CAPACITY);
        System.out.println(MINIMUM);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StringBuilder sb = new StringBuilder("Geeks"); 
        System.out.println(sb); 
        System.out.println(sb.hashCode());
        sb.append("ForGeeks"); 
        System.out.println(sb);
        System.out.println(sb.hashCode());
        
        System.out.println();
        
        StringBuilder sb1 = new StringBuilder("manju");
        System.out.println(sb1); 
        
        //sb = sb1;
        
        FinalEx f = new FinalEx();
        
        System.out.println(PI);
        System.out.println(EULERCONSTANT);
        f.method1();
        
        
        
        
	}

}
