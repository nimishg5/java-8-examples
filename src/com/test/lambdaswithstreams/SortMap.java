package com.test.lambdaswithstreams;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("five", 5);
		map.put("ten", 10);
		map.put("fifteen", 15);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // sorted by keys
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // sorted by values
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println); // reverse sorting with values
	}

}
