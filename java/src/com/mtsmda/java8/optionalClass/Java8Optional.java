package com.mtsmda.java8.optionalClass;

import java.util.Optional;

public class Java8Optional {

	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(new Integer(29));
		System.out.println(optional);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse(new Integer(99)));
		
		System.out.println("---------------------");
		
		Optional<Integer> optional1 = Optional.ofNullable(null);
		System.out.println(optional1);
		System.out.println(optional1.isPresent());
//		System.out.println(optional1.get());
		System.out.println(optional1.orElse(new Integer(99)));
	}

}
