package com.hughes.test;

//programme to count number, character, other 

public class Second {
	public static void main(String args[])
	{
		String s="aksajd5676@$%^";
		int ch_cnt=0;
		int no_cnt=0;
		int other_cnt=0;
		
		for(char c : s.toCharArray())
		{
			int ascii=(int)c;
			if(ascii>=48 && ascii<=57) ++no_cnt;
			else if(ascii>=97 && ascii<=122) ++ch_cnt;
			else ++other_cnt;
		}
		System.out.println("Number Count: "+no_cnt);
		System.out.println("Character Count: "+ch_cnt);
		System.out.println("Symbol_cnt: "+other_cnt);
	}
}
