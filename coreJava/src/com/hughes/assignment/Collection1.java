package com.hughes.assignment;
import java.util.HashMap;

//assume there is an array with 6 elementsie {bat,rat,cat,mat,TV,Laptop}.
//Deisgn a hashmap whose values are same as array element  value and whose keys are index no in hashmap.
public class Collection1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		String[] arr=new String[] {"bat","rat","cat","mat","TV","Laptop"};
		for(int i=0;i<arr.length;++i) map.put(i, arr[i]);
		System.out.println(map);

	}

}
