package com.pratap.functional.dp.factory;

public class FactoryMethodPattern {

	public static void main(String[] args) {

		Flooring flooring = FlooringFactory.getFlooring(-1, 18);
		flooring.installation();
	}

}
