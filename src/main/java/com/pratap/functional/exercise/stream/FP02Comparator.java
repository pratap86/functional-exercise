package com.pratap.functional.exercise.stream;

import java.util.Comparator;
import java.util.List;

public class FP02Comparator {

	public static void main(String[] args) {
		
		List<String> cources = List.of("Spring", "Spring boot", "Microservices", "Docker", "Kubernetes");
		
		cources.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

}
