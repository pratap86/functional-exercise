package com.pratap.functional.dp.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface StockFilter {

//	public static List<Stock> bySymbol(List<Stock> list, String symbol){
//		
//		List<Stock> filterList = new ArrayList<Stock>();
//		
//		list.stream().filter(p -> p.getSymbol().equals(symbol)).forEach(l -> filterList.add(l));
//		
//		return filterList;
//	}
//	
//	public static List<Stock> byPriceAbove(List<Stock> list, double price){
//		
//		List<Stock> filterList = new ArrayList<Stock>();
//		
//		list.stream().filter(p -> p.getPrice() > price).forEach(l -> filterList.add(l));
//		
//		return filterList;
//	}
	
	public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate){
		List<Stock> filterList = new ArrayList<Stock>();
		
		list.forEach(stock -> {
			if(predicate.test(stock)) {
				filterList.add(stock);
			}
		});
		
		return filterList;
	}
}
