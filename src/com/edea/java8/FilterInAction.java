package com.edea.java8;

public class FilterInAction {
	
	public static void main(String[] args) {
		
		String s = "saveChangesInTheEditor";
		System.out.println(s.chars().filter(c -> Character.isUpperCase((char) c)).count()+1);
		
	}

}
