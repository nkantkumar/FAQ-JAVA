package com.scb.java8.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String args[]) {

		List<String> actors = Stream.of("Hank Azaria", "Janeane Garofalo", "William H. Macy", "Paul Reubens",
				"Ben Stiller", "Kel Mitchell", "Wes Studi").collect(Collectors.toCollection(LinkedList::new));

		actors.stream().forEach(System.out::println);
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		List<Integer> nums = numbers.parallelStream()
		.map(n->n*2)
		.peek(n -> System.out.printf("%s processing %d%n",
		              Thread.currentThread().getName(), n))
		      .sequential()
		      .sorted()
		      .collect(Collectors.toList());
		nums.forEach(System.out::println);
		
		List<Book> books = Arrays.asList(
				new Book(1, "Modern Java Recipes", 49.99),
				new Book(2, "Java 8 in Action", 49.99),
				new Book(3, "Java SE8 for the Really Impatient", 39.99),
				new Book(4, "Functional Programming in Java", 27.64), 
				new Book(5, "Making Java Groovy", 45.99),
				new Book(6, "Gradle Recipes for Android", 23.76)
				);
		
		books.stream().collect(Collectors.toMap(Book::getId, b->b));
		System.out.println(books.stream().collect(Collectors.toMap(Book::getId, b->b)));
	}

}
