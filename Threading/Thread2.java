package com.ex.Threading;

class NewThread implements Runnable {
	//instantiate an object of type thread
	Thread t;
	
	NewThread(){
		t = new Thread(this,"Demo thread");
		System.out.println("Child thread :" + " " + t);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread child : " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
		
		
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread();
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Main thread : " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e) {
			System.out.println("Main  Interrupted");
		}

	}

}
