package com.pratap.functional.streams;

import java.util.stream.Stream;

public class FlatMapOperation {

	public static void main(String[] args) {

		Stream<String> a = Stream.of("Hello there !");
		Stream<String> b = Stream.of("Learning Java8");
		
		Stream<Stream<String>> of = Stream.of(a, b);
		of.flatMap(e -> e).forEach(System.out::println);
	}

}
