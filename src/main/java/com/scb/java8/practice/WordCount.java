package com.scb.java8.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "/Users/nishi/Documents/bigdatafacts.txt";
        
		//read file into stream, try-with-resources
		try (Stream<String> line = Files.lines(Paths.get(fileName))) {

			line.forEach(System.out::println);
			//line.collect(Collectors.groupingBy(a->a,Collectors.counting()));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
