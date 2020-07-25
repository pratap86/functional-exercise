package com.pratap.functional.exercise.interfaces;

import java.util.List;
import java.util.function.Supplier;

public class FP05MethodReference {

	private static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {

		List<String> cources = List.of("Spring", "Spring boot", "Microservices", "Docker", "Kubernetes");
		
		cources.stream()
		.map(String :: toUpperCase)
		.forEach(FP05MethodReference::print);
		
		// constructor reference
		
		Supplier<String> constructorSupplier = String::new;
	}

}
