package com.pratap.functional.dp.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {

		Burger myOrder = new BurgerShop(burger -> burger.addCheese())
				.use(new BurgerShop(burger -> burger.addVegies()).use(new Burger()));
		System.out.println("I get "+myOrder);
	}

}
