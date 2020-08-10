package com.test.lambdaswithstreams;

interface iter1 {
	void test();
}

public class AnonymousClass {
	
	public static void main(String[] args) {
		
		iter1 it = () -> System.out.println("test here");
	
		it.test();
	
	}
}
