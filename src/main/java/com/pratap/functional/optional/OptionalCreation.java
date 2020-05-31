package com.pratap.functional.optional;

import java.util.Optional;

public class OptionalCreation {

	public static void main(String[] args) {

		String val = "Pratap";
		
		Optional<String> optional = Optional.of(val);
		
		// empty
		Optional<Integer> empty = Optional.empty();
		
		// nullable
		Optional<String> nullable = Optional.ofNullable(val);
		Optional<String> emptyOptional = Optional.ofNullable(null);

		// isPresent
		Integer value = empty.isPresent() ? empty.get() : 0;
		System.out.println(value);
		
		// orElse, orElseGet, orElseThrow
		
		System.out.println(empty.orElse(0));
		System.out.println(empty.orElseGet(() -> 5));
		System.out.println(empty.orElseThrow(() -> new RuntimeException("My Exception")));
	}

}
