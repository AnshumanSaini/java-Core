package com.hughes.assignment;
import java.util.*;

//Program to find duplicate numbers in an array if it contains multiple duplicates?

public class Sixteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		Set<Integer> rep=new HashSet<>();
		
		for(int i=0;i<n;++i) list.add(sc.nextInt());
		
		for(int i=0;i<n;++i)
		{
			for(int j=i+1;j<n;++j)
			{
				if(list.get(i)==list.get(j)) rep.add(list.get(i));
			}
		}
		
		System.out.println(list);
		System.out.println(rep);

	}

}