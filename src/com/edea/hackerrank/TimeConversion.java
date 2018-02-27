package com.edea.hackerrank;

import java.util.Scanner;

public class TimeConversion {
	
	static String timeConversion(String s) {
		
		boolean am = (s.indexOf("AM") > 0);
		int hh = Integer.parseInt(s.substring(0, 2));
		
		
		if (hh == 12) {
			if (am) {
				return "00" + s.substring(2, 8);
			}
		}
		if (!am && hh <12) {		
			return Integer.toString(hh+12) + s.substring(2, 8);
		}
		return s.substring(0, 8);
		
		
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
	}

}
