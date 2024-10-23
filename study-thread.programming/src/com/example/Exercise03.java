package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercise03 {

	public static void main(String[] args) throws InterruptedException {
		var task = new Task();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		t1.start();
		t2.start();
		t3.start();
		var begin = System.currentTimeMillis();
		t1.join();
		t2.join();
		t3.join();
		var end = System.currentTimeMillis();
		System.out.println("data: %d @ %d".formatted(task.getData(),(end-begin)));
	}

}

class Task implements Runnable {
	// private int data = 0; // Heap
	private AtomicInteger data = new AtomicInteger();
	@Override
	public void run() {
		for (var i=0;i<10_000_000;++i) {
			// synchronized (this) { // critical section -> mutual exclusion
				data.incrementAndGet();				
			// }
		}			
	}
	public int getData() {
		return data.get();
	}
	
	
	
}
