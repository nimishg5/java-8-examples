package com.test.lambdas;

interface iter1 {
	void test();
}

public class AnanymousClass {
	
	public static void main(String[] args) {
		
		iter1 it = () -> System.out.println("test here");
	
		it.test();
	
	}
}
