package com.ex.keywords;

/*final class A{
	
	public void method1() {
		System.out.println("From parent");
	}
}

class B extends A {
	
}*/

/*class A {
	final void method1() {
		System.out.println("From parent");
	}
}

class B extends A {
	void method1() {
		
	}
}*/

class A {
	
	final int a = 10;
	void method1() {
		System.out.println("From parent");
	}
}

class B extends A {
	void method1() {
		System.out.println("From child:" + super.a);
	}
}

public class FinalclassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.method1();

	}

}
