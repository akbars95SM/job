package com.mtsmda.java8.defaultAndStaticMethodInTheInterface;

import java.util.ArrayList;
import java.util.List;

public class Java8Reference {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Messi");
		names.add("Ronaldo");
		names.add("Roony");
		names.add("Xavi");
		names.add("Casillas");
		
		names.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		new SpainFootballClub().printName();
		new SpainFootballClub2().printName();
		new SpainFootballClub().leaderName();
		RealMadrid.stadiumName();
	}
	
}

interface Barcelona{
	
	default void printName(){
		System.out.println(Barcelona.class.getName());
	}
	
	default void leaderName(){
		System.out.println("Messi");
	}
	
}

interface RealMadrid{
	
	default void printName(){
		System.out.println(RealMadrid.class.getName());
	}
	
	static void stadiumName(){
		System.out.println("Сантьяго Бернабеу");
	}
	
}

class SpainFootballClub implements Barcelona, RealMadrid{
	
	@Override
	public void printName() {
		Barcelona.super.printName();
	}
	
}

class SpainFootballClub2 implements Barcelona, RealMadrid{
	
	@Override
	public void printName() {
		System.out.println("Barcelona - Real Madrid");
	}
	
}