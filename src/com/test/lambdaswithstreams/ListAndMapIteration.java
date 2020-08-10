package com.test.lambdaswithstreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMapIteration {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Nimish","Bawaseer","Ronnie", "Abhishek");
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		
		list1.stream().forEach((str) -> System.out.println(str));
		map1.entrySet().stream().forEach((es) -> System.out.println(es));
	}
}
