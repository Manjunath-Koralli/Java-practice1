package com.ex.Map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>(); 

		System.out.println(map); 
	    map.put("vishal", 10); 
	    map.put("sachin", 30); 
	    map.put("vaibhav", 20); 
	
	    System.out.println("Size of map is:- "
	                       + map.size()); 
	
	    System.out.println(map); 
	    if (map.containsKey("vishal")) { 
	        Integer a = map.get("vishal"); 
	        System.out.println("value for key"
	                           + " \"vishal\" is:- "
	                           + a); 
	    } 
	
	    map.clear(); 
	    System.out.println(map); 
	}

}
