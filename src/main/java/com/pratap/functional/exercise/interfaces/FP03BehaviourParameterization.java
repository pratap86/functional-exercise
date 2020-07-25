package com.pratap.functional.exercise.interfaces;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 15, 20, 13, 22, 14);
		
		// sum of even number present in list
		
		Predicate<Integer> evenPredicate = x -> x%2 ==0;
		filterAndPrint(numbers, evenPredicate);
		
		// sum of odd number present in list
		
		Predicate<Integer> oddPredicate = x -> x%2 !=0;
		
		filterAndPrint(numbers, oddPredicate);
		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
