package com.pratap.functional.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public interface MovieDB {

	public static List<Movie> getMovies(){
		
		return Arrays.asList(
				
						new Movie("Bahubali 2", 2018, "Tollywood"),
						new Movie("Tere Naam", 2009, "Bollywood"),
						new Movie("3 Idiots", 2009, "Bollywood"),
						new Movie("DDLG", 1999, "Bollywood"),
						new Movie("Harry Potter 2", 2004, "Hollywood"),
						new Movie("Beauty & the Beast", 2008, "Hollywood"),
						new Movie("Himmatwala", 2010, "Bollywood"),
						new Movie("Ram Teri Ganga", 1978, "Bollywood"),
						new Movie("Border", 1995, "Bollywood")
				);
		
	}
	
	public static Map<String, Movie> getMoviesMap(){
		
		Map<String, Movie> moviesMap = new HashMap<String, Movie>();
		
		List<Movie> movies = getMovies();
		
		AtomicInteger atomic = new AtomicInteger(200);
		movies.forEach( movie -> {
			moviesMap.put("AXY"+atomic.getAndIncrement(), movie);
		});
		
		return moviesMap;
	}
}
