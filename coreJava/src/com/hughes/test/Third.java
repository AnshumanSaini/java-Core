package com.hughes.test;

//write a java program for beow requirement.
//i/p:Hyderabad
//o/p:dabaredyH

public class Third {

	public static void main(String[] args) {
		String s="Hyderabad";
		int n=s.length();
		char[] ch=new char[n];
		for(int i=0;i<n;++i)
		{
			ch[n-i-1]=s.charAt(i);
		}
		System.out.println(new String(ch));

	}

}
