package com.pratap.functional.exercise.stream;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 15, 20);
		
		int sum = addListFunctional(numbers);
		
		System.out.println(sum);
		// 12*12 + 9*9 + 15*15 + 20*20 + 13*13 + 22*22 + 14*14
		int sumOfSquareEachListElem = squareListFunctional(numbers);
		
		System.out.println(sumOfSquareEachListElem);
		
		int sumOfCubeEachListElem = cubeListFunctional(numbers);
		
		System.out.println(sumOfCubeEachListElem);
		
		int sumOfOddNumEachListElem = sumOfOddListFunctional(numbers);
		
		System.out.println(sumOfOddNumEachListElem);
	}

	private static int sumOfOddListFunctional(List<Integer> numbers) {
		return numbers.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum);
	}

	private static int cubeListFunctional(List<Integer> numbers) {
		return numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum);
	}

	private static int squareListFunctional(List<Integer> numbers) {
		return numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
	}

	public static int sum(int aggregate, int nextNumber) {
		
		System.out.println(aggregate +" "+ nextNumber);
		return aggregate + nextNumber;
	}
	
	private static int addListFunctional(List<Integer> numbers) {
		
//		return numbers.stream().reduce(0, FP01Functional::sum);
//		return numbers.stream().reduce(0, (x, y) -> x+y);
		return numbers.stream().reduce(0, Integer::sum);
	}

}
