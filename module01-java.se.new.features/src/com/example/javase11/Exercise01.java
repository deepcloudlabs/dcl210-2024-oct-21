package com.example.javase11;

public class Exercise01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test test1 = (x,y) -> x+y;
		Test test2 = (@Positive double x,final double y) -> x+y;
		Test test3 = (@Positive var x,final var y) -> x+y;

	}

}

@interface Positive{}
interface Test {
	double add(double x, double y);
}