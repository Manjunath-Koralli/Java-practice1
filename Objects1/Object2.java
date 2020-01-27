package com.ex.Objects1;

public class Object2 implements Cloneable{
	
	String name;
	protected Object clone() throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
     
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object2 obj1 = new Object2();
		obj1.name = "Manju";
		System.out.println(obj1.name);
		
		try {
			Object2 obj2 = (Object2) obj1.clone();
			obj2.name = "Sahyadri";
			System.out.println(obj2.name);
		}catch(CloneNotSupportedException c) {
			c.printStackTrace();
		}
		
		Object2 obj3 = new Object2();
		obj3.name = "Manju";
		System.out.println(obj3.name);
		Object2 obj4 = obj3;
		obj4.name = "Sahaydri";
		System.out.println(obj3.name);
		System.out.println(obj4.name);
		 

	}

}
