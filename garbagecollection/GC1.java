package com.ex.garbagecollection;

public class GC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GC1 gc1 = new GC1(); 
        System.out.println(gc1.hashCode()); 
  
        gc1 = null; 
        //System.out.println(gc1);

        // calling garbage collector  
        System.gc(); 
  
        System.out.println("end");
        
        System.out.println(gc1);

	}
	
	protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 

}
