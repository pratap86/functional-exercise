package com.pratap.functional.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapFunctionalOPerations {

	public static void main(String[] args) {

		Map<String, Movie> moviesMap = MovieDB.getMoviesMap();
		
		// 1. traversal -- prior to java 8
		 for(Map.Entry<String, Movie> entry : moviesMap.entrySet()) {
			 System.out.println(entry.getKey()+" - "+entry.getValue());
		 }
		 System.out.println("java 8 way..");
		 // from java 8
		 moviesMap.forEach( (k, v) -> System.out.println(k+" - "+v));
		 
		 // 2. filter
		System.out.println("Map filter to display only Bollywood");
		 moviesMap.entrySet().stream()
		 .filter(movie -> movie.getValue().getIndustry().equalsIgnoreCase("Bollywood"))
		 .forEach(System.out::println);
		 
		 // 3. Map
		 System.out.println("Map - map function");
		 moviesMap.entrySet().stream()
		 .distinct()
		 .map(str -> str.getValue())
		 .filter(movie -> movie.getReleaseYear() >= 2009)
		 .forEach(System.out::println);
		 
		 // 4. sorting
		 System.out.println("sorted map");
		 LinkedHashMap<Entry<String, Movie>, Entry<String, Movie>> sortedMap = moviesMap.entrySet().stream()
		 .sorted(Entry.comparingByKey())
		 .collect(Collectors.toMap(k -> k, v -> v, (v1, v2) -> v1, LinkedHashMap::new));
		 
		 System.out.println(sortedMap);
		 
		 
		 moviesMap.entrySet().stream()
		 .map(str -> str.getValue())
		 .sorted((movie1, movie2) -> movie1.getName().compareTo(movie2.getName()))
		 .forEach(System.out::println);
	}

}
