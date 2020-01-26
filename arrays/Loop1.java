package com.ex.arrays;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1; 
		  
        // Exit when x becomes greater than 4 
        while (x <= 4) 
        { 
            System.out.println("Value of x:" + x); 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        } 
        System.out.println();
        do
        { 
            // The line will be printed even 
            // if the condition is false 
            System.out.println("Value of x:" + x); 
            x++; 
        } 
        while (x < 2); 
        
        System.out.println();
        for (int i=0;i<3;i++) 
            System.out.println("Value of i:" + i); 
        
        for (int i=0,j=0;i<3;i++,j++) 
            System.out.println("Value of i and j:" + i + " " + j); 
        
        String array[] = {"Ron", "Harry", "Hermoine"}; 
        
        //enhanced for loop 
        for (String str:array) 
        { 
            System.out.println(str); 
        } 
        
        
		
		

	}

}
