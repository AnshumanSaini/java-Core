package com.hughes.assignment;
import java.util.Hashtable;
import java.util.HashSet;

//Assume there is a hashtable with below values.
//
//Srinivas,srinivas,laptop,Laptop,Edu,Tech.Design code which shld display index of duplicate values(pls ignore case).
public class Collection2 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map=new Hashtable<>();
		String[] arr=new String[] {"Srinivas","srinivas","laptop","Laptop","Edu","Tech"};
		for(int i=0;i<arr.length;++i) map.put(i,arr[i]);
		HashSet<Integer> str=new HashSet<>();
		for(int i=0;i<map.size();++i)
		{
			for(int j=i+1;j<map.size();++j)
				if(map.get(i).equalsIgnoreCase(map.get(j))) str.add(j);
		}
		System.out.println(map);
		System.out.println(str);

	}

}
