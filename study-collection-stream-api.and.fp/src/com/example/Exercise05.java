package com.example;

import java.util.HashMap;
import java.util.HashSet;

public class Exercise05 {

	public static void main(String[] args) {
		var map = new HashMap<A,String>();
		map.put(new A(), "banana");
		map.put(new A(), "banana");
		map.put(new A(), "banana");
		map.put(new A(), "banana");
		System.out.println(map.size());
		var list = new HashSet<A>();
		list.add(new A());
		list.add(new A());
		list.add(new A());
		list.add(new A());
		System.out.println(list.size());
		System.out.println(list.contains(new A()));
	}

}

class A {

	@Override
	public int hashCode() {
		return 42;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	
}