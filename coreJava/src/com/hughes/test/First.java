package com.hughes.test;

//write the programme those the following;
//i/p:Java Fullstack
//expected o/p: jAVA fULLSTACK

public class First {

	public static void main(String[] args) {
		String s="Java Fullstack";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;++i)
		{
			if(Character.isUpperCase(ch[i])) ch[i]=Character.toLowerCase(ch[i]);
			else ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}

}
