package com.mtsmda.java8.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceI<F, T> {
	
	T convert(F from);
	
}