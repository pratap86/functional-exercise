package com.pratap.functional.hof;
/**
 * 
 * @author 835698
 * HOF - take lambda as parameter or return type or does both
 * Use case:
 * we have to create a Factory whose does the - Produce Items, Configure Items & Supply the items 
 */
public class HigherOrderFunction {

	public static void main(String[] args) {

		IFactory<Integer> factory = createFactory(() -> Math.random()*100, value -> value.intValue());
		Integer product = factory.create();
		System.out.println(product);
		
	}
	
	public static <T, R> IFactory<R> createFactory( IProducer<T> producor, IConfigurator<T, R> configurator ){
		
		return () -> {
		
			T product = producor.produce();
			return configurator.configure(product);
		};
		
	}

}
