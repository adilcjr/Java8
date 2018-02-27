package com.edea.hackerrank;

import java.io.Serializable;
import java.util.Scanner;

public class PrimeCalc implements Serializable{
	
	private static Scanner in;
	
	public static boolean isPrime(int number) {
		if (number < 2) return false;
		for (int i=2; i<= Math.floor(Math.sqrt(number)); i++) {
			if (number % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		//in = new Scanner(System.in);
		//int number = in.nextInt();
		//System.out.println("Number: " + isPrime(number));
		
		int last=0;
		
		for (int i = 2; i < 1000000; i++) {
			
			if (isPrime(i)) { 
				System.out.printf("Prime %d - diff: %d \n", i, i-last);
				last = i;
			}
						
		}
	}

}
