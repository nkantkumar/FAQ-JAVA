package com.scb.java8.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.taglibs.standard.functions.Functions;

public class FileHandlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String fileName = "/Users/nishi/Documents/bigdatafacts.txt";
		
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			//Map<String, Integer> map = lines.collect(Collectors.toMap(b->b, String::length));
					//.collect(Collectors.groupingBy(String::length, Collectors.counting()));
			//map.forEach((e,p)-> System.out.printf("%d: %d%n", e, p));
			//map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
					//.forEach(e -> System.out.printf("Length %d: %2d words%n", e.getKey(), e.getValue()));
			
			//Map<Integer, List<String>> lengthMap = lines.collect(Collectors.groupingBy(String::length));
			//lengthMap.forEach((e,p)-> System.out.printf("%d: %d%n", e, p));
			
			Map<String, Integer> map1 = Collections.unmodifiableMap( new HashMap<String, Integer>() {{
			    put("have", 1);
			    put("the", 2);
			    put("high", 3);
			    put("ground", 4);
			}});
			List<String> strings = Arrays.asList(
					"this", null, "is", "a", null, "list", "of", "strings", null);
			
			List<String> nonNullStrings = strings.stream()
				    .filter(Objects::nonNull)
				    .collect(Collectors.toList());
			nonNullStrings.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
