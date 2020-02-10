package com.ex.Collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class AbstractCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractCollection<Integer> abs1 = new TreeSet<Integer>(); 
		
		abs1.add(20); 
	    abs1.add(21); 
	    abs1.add(50); 
	    abs1.add(1); 
	    
	    
	    System.out.println("AbstractCollection 1: " + abs1); 
	    
	    AbstractCollection<Integer> abs2 = new TreeSet<Integer>(); 

	    System.out.println("AbstractCollection 2: " + abs2); 
	    abs2.addAll(abs1); 
	    System.out.println("AbstractCollection 2: "+ abs2); 
	    //abs1.clear(); 
	    System.out.println("Is the collection empty? " + abs1.isEmpty());
	    System.out.println(abs1.size());
	    
	    System.out.println();
	    
	    Iterator itr1 = abs1.iterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    System.out.println();
	    ArrayList<String> al1 = new ArrayList<String>();
	    
	    al1.add("Ravi");//Adding object in arraylist  
        al1.add("Vijay");  
        al1.add("Ravi");  
        al1.add("Ajay"); 
        System.out.println(al1);
        
	    ListIterator<String>itr2 = al1.listIterator();
	    
	    while(itr2.hasNext())  {  
            String str=itr2.next();  
            System.out.print(str + " ");  
        } 
	    System.out.println();
	    while(itr2.hasPrevious())  {  
            String str=itr2.previous();  
            System.out.print(str + " ");  
        } 
	    

	}

}
