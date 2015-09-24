package com.mtsmda.java8.defaultAndStaticMethodInTheInterface;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Supplier;

public class Run {

	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return (sqrt(9) + 119) * a;
			}
		};

		System.out.println(formula.sqrt(16));
		System.out.println(formula.calculate(9));

		/**/
		System.out.println("-------------------------------");

		DefaultI defaultI = new DefaultI() {
		};
		defaultI.method();

		defaultI = new ClassImplDefaultI();
		defaultI.method();

		defaultI = new ClassNoImplDefaultI();
		defaultI.method();

		Car create = DefaulableFactory.create(new Supplier<Car>() {

			@Override
			public Car get() {
				Car car = new Car();
				car.setModel("BMW X5");
				car.setColor("green");
				car.setLocalDateAssembly(LocalDate.of(2010, Month.AUGUST, 19));
				return car;
			}
		});

		System.out.println(create);
		
	}

}

interface DefaultI {
	default void method() {
		System.out.println("default method in the interface!");
	}
}

class ClassImplDefaultI implements DefaultI {
	@Override
	public void method() {
		System.out.println("ClassImplDefaultI");
	}
}

class ClassNoImplDefaultI implements DefaultI {

}

/* static */

class Car {
	private String model;
	private String color;
	private LocalDate localDateAssembly;

	public Car() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getLocalDateAssembly() {
		return localDateAssembly;
	}

	public void setLocalDateAssembly(LocalDate localDateAssembly) {
		this.localDateAssembly = localDateAssembly;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", localDateAssembly=" + localDateAssembly + "]";
	}

}

interface DefaulableFactory {

	static Car create(Supplier<Car> supplier) {
		return supplier.get();
	}

}
