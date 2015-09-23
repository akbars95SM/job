package com.mtsmda.java8.lamdaExpressions;

public class Java8Lambda {

	public static void main(String[] args) {
		Java8Lambda java8Lambda = new Java8Lambda();

		MathOperation additional = (double a, double b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (double a, double b) -> {
			return a * b;
		};
		MathOperation division = (a, b) -> a / b;

		System.out.println("additional - " + additional.operation(17.9, 19.5));
		System.out.println("subtraction - " + subtraction.operation(17.9, 19.5));
		System.out.println("multiplication - " + multiplication.operation(17.9, 19.5));
		System.out.println("division - " + division.operation(17.9, 19.5));

		
		GreetingService greetingService = message -> System.out.println(message);
		GreetingService greetingService2 = (message) -> System.out.println(message);
		GreetingService greetingService3 = (message) -> {
			System.out.println("----------");
			System.out.println(message);
			System.out.println("**********");
		};
		
		greetingService.sayMessage("Simple Message");
		greetingService2.sayMessage("Simple Message 2");
		greetingService3.sayMessage("Simple Message 3");
		
	}

	private interface MathOperation {
		double operation(double a, double b);
	}

	private interface GreetingService {
		void sayMessage(String message);
	}

	private double operate(double a, double b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}