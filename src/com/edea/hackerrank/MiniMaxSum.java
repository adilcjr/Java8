package com.edea.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		long min = 0;
		long max = 0;
		
		in = new Scanner(System.in);
		long[] numbers = new long[5];
		
		for (int i = 0; i < 5; i++) {
			numbers[i] = in.nextInt();
		}
		
		//Sorting
		Arrays.sort(numbers);
		
		//Solving min
		for (int i = 0; i < numbers.length-1; i++) {
			min += numbers[i];			
		}
		
		for (int i = numbers.length-1; i > 0 ; i--) {
			max += numbers[i];
		}
		
		System.out.printf("%d %d", min, max);

	}

}
