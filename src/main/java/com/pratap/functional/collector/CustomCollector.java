package com.pratap.functional.collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(60, 55, 15, 23, 28, 29, 32, 43, 2, 9, 1);
		
		Collector<Integer, ArrayList<Integer>, ArrayList<Integer>> toList = Collector.of(
					ArrayList::new, // supplier
					(list, e) -> list.add(e), // BiConsumer
					(list1, list2) -> {
						list1.addAll(list2);
						return list1;
					}, // BinaryOperator/ BiFunction
					Collector.Characteristics.IDENTITY_FINISH); // characteristics
		System.out.println("Even numbers");
		numbers.stream()
		.filter(i -> i % 2 == 0)
		.collect(toList).forEach(System.out::println);
		
		
		Collector<Integer, ArrayList<Integer>, ArrayList<Integer>> sortedToListCollector = Collector.of(
					ArrayList::new, 
					(list, e) -> list.add(e), 
					(list1, list2) -> {
						list1.addAll(list2);
						return list1;
					}, 
					(list) -> {
						Collections.sort(list);
						return list;
					}, //sorting
					Collector.Characteristics.UNORDERED);
		System.out.println("odd numbers - sorted");
		numbers.stream()
		.filter(i -> i % 2 != 0)
		.collect(sortedToListCollector)
		.forEach(System.out::println);
		
	}

}
