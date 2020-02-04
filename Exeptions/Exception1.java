package com.ex.Exeptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4]; 
		int a=10,b=0,c;
		String str = "123";
        try
        { 
        	 
            int num = Integer.parseInt(str);
            System.out.println(num);
            int i = arr[2];
            System.out.println(i); 
            System.out.println("Inside try block"); 
            c = a/b;
            System.out.println(c);
        } 
        catch(ArrayIndexOutOfBoundsException ex) 
        { 
        	System.out.println(ex.getMessage());
            System.out.println("Exception caught in Catch block"); 
        } 
        catch(NumberFormatException n) {
        	n.printStackTrace();
        }
        finally
        { 
        	System.exit(0);
            System.out.println("finally block executed"); 
        }
          
       
        System.out.println("Outside try-catch clause"); 

	}

}
