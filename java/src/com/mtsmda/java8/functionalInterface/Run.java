package com.mtsmda.java8.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Run {

	public static void main(String[] args) {
		/*FunctionalInterfaceI<String, Integer> converter = (from) -> Integer.valueOf(from);
		System.out.println(converter.convert("15"));*/
		
		
		
		/**---------------------*/
		
		BiConsumer<Double, Double> max = (a, b) -> {
			if(a != null && b != null){
				if(a.doubleValue() > b.doubleValue()){
					System.out.println("a > b");
				}else if(a.doubleValue() < b.doubleValue()){
					System.out.println("a < b");
				}else{
					System.out.println("a = b");
				}
			}else{
				System.out.println("NULL");
			}
		};
		
		max.accept(17.92, 17.93);
		
		Predicate<Integer> predicate = a -> a != null;
		System.out.println(predicate.test(null));
		System.out.println(predicate.test(new Integer(0)));
		
		
	}

}
