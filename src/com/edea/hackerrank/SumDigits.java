package com.edea.hackerrank;

public class SumDigits {

	public static void main(String[] args) {
		int x = 54309;
	    int y, i, p=1;
	    int sum = 0;
	    int n = x;
	    //for(i=1; x>=1; i++) {
	    	
	    while (x >= p) {	
	        y = (n % 10);
	        System.out.println("y: " + y);
	        n /= 10;
	        sum += y;
	        System.out.println("p: " + p);
	        System.out.println("x: " + x);
	        p *= 10;
	        
	        
	    }
	    System.out.printf("%d\n", sum);

	}

}
