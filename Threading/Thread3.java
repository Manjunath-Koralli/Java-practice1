package com.ex.Threading;

class ExThread implements Runnable {
	//instantiate an object of type thread
	String name;
	Thread t;
	
	ExThread(String name){
		this.name = name;
		t = new Thread(this,name);
		System.out.println("Child thread :" + " " + t);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				System.out.println(name + " : " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		
		
	}
}
public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExThread ex1 = new ExThread("One");
		ExThread ex2 = new ExThread("Two");
		
		System.out.println("Thread one is alive: " + ex1.t.isAlive());
		System.out.println("Thread two is alive: " + ex2.t.isAlive());
		
		
		try {
			System.out.println("Waiting to finish");
			ex1.t.join();
			ex2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread one is alive: " + ex1.t.isAlive());
		System.out.println("Thread two is alive: " + ex2.t.isAlive());
		

	}

}
