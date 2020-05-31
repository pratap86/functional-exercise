package com.pratap.functional.dp.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

	public static void main(String[] args) {

		List<Stock> stockList = new ArrayList<Stock>();
		
		stockList.add(new Stock("Apple", 1299.98, 12.2));
		stockList.add(new Stock("Google", 7865.98, 8.2));
		stockList.add(new Stock("Max", 897, 1));
		stockList.add(new Stock("Yahoo", 8999.08, 18.2));
		stockList.add(new Stock("Apple", 878.98, 10.29));
		stockList.add(new Stock("Google", 1988.98, 12.2));
		stockList.add(new Stock("Shri", 9876.98, 127.2));
		
		System.out.println("---------- bySymbol --------");
//		StockFilter.bySymbol(stockList, "Apple").forEach(System.out::println);
		StockFilter.filter(stockList, stock -> stock.getSymbol().equals("Apple")).forEach(System.out::println);
		System.out.println("---------- byPriceAbove --------");
//		StockFilter.byPriceAbove(stockList, 12.2).forEach(System.out::println);
		StockFilter.filter(stockList, stock -> stock.getPrice() > 12.2 ).forEach(System.out::println);
	}

}
