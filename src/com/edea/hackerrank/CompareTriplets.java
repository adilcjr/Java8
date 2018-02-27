package com.edea.hackerrank;

import java.util.Scanner;

public class CompareTriplets {
	
	public static int scoreCompare(int a, int b) {		
		if (a > b) 
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int scoreA = 0;
        int scoreB = 0;
        
        //comparing first
        if (a0 != b0) {
        	if (scoreCompare(a0, b0) == 1) 
        		scoreA++;
        	else 
        		scoreB++;
        }
        
        //comparing second
        if (a1 != b1) {
        	if (scoreCompare(a1, b1) == 1) 
        		scoreA++;
        	else 
        		scoreB++;
        }
        
      //comparing third
        if (a2 != b2) {
        	if (scoreCompare(a2, b2) == 1) 
        		scoreA++;
        	else 
        		scoreB++;
        }       
        
        System.out.println(scoreA + " " + scoreB);
        
	}

}
