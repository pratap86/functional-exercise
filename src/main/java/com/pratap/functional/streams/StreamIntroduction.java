package com.pratap.functional.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {

	public static void main(String[] args) {

		List<Book> books = DBUtils.getBooks();
		
		
		Stream<Book> stream = books.stream();
		
		List<Book> filterBooks = stream
				.filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
				.filter(book -> book.getRating() > 3)
				.collect(Collectors.toList());
		
		
		if(! filterBooks.isEmpty()){
			
			filterBooks.forEach(System.out::println);
		} else {
			System.out.println("No matching records found,");
		}
		
		List<Book> filterBooks2 = stream.filter(book -> book.getAuthor().equalsIgnoreCase("Vyash")).collect(Collectors.toList());
		
	}

}
