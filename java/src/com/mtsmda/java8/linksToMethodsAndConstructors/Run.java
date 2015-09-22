package com.mtsmda.java8.linksToMethodsAndConstructors;

import com.mtsmda.java8.functionalInterface.FunctionalInterfaceI;

public class Run {

	public static void main(String[] args) {

		FunctionalInterfaceI<String, Integer> converter = Integer::valueOf;
		System.out.println(converter.convert("195"));

		System.out.println(new Something().startWith("Java"));

		Something something = new Something();
		Converter<String, String> converter2 = something::startWith;
		System.out.println(converter2.convert("PHP"));
		
		
		/**------------------------*/
		
		PersonFactory<Person> factory = Person::new;
		Person person = factory.create("Ivanov", "Ivan");
		System.out.println(person);

	}

}

interface Converter<S, SS> {

	S convert(SS s);

}

class Something {

	protected String startWith(String text) {
		return String.valueOf(text.charAt(0));
	}

}