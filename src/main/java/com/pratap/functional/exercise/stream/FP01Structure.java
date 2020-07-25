package com.pratap.functional.exercise.stream;

import java.util.List;

public class FP01Structure {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 15, 20, 13, 22, 14);
		
		int sum = addListStructure(numbers);
		
		System.out.println(sum);
	}

	private static int addListStructure(List<Integer> numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
