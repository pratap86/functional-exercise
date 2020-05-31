package com.pratap.functional.techniques.chaining;


public class Chaining {

	public static void main(String[] args) {

		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = System.out::println;
		
		Consumer<String> c3 = s -> {
			
			c1.accept(s);
			c2.accept(s);
			
		};
		//c3.accept("Narayan");
		
		Consumer<String> c4 = c1.thenApply(null);
		c4.accept("Pratap");
 	}
}
