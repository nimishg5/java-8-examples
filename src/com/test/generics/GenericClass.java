package com.test.generics;

public class GenericClass<T> {
	
	private T var;
	
	public T getVar() {
		return var;
	}
	public void setVar(T var) {
		this.var = var;
	}
	public GenericClass(T var) {
		this.var = var;
	}
	
	public void printType(T var) {
		System.out.println(var.getClass().getName());
	}

}
