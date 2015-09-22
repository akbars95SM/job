package com.mtsmda.java8.defaultMethodInTheInterface;

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
	}
	
}