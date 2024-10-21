package com.example.javase7;

import java.io.IOException;

public class Exercise10 {
	public static void fun() throws Throwable {
		PreciousResource res1 = new PreciousResource(1);
		PreciousResource res2 = new PreciousResource(2);
		PreciousResource res3 = new PreciousResource(3);
		try {
			throw new IllegalStateException("Application fails!");	
		} catch (Exception e) {
			System.out.println("Error: %s".formatted(e.getMessage()));
	        for (Throwable t: e.getSuppressed()) {
	        	System.out.println("Suppressed error: %s".formatted(t.getMessage()));
	        }
		} 
		finally {
			try {
				res1.close();
			} finally {
				try {
					res2.close();
				}  finally {
					try {
						res3.close();
					} finally {
						
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		fun();
	}

}
