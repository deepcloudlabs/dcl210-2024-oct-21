package com.example.javase8;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Exercise02 {
	private int x = 42;
	private Circle y = new Circle();
	
	public static void fun(int x, Circle circle) {}
	public static void main(String[] args) {
			int x = 42; // value -> int -> primitive type
			Circle y = new Circle(); // object
			// since java se 8
			Gun gun = u -> ++u*u*u; // lambda expression -> pure function
			gun.run(x); // by value
			Integer[] numbers = {10,20,30,40};
			Sun ref = p -> p[0]++;
			System.out.println(Arrays.toString(numbers));
			ref.sun(numbers);
			System.out.println(Arrays.toString(numbers));
	}
}
//Single Abstract Method
@FunctionalInterface
interface Gun {
	int run(int x);
}

@FunctionalInterface
interface Sun {
	int sun(Integer[] x);
}

class Circle {}
interface AA {
	abstract public void fun();
	void gun();
	//since java se 8
	// public default method
	default public void dun() {
		sun();
	}
	// public static method
	public static void mun() {
		run();
	}
	// since java se 9
	private void sun() {}
	private static void run() {}
}
