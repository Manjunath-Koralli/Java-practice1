package com.ex.Objects1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable 
{ 
    public int a; 
    public String b; 
  
    // Default constructor 
    public Demo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 
public class Object3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo object = new Demo(1, "geeksforgeeks"); 
        String filename = "file1.txt"; 
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        }

	}

}
