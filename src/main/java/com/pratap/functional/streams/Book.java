package com.pratap.functional.streams;

public class Book {

	private String name;
	private String author;
	private String genre;
	private int rating;
	private double price;
	
	public Book(String name, String author, String genre, int rating, double price) {
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Book [name=%s, author=%s, genre=%s, rating=%s, price=%s]", name, author, genre, rating,
				price);
	}
	
}
