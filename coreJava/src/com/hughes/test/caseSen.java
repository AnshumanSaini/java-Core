package com.hughes.test;

public class caseSen {

	public static void main(String[] args) {
		
		String s1="anshuman";
		String s2="Anshuman";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Matched");
		}
		else System.out.println("Not Matched");

	}

}
