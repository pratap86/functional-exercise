package com.pratap.functional.streams;

import java.util.ArrayList;
import java.util.List;

public interface DBUtils {

	public static List<Book> getBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Horror Priest", "Nocalus", "Horror", 4, 140.56));
		books.add(new Book("Notebook", "Mach Mochan", "Romance", 3, 189.56));
		books.add(new Book("Ramayana", "Valmiki", "Epic", 4, 255.56));
		books.add(new Book("Mahabharat", "Vyash", "Epic", 4, 567.00));
		books.add(new Book("College Days", "Vimkesh", "Romance", 2, 78.90));
		books.add(new Book("Two Nuclear", "Dr. Shastri", "Science", 5, 89.56));
		books.add(new Book("Harry Potter", "Dr. Rick", "Drama", 4, 890));
		
		return books;
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		
		for(int i = 0; i < 100; i++) {
			
			employees.add(new Employee("Ram", 20000));
			employees.add(new Employee("Rajesh", 3000));
			employees.add(new Employee("Anuj", 15000));
			employees.add(new Employee("Naresh", 8000));
			employees.add(new Employee("Shiva", 200));
			employees.add(new Employee("Krishna", 50000));
		}
		
		return employees;
	}
}
