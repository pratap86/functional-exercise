package com.pratap.functional.streams;

import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {

		Integer sum = Stream.of(1, 3, 4, 12, 6)
		.reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		
		Integer mul = Stream.of(1, 3, 4, 12, 2)
				.reduce(1, (a, b) -> a * b);
				System.out.println(mul);
	}

}
