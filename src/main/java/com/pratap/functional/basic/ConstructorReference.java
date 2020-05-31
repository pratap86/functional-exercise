package com.pratap.functional.basic;

import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {

		Function<Runnable, Thread> threadGenerator = Thread :: new ;
		
		threadGenerator.apply(() -> System.out.println("Task 1 executing..")).start();
		threadGenerator.apply(() -> System.out.println("Task 2 executing..")).start();
	}

}
