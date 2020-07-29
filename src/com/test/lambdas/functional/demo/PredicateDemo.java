package com.test.lambdas.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> pred = i -> i%2==0;
		System.out.println(pred.test(5)); // testing 5 is even or not
		System.out.println(pred.test(6)); // testing 6 is even or not
		
		List<Integer> list = (List<Integer>) Arrays.asList(1,2,3,4,5);

		// Example1
		list.stream().filter(pred).forEach( i -> System.out.println("Printing Even --> " + i)); // as filter accepts predicate so we have given pred as arg
		
		// Example2
		list.stream().filter(i -> i%2 ==0).forEach( i -> System.out.println("Printing Even --> " + i));
	}

}
