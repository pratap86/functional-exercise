package com.pratap.functional.exercise.interfaces;
/**
 * 
 * @author Pratap Narayan
 * Supplier - No input return somethong - uses Factory Pattern
 * BiPredicate - 
 * BiFunction - 
 * BiConsumer - 
 * PrimitiveFunctional - 
 *
 */

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP04BiFunctionalInterface {

	
	public static void main(String[] args) {
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> 3 *x;
		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (num, str) -> {
			return num > 10 && str.length() < 5;
		};
		
		System.out.println(biPredicate.test(10, "test"));
		
		BiFunction<Integer, String, Boolean> biFunction = (num, str) -> {
			return num > 10 && str.length() < 5;
		};
		
		System.out.println(biFunction.apply(11, "test"));
		
		BiConsumer<Integer, String> biConsumer = (num, str) -> {
			System.out.println(num);
			System.out.println(str);
		};
		biConsumer.accept(10, "Pratap");
	}
}
