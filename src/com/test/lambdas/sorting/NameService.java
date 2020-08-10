package com.test.lambdas.sorting;

import java.util.Collections;
import java.util.List;

public class NameService {
	
	public static void main(String[] args) {
		List<String> namesList = new NamesDao().getNames();
		System.out.println(getNamesInSortedOrder(namesList));
	}
	
	public static List<String> getNamesInSortedOrder (List<String> namesList) {
		Collections.sort(namesList, (s1, s2) -> s2.compareTo(s1)); // Descending Order
		return namesList;
	}

}
