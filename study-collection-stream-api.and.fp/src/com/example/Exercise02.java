package com.example;

import java.util.LinkedList;

public class Exercise02 {

	public static void main(String[] args) {
		// ArrayList vs LinkedList
		var numbers = new LinkedList<Integer>();
		var begin = System.currentTimeMillis();
        for (var i=0;i<10_000_000;++i)
        	numbers.addFirst(i);
        System.gc();
        var end = System.currentTimeMillis();
        System.out.println("Duration: %d msec.".formatted((end-begin)));
        System.out.println(numbers.contains(42));
        // ordered
        try {
        	numbers.get(-1);
        	
        }catch (NullPointerException e) {
			// TODO: handle exception
		}
	}

}
