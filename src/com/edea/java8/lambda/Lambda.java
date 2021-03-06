package com.edea.java8.lambda;

import java.util.Arrays;

public class Lambda {

	public static void main(String[] args) {
		String separator = ", ";
		Arrays.asList("banana", "maçã", "laranja", "goiaba", "limão").forEach (
			(String e)  -> {
				System.out.print(e + separator);
		});
		System.out.printf("%n%n");
		Arrays.asList("banana", "maçã", "laranja", "goiaba", "limão").sort( (e1, e2) -> {
			System.out.println("e1: " + e1);
			System.out.println("e2: " + e2);
			System.out.println("----------");
			int result = e1.compareTo(e2);
			return result;
		});
		System.out.println("");
	}
}