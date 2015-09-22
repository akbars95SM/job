package com.mtsmda.java8.functionalInterface;

public class Run {

	public static void main(String[] args) {
		FunctionalInterfaceI<String, Integer> converter = (from) -> Integer.valueOf(from);
		System.out.println(converter.convert("15"));
		
		
	}

}
