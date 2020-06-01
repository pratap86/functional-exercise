package com.pratap.functional.dp.fluent;

public class FluentShopping {

	public static void main(String[] args) {

		Order.place((Order order) -> 
			order.add("shoes")
				 .add("chocolate")
				 .deliverAt("13th Main, MG Road")
		);
	}

}
