package com.example.javase7;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Exercise13 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String,Map<String,List<Object>>> cache = 
				new ConcurrentHashMap<>();
	}
}
