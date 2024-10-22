package com.example.javase10;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Exercise10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var x = 100;
        var cache = new	ConcurrentHashMap<String,Map<String,List<Object>>>();
        
        var numbers1 = List.of(10,20,30,40,50,60,70,80,90);  // List<Integer>
        var numbers2 = List.of(10,20.0,30,40,50,60,70,80,90);  // List<Number & Comparable>
        var numbers3 = List.of(10,20.0,"30",40,50,60,70,80,90);  // List<Object & Comparable & Serializable>
        
        
	}

}

class ABC {
// Error:	var x = 100;
// Error:	boolean fun(var x) { return true; }
}
