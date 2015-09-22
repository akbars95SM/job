package com.mtsmda.java8.linksToMethodsAndConstructors;

public interface PersonFactory <P extends Person>{
	
	P create(String firstName, String lastName);
	
}
