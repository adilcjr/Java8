package com.edea.hackerrank;

import java.util.Scanner;

public class Multiply {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
        
        int value = sc.nextInt();            
        
        
        for (int i=1; i <= 10; i++) {
            System.out.format("%d x %d = %d %n", value, i, value*i);
        }

	}

}
