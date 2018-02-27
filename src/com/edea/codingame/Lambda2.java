package com.edea.codingame;

import java.util.Comparator;

public class Lambda2 {

	public static int closeZero(int s1, int s2) {

		if (s1 == 0 && s2 != 0)
			return s2;
		if (Math.abs(s1) == Math.abs(s2)) {
			if (s1 < s2)
				return s2;
			return s1;
		} else if (Math.abs(s1) < Math.abs(s2)) {
			return s1;
		} else {
			return s2;
		}
	}
	
	interface CompareNumbers {
		int operation(int a, int b);
	}

	public static void main(String[] args) {

		int[] numbers = { 45, 2, 3, 12, -5, 2, 8, 1, -1 };
		int closest = 0;
		
		//Lambda impl		
		Comparator<Integer> closestZero = (s1, s2) -> {
			if (s1 == 0 && s2 != 0)
				return s2;
			if (Math.abs(s1) == Math.abs(s2)) {
				if (s1 < s2)
					return s2;
				return s1;
			} else if (Math.abs(s1) < Math.abs(s2)) {
				return s1;
			} else {
				return s2;
			}
		};
		
		/*CompareNumbers closestZero = (s1, s2) -> {
			if (s1 == 0 && s2 != 0)
				return s2;
			if (Math.abs(s1) == Math.abs(s2)) {
				if (s1 < s2)
					return s2;
				return s1;
			} else if (Math.abs(s1) < Math.abs(s2)) {
				return s1;
			} else {
				return s2;
			}
		};*/
		
		for (int i = 0; i < numbers.length; i++) {

			int t = numbers[i];

			// closest = closeZero(closest, t);
			
			// With declared interface
			// closest = closestZero.operation(closest, t);

			// Without declared interface
			closest = closestZero.compare(closest, t);

			System.out.println("Closest: " + closest);
		}
	}

}
