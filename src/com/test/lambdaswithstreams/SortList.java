package com.test.lambdaswithstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,5,6,1);
		
		list1.stream().sorted().forEach(i -> System.out.println(i)); // ascending
		list1.stream().sorted(Collections.reverseOrder()).forEach(i -> System.out.println(i)); // descending
	}

}
