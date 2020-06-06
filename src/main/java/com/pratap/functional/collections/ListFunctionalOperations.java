package com.pratap.functional.collections;

import java.util.List;
import java.util.Optional;
/**
 * @operation on List are sorted, filter, map & reduce
 * @author Pratap Narayan
 *
 */
public class ListFunctionalOperations {

	public static void main(String[] args) {

		List<Movie> movies = MovieDB.getMovies();
		 
		 // Traversing List
		 movies
		.stream()
		.forEach(System.out::println);
		 
		 System.out.println("movies sorted accordingly release year dec order");
		 // 2. Applying sorting in to list to the fly
		 movies.stream()
		 .sorted((movie1, movie2) -> movie2.getReleaseYear() - movie1.getReleaseYear())
		 .forEach(System.out::println);
		 
		 // 3. Filter
		 System.out.println("Movies released by Bollywood only");
		 movies.stream()
		 .filter(movie -> movie.getIndustry().equalsIgnoreCase("Bollywood"))
		 .forEach(System.out::println);
		 
		 // 4. Map
		 System.out.println("Movies - display only Movie name");
		 movies.stream()
		 .map(movie -> movie.getName())
		 .forEach(System.out::println);
		 
		 // 5.reduce
		 System.out.println("Movies - display with reduce | symbol");
		 Optional<String> reduceMovies = movies.stream()
		 .map(movie -> movie.getName())
		 .reduce((movie1, movie2) -> movie1+" | "+ movie2);
		 System.out.println(reduceMovies);
	}

}
