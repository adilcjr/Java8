package com.edea.java8;

import java.util.Scanner;

public class Palindrome {
	
	private static Scanner in;
	
	public static boolean isAlmostPalindrome(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    boolean result = false;
	    int errors = 0;
	    
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            errors++;
	        }
	        ++i1;
	        --i2;
	    }
	    if (errors > 1) {
	    	result = false;
	    } else {
	    	result = true;
	    }
	    
	    return result;
	    
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String aWord = in.next();
		
		System.out.println(aWord + " is a Palindrome: " + isAlmostPalindrome(aWord.toCharArray()));

	}

}
