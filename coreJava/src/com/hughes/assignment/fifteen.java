package com.hughes.assignment;
import java.util.*;

//Write a Java program to remove duplicate elements from a given array and return the updated array length.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array.

public class fifteen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;++i) list.add(sc.nextInt());
		System.out.println(list);
		for(int i=0;i<list.size();++i)
		{
			for(int j=i+1;j<list.size();++j)
			{
				if(list.get(i)==list.get(j)) list.remove(j--);
			}
		}
		
		System.out.println(list+"   "+list.size());

	}

}
