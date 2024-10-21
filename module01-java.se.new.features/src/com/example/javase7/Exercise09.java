package com.example.javase7;

public class Exercise09 {
	public static void sun() throws E1 {}
	public static void fun() throws E2 {}
	public static void gun() throws E2 {
		try {
			// sun(); // E1
			fun(); // E2
		} catch (E1 e) {
			System.out.println("Error has occured: %s".formatted(e.getMessage()));
			throw e; // always throws E2
		}	
	}
	
	public static void main(String[] args) throws E2 {
		
		gun();

	}

}

class E1 extends Exception {}
class E2 extends E1 {}
