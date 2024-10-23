package com.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Exercise04 {

	public static void main(String[] args) {
		System.out.println("Application is just started!");
		var future = new FutureTask<Integer>(new CallableTask());
		Thread t1 = new Thread(future);
		t1.start();
		// after some time...
		while (true) {
			try {
				var result = future.get(100, TimeUnit.MILLISECONDS);
				System.out.println("result is %d".formatted(result));
				break;
			} catch (InterruptedException | ExecutionException | TimeoutException e) {
				System.out.println("Doing something else...");
			}
		}
		System.out.println("Application is just ended!");
	}

}

class CallableTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		try {
			TimeUnit.SECONDS.sleep(3);
			return 42;			
		}catch (Exception e) {
			System.out.println("An error has occurred: %s".formatted(e.getMessage()));
			return -1;
		}
	}
}
