package com.hughes.test;

//write a java program for beow requirement.
//i/p: a b c d e f
//o/p: f1 e2 d3 c4 b5 a6

public class Four {

	public static void main(String[] args) {
		String s="abcdef";
		int n=s.length();
		for(int i=n-1;i>=0;--i)
		{
			System.out.print(s.charAt(i)+Integer.toString(n-i)+" ");
		}
	}

}