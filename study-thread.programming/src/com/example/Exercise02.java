package com.example;

public class Exercise02 {

	public static void main(String[] args) {
		System.out.println("Applciation is just started!");
		var thread1 = new Thread(() -> {
			System.out.println("Hello Mars!");
		});
		var thread2 = new Thread(() -> {
			System.out.println("Hello Moon!");
		});
		thread1.start(); // kernel thread
		thread2.start();
		System.out.println("Applciation is just ended!");
	}

}
