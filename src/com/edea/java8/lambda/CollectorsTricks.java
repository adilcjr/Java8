package com.edea.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTricks {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Tom", "Jerry", "Jane", "Jack");
		
		//print the names in uppercase, comma separated.
		System.out.println(
				names.stream()
					.map(String::toUpperCase)
					.collect(Collectors.joining(", ")));
	}
}
