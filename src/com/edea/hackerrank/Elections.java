package com.edea.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Elections {
	
	static String electionWinner(String[] votes) {
		
		Map<String, Integer> totCandidato = new HashMap<String, Integer>();
		String winner = "";
		int vWinner = 0;
		
		for(int n=0; n < votes.length; n++) {
			
				int value = totCandidato.getOrDefault(votes[n], 0);
				
				//System.out.println(votes[n] + " : " + value);
				totCandidato.put(votes[n], new Integer(++value));
		}
		
		//System.out.println("**Hash**");
		
			
		for (String key : totCandidato.keySet()) {
			
			int votos = totCandidato.get(key);
			System.out.println(key + " = " + votos);
			
			if (vWinner < votos) {
				vWinner = votos;
				winner = key;
			}
			
		}
		
		return winner;
		
	}
	
	public static void main(String[] args) {
		
		String[] votes = new String[] {"Adil", "André", "Adil", "André", "Roberto", "Marcelo", "Roberto", "Roberto", "Adil"};
		
		System.out.println(electionWinner(votes));
		
		
	}

}
