package com.edea.hackerrank;

import java.util.Scanner;

public class ArmyGame {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();        
        int result = 0;
        
        //Squares
        result = (n / 2) * (m / 2);
        
        //Rectangles
        if (n%2 > 0) {
        	result += m / 2;
        }
        if (m%2 > 0) {
        	result += n / 2;
        }
        //Unique
        if ((n%2 > 0) && (m%2 > 0)) {
        	result++;
        }
        System.out.printf("%d", result);

	}

}
