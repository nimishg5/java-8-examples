package com.test.lambdas.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (i) -> System.out.println("Printing "+ i);
		consumer.accept(10);
		
		List<Integer> list = (List<Integer>) Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(consumer); // Example1
		list.stream().forEach((i) -> System.out.println("Printing "+ i)); //Example2
	}

}
