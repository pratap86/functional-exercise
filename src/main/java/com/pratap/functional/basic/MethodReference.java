package com.pratap.functional.basic;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println(s);
		//1. object :: instanceMethod
		Consumer<String> c2 = System.out::println;
		
		c1.accept("Hello");
		c2.accept("Hello from method reference");
		
		Supplier<Double> s1 = () -> Math.random();
		// 2. Class :: static method
		Supplier<Double> s2 = Math::random;
		System.out.println(s1.get());
		System.out.println(s2.get());
		
		// 3. Class :: instance method
		
		Function<String, Integer> f1 = str -> str.length();
		
		Function<String, Integer> f2 = String :: length;
		
		// 4. Class :: new or aka. constructor reference
	}

}
