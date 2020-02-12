package com.ex.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	  
		System.out.println();
		
		Collections.sort(al,Collections.reverseOrder());  
        Iterator i=al.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  

	}

}
