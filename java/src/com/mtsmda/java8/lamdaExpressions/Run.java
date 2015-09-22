package com.mtsmda.java8.lamdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ivan", "Petr", "Grigorii", "Egor", "Kuzima");
		System.out.println(names.toString());
		// Java before Java 8
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		// Java 8
		Collections.sort(names, (String a, String b) -> {
			return a.compareTo(b);
		});

		Collections.sort(names, (a, b) -> b.compareTo(a));

		System.out.println(names.toString());

	}

}