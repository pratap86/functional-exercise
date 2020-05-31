package com.pratap.functional.hof;

@FunctionalInterface
public interface IConfigurator<T, R> {

	/**
	 * configure an item of type T and return an item of type T
	 */
	R configure(T t);
}
