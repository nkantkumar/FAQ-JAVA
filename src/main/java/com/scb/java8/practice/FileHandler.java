package com.scb.java8.practice;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nNumber of words of each length:");
		String fileName = "/Users/nishi/Documents/bigdatafacts.txt";
		
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			Map<Integer, Long> map = lines.filter(s -> s.length() > 1)
					.collect(Collectors.groupingBy(String::length, Collectors.counting()));
			// .forEach((len, num) -> System.out.printf("%d: %d%n", len, num));
			map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
					.forEach(e -> System.out.printf("Length %d: %2d words%n", e.getKey(), e.getValue()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
