package com.ex.Collections;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractList<String> list1 = new LinkedList<String>(); 
		
		list1.add("Geeks"); 
	    list1.add("for"); 
	    list1.add("Geeks"); 
	    list1.add("10"); 
	    list1.add("20"); 

	    // Output the list 
	    System.out.println("AbstractList: " + list1); 

	    // Remove the head using remove() 
	    list1.remove(3); 

	    // Print the final list 
	    System.out.println("Final AbstractList: " + list1); 

	    // getting the index of last occurence 
	    // using lastIndexOf() method 
	    int lastindex = list1.lastIndexOf("A"); 

	    // printing the Index 
	    System.out.println("Last index of A : " + lastindex);
	    
	    System.out.println(list1.get(2));
	    list1.set(1, "Sahyadri");
	    System.out.println(list1);
	    
	    list1.add(1, "Koralli");
	    System.out.println(list1);
	    
	    

    
    

	}

}
