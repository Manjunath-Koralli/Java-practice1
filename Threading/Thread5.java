package com.ex.Threading;

class Q {
	int n;
	boolean valueSet = false;
	
	public synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Put num: " + n);
		this.n = n;
		valueSet = true;
		notify();
	}
	
	public synchronized int get(){
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get num: " + n);
		valueSet = false;
		notify();
		return n;
	}
}

class Producer implements Runnable {
	Q q;
	
	public Producer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumer implements Runnable {
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		Thread t1 = new Thread(this,"Consumer");
		t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			q.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class Thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q =  new Q();
		new Producer(q);
		new Consumer(q);

	}

}
