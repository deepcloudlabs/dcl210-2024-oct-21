package com.example;

import java.util.TreeMap;

public class Exercise04 {

	public static void main(String[] args) {
		var areaCodes = new TreeMap<String,Integer>();
		areaCodes.put("istanbul-anadolu", 216);
		areaCodes.put("istanbul-avrupa", 212);
		areaCodes.put("ankara", 312);
		System.out.println(areaCodes);
		areaCodes.entrySet().stream().sorted((kv1,kv2)->kv1.getKey().length()-kv2.getKey().length()).forEach(System.out::println);

	}

}
