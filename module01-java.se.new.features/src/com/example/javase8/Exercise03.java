package com.example.javase8;

import java.util.List;
import java.util.function.Predicate;

public class Exercise03 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(16, 20, 36, 40, 50, 81, 70);
		// imperative programming
		int counter = 0;
		for (int number : numbers) { // external loop
			int sqrt = (int) Math.sqrt(number);
			if (sqrt * sqrt == number)
				counter = counter + 1;
		}
		System.out.println("counter: %d".formatted(counter));
		// declarative programming: functional programming
		// High-Order Function: filter, mapToInt, ...
		// Predicate<Integer> perfectSqrt = number -> Math.sqrt(number) % 1 == 0;
		// Method Reference                              
		Predicate<Integer> perfectSqrt = Utility::perfectSquareRoot;
		Predicate<Integer> lessThan100K = num -> num < 100_000;
		counter = numbers.stream().parallel().filter(perfectSqrt.and(lessThan100K))
				// .filter(num -> num < 100_000)
				.mapToInt(u -> 1).sum();
		System.out.println("counter: %d".formatted(counter));
	}

}

interface Utility {
	public static boolean perfectSquareRoot(int number) {
		return Math.sqrt(number) % 1 == 0;
	}
}
