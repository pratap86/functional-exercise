package com.pratap.functional.dp.decorator;

/**
 * 
 * @author 835698
 * BurgerShop doing the job for preparing the Burger type like Vegies or Cheese
 */

import java.util.function.Function;

public class BurgerShop {

	Function<Burger, Burger> decoration;

	public BurgerShop(Function<Burger, Burger> decoration) {
		this.decoration = decoration;
	}

	public Burger use(Burger baseBurger) {
		System.out.println("Base Burger : " + baseBurger);
		return decoration.apply(baseBurger);
	}
}
