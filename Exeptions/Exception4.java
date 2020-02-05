package com.ex.Exeptions;

//public class Exception4 throws IllegalAccessException{
public class Exception4 {

	static void fun() throws IllegalAccessException 
    { 
        System.out.println("Inside fun(). "); 
        throw new IllegalAccessException("demo"); 
    }
	//handles exception
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
        { 
            fun(); 
        } 
        catch(IllegalAccessException e) 
        { 
            System.out.println("caught in main."); 
        } 

	}*/
	
	//doesnt handle
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		fun(); 
        

	}
	
	

}
