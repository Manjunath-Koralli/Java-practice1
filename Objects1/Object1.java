package com.ex.Objects1;



class Example {
	public void display() {
		System.out.println("From example");
	}
}
public class Object1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using new keyword
		
		Object1 obj1 =  new Object1();
		System.out.println(obj1.toString());

		
		//using new instance
		try {
			Class cls = Class.forName("com.ex.Objects1.Example"); 
            Example ex1 = (Example)cls.newInstance(); 
            ex1.display(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
