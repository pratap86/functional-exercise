package com.pratap.functional.dp.iterator;

public class IteratorPattern {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList(new Object[] {1, 2, 12, 32, 65, 98});
		
		list.forEach(System.out::println);
	}

}
