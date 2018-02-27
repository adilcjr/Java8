package com.edea.hackerrank;

import java.util.Scanner;

public class FibonacciNumbers {
	
	public static int fibonacci(int n) {
		
		int result = 0;
		
		switch (n) {
		case 0:
			result = 0;
			break;
		case 1:
			result = 1;
			break;
		default:
			result = fibonacci(n-1) + fibonacci(n-2);
			break;
		}		

        return result; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Calculating...");
        System.out.println(fibonacci(n));
    }

}
