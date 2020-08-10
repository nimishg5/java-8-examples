package com.test.generics;

public class Main {

	public static void main(String[] args) {
		GenericClass<Integer> intObj = new GenericClass<>(10);
		GenericClass<String> strObj = new GenericClass<>("Hello");
		intObj.printType(intObj.getVar());
		strObj.printType(strObj.getVar());
	}

}
