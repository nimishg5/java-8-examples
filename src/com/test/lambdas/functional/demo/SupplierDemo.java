package com.test.lambdas.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> su = () -> "Hello how are you ?";
		System.out.println(su.get());
		
		// Example1
		List<String> list1 = Arrays.asList("a", "b");
		System.out.println(list1.stream().findAny().orElseGet(su));
		
		// Example2
		List<String> list2 = Arrays.asList();
		System.out.println(list2.stream().findAny().orElseGet(su));
	}
	
}
