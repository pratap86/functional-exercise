package com.pratap.functional.optional;

import java.util.Optional;

public class Operations {

	public static void main(String[] args) {

		Optional<String> optional = Optional.empty();
		
		String optional2 = optional.map(val -> "Narayan").orElseGet(() -> "Deepika");
		
		System.out.println(optional2);
		
		// ifPresent
		
		optional = Optional.of("Pratap");
		optional.ifPresent(System.out::println);
		
		//
//		optional = Optional.empty();
		optional.ifPresentOrElse(System.out::println, () -> System.out.println("value is absent"));
	}

}
