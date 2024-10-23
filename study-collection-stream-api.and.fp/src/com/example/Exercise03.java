package com.example;

import java.util.HashSet;

public class Exercise03 {

	public static void main(String[] args) {
		// var numbers = new TreeSet<Integer>((x,y)->y-x);
		var numbers1 = new HashSet<Integer>(10_000,0.5f);
        numbers1.add(15);
        numbers1.add(42);
        numbers1.add(16);
        numbers1.add(8);
        numbers1.add(23);
        numbers1.add(4);
        System.out.println(numbers1);
        System.out.println(numbers1.contains(42));
        var numbers2 = new HashSet<Integer>();
        numbers2.add(23);
	}

}
