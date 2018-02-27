package com.edea.hackerrank;

import java.util.Scanner;

public class BestDivisor {

	private static Scanner in;

	private static int sumDivisor(int a) {

		int y, i, p = 1;
		int sum = 0;
		int pointer = a;

		while (a >= p) {
			y = (pointer % 10);
			pointer /= 10;
			sum += y;
			p *= 10;
		}		
		return sum;
	}

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 2;
		int newDivisor = 0;
		int result = 1;

		while (i <= n) {

			if (n % i == 0) {
				System.out.println("i: " + i);
				newDivisor = sumDivisor(i);
				if (sumDivisor(result) <= newDivisor)
					result = i;
			}
			i++;
		}

		System.out.println(result);
	}
}
