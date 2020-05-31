package com.pratap.functional.hof;
@FunctionalInterface
public interface IProducer<T> {

	/**
	 * IProducor produce an Item of type T
	 * @return
	 */
	T produce();
	
}
