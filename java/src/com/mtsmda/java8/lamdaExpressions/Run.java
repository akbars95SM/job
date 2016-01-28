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

		Dog dog1 = new Dog("Yasha", 10, 5);
		Dog dog2 = new Dog("Vasya", 5, 10);
		Dog dog3 = new Dog("Ivan", 12, 15);

		Dog[] dogs = {dog1, dog2, dog3};

		/*Arrays.sort(dogs, new Comparator<Dog>() {
			@Override
			public int compare(Dog dog1, Dog dog2) {
				return dog1.getWeight() - dog2.getWeight();
			}
		});*/

		Arrays.sort(dogs, (dogC1, dogC2) -> dog1.getWeight() - dog2.getWeight());

		printDogs(dogs);


	}

	private static void printDogs(Dog [] dogs){
		System.out.println("-----Dogs-----");
		for(Dog dog : dogs){
			System.out.println(dog);
		}
	}


}

class Dog{
	private String name;
	private int height;
	private int weight;

	public Dog(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", height=" + height +
				", weight=" + weight +
				'}';
	}
}