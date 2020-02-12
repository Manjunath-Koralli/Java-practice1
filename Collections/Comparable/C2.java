package com.ex.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	public String name; 
	public Student(String name) {  
	    this.name = name;  
	}
	   

	@Override
	public int compareTo(Student person) {
		// TODO Auto-generated method stub
		return name.compareTo(person.name);
	}
	
}
public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student("Viru"));  
	    al.add(new Student("Saurav"));  
	    al.add(new Student("Mukesh"));  
	    al.add(new Student("Tahir")); 
	       
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }

	}

}
