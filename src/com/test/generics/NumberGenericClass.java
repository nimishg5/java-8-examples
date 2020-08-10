package com.test.generics;

import java.util.List;

public class NumberGenericClass<T> {

	private T var;
	public void setVar(T var) {
		this.var = var;
	}
	public T getVar() {
		return var;
	}
	
	public void demo(List<? extends T> list) {
		System.out.println(list);
	}
	
}
