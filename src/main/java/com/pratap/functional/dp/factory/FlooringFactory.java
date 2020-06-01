package com.pratap.functional.dp.factory;

import java.util.function.Supplier;

public interface FlooringFactory {

	public static Flooring getFlooring( int minTempreture, int maxTempreture ) {
		
		Supplier<Flooring> flooring;
		
		if( minTempreture <= 5 && maxTempreture <= 20 ) {
			
			flooring = () -> new WoodenFlooring();
			
		} else if( minTempreture <= 5 && maxTempreture >= 45 ) {
			
			flooring = () -> new CorkFlooring();
			
		} else {
			
			flooring = () -> new ConcreteFlooring();
			
		}
		
		return flooring.get();
	}
}
