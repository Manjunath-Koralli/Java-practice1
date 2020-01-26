package com.ex.garbagecollection;

class Employee1{
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	Employee1(String name, int age){
		this.name = name;
		this.age = age;
		this.ID = nextId++;
	}
	public void show() 
    { 
        System.out.println("Id="+ID+"\nName="+name+"\nAge="+age); 
    } 
    public void showNextId() 
    { 
        System.out.println("Next employee id will be="+nextId); 
    } 
    protected void finalize() 
    { 
        --nextId;  
        //In this case, 
        //gc will call finalize()  
        //for 2 times for 2 objects. 
    }
    
     
}
public class GC3 {
	
	public static void interns(){ //It is sub block to keep 
        // all those interns. 
        Employee1 X=new Employee1("GFG4",23);      
        Employee1 Y=new Employee1("GFG5",21); 
        X.show(); 
        Y.show(); 
        X.showNextId(); 
        Y.showNextId(); 
        X = null;
        Y = null;
        System.gc();
        System.runFinalization(); 
	}
        
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 E=new Employee1("GFG1",56); 
        Employee1 F=new Employee1("GFG2",45);  
        Employee1 G=new Employee1("GFG3",25); 
        E.show(); 
        F.show(); 
        G.show(); 
        E.showNextId(); 
        F.showNextId(); 
        G.showNextId();
        interns();
        E.showNextId(); 
	}

}
