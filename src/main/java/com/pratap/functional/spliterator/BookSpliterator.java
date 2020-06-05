package com.pratap.functional.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

import com.pratap.functional.streams.Book;
/**
 * 
 * @author 835698
 *
 */
public class BookSpliterator implements Spliterator<Book> {
	
	private String name;
	private String author;
	private String genre;
	private int rating;
	private double price;
	private Spliterator<String> baseSpliterator;
	

	public BookSpliterator(Spliterator<String> baseSpliterator) {
		this.baseSpliterator = baseSpliterator;
	}

	@Override
	public boolean tryAdvance(Consumer<? super Book> action) {

		if (this.baseSpliterator.tryAdvance(name -> this.name = name)
				&& this.baseSpliterator.tryAdvance(author -> this.author = author)
				&& this.baseSpliterator.tryAdvance(genre -> this.genre = genre)
				&& this.baseSpliterator.tryAdvance(rating -> this.rating = Integer.valueOf(rating))
				&& this.baseSpliterator.tryAdvance(price -> this.price = Double.valueOf(price))) {

			action.accept(new Book(this.name, this.author, this.genre, this.rating, this.price));
			return true;
		}

		return false;
	}

	@Override
	public Spliterator<Book> trySplit() {
		// still not process parallel
		return null;
	}

	/**
	 * not working as per business
	 */
	@Override
	public long estimateSize() {
		return baseSpliterator.estimateSize() / 5;
	}

	@Override
	public int characteristics() {
		return baseSpliterator.characteristics();
	}

}
