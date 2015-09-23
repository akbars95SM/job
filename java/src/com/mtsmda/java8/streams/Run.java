package com.mtsmda.java8.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {
		/*
		 * List<String> strings = Arrays.asList("abc ", "sdfsfd", "", "lldol");
		 * System.out.println(strings);
		 * 
		 * // foreach, limit System.out.println("-----foreach, limit-----");
		 * Random random = new Random();
		 * random.ints().limit(5).forEach(System.out::println);
		 * 
		 * // map System.out.println("-----map-----"); List<Integer> integers =
		 * Arrays.asList(15, 93, 256, 97, 2350, 5); System.out.println(
		 * "integers - " + integers); List<Integer> collect =
		 * integers.stream().map(i -> i *
		 * i).distinct().collect(Collectors.toList()); System.out.println(
		 * "collect - " + collect);
		 * 
		 * // filter System.out.println("-----filter-----"); System.out.println(
		 * "count empty strings - " + strings.stream().filter(string ->
		 * string.isEmpty()).count());
		 * 
		 * // sorted System.out.println("-----sorted-----");
		 * random.ints().limit(10).sorted().forEach(System.out::println);
		 * 
		 */

		/*
		 * Parallel Processing
		 */

		// System.out.println("Strings is not empty = " +
		// strings.parallelStream().filter(string ->
		// !string.isEmpty()).count());

		// Collectors
		System.out.println("Collectors");
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("Filtered List: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		// Statistics
		System.out.println("Statistics");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		System.out.println("Count of all numbers : " + stats.getCount());

	}

}
