package com.example.javase7;

@SuppressWarnings("finally")
public class Exercise11 {
	public static int fun() {
		try {
			return 42;
		} finally {
			return 108;
		}
	}
    // a) 42 b) 108 c) 150 d) 75
	public static void main(String[] args) {
		System.out.println(fun());
	}

}
