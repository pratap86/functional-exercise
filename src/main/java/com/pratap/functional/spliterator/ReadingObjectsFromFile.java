package com.pratap.functional.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.pratap.functional.streams.Book;

public class ReadingObjectsFromFile {

	public static void main(String[] args) {
		
		String pathVar = "/Users/835698/development/functional-programming/functional-and-reactive/src/main/java/com/pratap/functional/spliterator/Books";
		
		Path path = Paths.get(pathVar);
		
		try(Stream<String> lines = Files.lines(path);){
			
			Spliterator<String> baseSpliterator = lines.spliterator();
			
			Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);
			
			Stream<Book> stream = StreamSupport.stream(bookSpliterator, false);
			
			System.out.println(bookSpliterator.estimateSize());
			stream.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
