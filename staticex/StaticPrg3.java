package com.ex.staticex;

class Class1 {
    public static int method1(){
    	System.out.println("Class1");
    	return 0;
          
    }
}
class Class2 extends Class1 {
    /*public static int method1(){
    	System.out.println("Class2");
        return 0;
    }*/

}
public class StaticPrg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1.method1();
        Class2.method1();
        //Class1 c1 = new Class1();
        Class1 c1 = new Class1(); 
        c1.method1();
        Class2 c2 = new Class2();
        c2.method1();

	}

}
