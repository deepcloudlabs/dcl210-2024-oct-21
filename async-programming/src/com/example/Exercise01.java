package com.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise01 {

	public static int fun() {
		return 42;
	}

	public static int gun() {
		try {TimeUnit.SECONDS.sleep(3);}catch (Exception e) {}
		return 549;
	}
	
	public static CompletableFuture<Integer> sun() {
		return CompletableFuture.supplyAsync(()->{
			System.out.println("sun() is running...[%s]".formatted(Thread.currentThread().getName()));
			try {TimeUnit.SECONDS.sleep(3);}catch (Exception e) {}
			return 549;			
		},tp);
	}
	
	private final static ExecutorService tp = Executors.newFixedThreadPool(10);
	
	public static void main(String[] args) {
		
		var result = fun();
		System.out.println("result = %d".formatted(result));
		result = gun();
		System.out.println("result = %d".formatted(result));
		sun().thenAcceptAsync(value -> {
			System.out.println("sun() has returned and we use the returned value...[%s]".formatted(Thread.currentThread().getName()));
			System.out.println("value = %d".formatted(value));			
		},tp);
		for (var i=0;i<100;++i) {
			System.out.println("[%s] Working on another task (%d)".formatted(Thread.currentThread().getName(),i));			
			try {TimeUnit.MILLISECONDS.sleep(100);}catch (Exception e) {}			
		}
		tp.shutdown();
	}

}
