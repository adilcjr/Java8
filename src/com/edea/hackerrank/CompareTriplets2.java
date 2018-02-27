package com.edea.hackerrank;

import java.util.Scanner;

public class CompareTriplets2 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] a_triplet = new int[3];
		int[] b_triplet = new int[3];
		for (int i = 0; i < 3; i++) {
			a_triplet[i] = in.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b_triplet[i] = in.nextInt();
		}
		int alice_points = 0;
		int bob_points = 0;
		for (int i = 0; i < 3; i++) {
			if (a_triplet[i] > b_triplet[i]) {
				alice_points += 1;
			} else if (a_triplet[i] < b_triplet[i]) {
				bob_points += 1;
			}
		}
		System.out.printf("%d %d", alice_points, bob_points);
	}

}
