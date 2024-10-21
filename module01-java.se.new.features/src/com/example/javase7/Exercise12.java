package com.example.javase7;

import java.io.IOException;

public class Exercise12 {

	public static void main(String[] args) {
		// try-with-resources
		try(
				PreciousResource res1 = new PreciousResource(1);
				PreciousResource res2 = new PreciousResource(2);
				PreciousResource res3 = new PreciousResource(3);		
				){
			
		} catch (IOException e) {
			System.out.println("Error: %s".formatted(e.getMessage()));
			for (Throwable t: e.getSuppressed()) {
	        	System.out.println("Suppressed error: %s".formatted(t.getMessage()));
	        }
		}

	}

}
