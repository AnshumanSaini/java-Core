package com.hughes.users;

import java.util.Arrays;

//write a java program for beow requirement.
//i/p: 34567
//o/p: Thirty four Thousand Five Hunderad and Sixty Seven Only

public class Five {

	public static void main(String[] args) 
	{
		String s="2";
		int[] tmp=new int[6];
		Arrays.fill(tmp,-1);
		int n=s.length();
		for(int i=0;i<n;++i)
		{
			tmp[i]=Character.getNumericValue(s.charAt(n-i-1));
		}
		System.out.println(Arrays.toString(tmp));
		String[] one=new String[]{"one","two","three","four","five","six","seven","eight","nine", "ten"};
		String[] teen=new String[] {"eleven", "twelve","thriteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] pos=new String[]{"","ty "," hundred and "," thousand ","ty "," lakh "};
		
		for(int i=0;i<n;++i)
		{
			if(tmp[i]==0) continue;
			
			if(i+1<pos.length && pos[i+1].trim().equals("ty") &&  tmp[i]==1) 
				{
					System.out.print(teen[tmp[i]+1]+" "+one[tmp[i]+1]);
					--i;
				}
			else if(i+1<pos.length && pos[i+1].trim().equals("ty") &&  tmp[i]!=1) 
				{
					System.out.print(one[tmp[i+2]+1]+"ty "+one[tmp[i+1]+1]);
				}
			else {
				System.out.print(pos[tmp[i]+1]+" ");
			}
		}
		System.out.print("only");
	}

}