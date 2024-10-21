package com.example.javase8;

public class Exercise04 {

	public static void main(String[] args) {
		

	}

}


interface NNN {
	int fun();
	default int gun() {
		return 108;
	}
}

class A implements NNN {

	@Override
	public int fun() {
		return 42;
	}
	
}

interface I {
	default int gun() {
		return 108;
	}
}

interface J {
	default int gun() {
		return 108;
	}
}

class B  implements I,J {

	@Override
	public int gun() {
		return I.super.gun();
	}
	
}
