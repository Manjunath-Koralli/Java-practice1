package com.ex.Threading;

class Counter {
	int count;
	
	public synchronized void increment() {
		count++;
	}
}
public class Thread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() 
		{
			public void run(){	
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
				
		});
		

		Thread t2 = new Thread(new Runnable() 
		{
			public void run(){	
				for(int i=0;i<1000;i++) {
					c.increment();
				}
			}
				
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: " + c.count);
		
			
	}

	

}
