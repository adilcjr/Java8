package com.edea.hackerrank;

import java.util.Scanner;

public class MarsExploration {

	private static Scanner in;

	private static String generateSOSChain(int aChainQty) {

		String result = "";
		for (int i = 0; i < aChainQty; i++) {
			result += "SOS";
		}
		return result;
	}

	private static int compareChains(String a, String b) {

		int result = 0;

		if (a.length() == b.length()) {

			for (int i = 0; i < a.length(); i++) {
				result += (a.charAt(i) == b.charAt(i)) ? 0 : 1;
			}

		}

		return result;
	}

	public static void main(String[] args) {

		in = new Scanner(System.in);
		String chain = in.next();

		int chainQty = chain.length() / 3;

		int changeLetters = compareChains(chain, generateSOSChain(chainQty));

		System.out.printf("%d", changeLetters);

	}
}
