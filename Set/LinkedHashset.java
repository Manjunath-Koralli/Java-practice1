package com.ex.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> al=new LinkedHashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  //al.addFirst("Manju");
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }   

	}

}
