package com.hughes.test;

import java.util.Arrays;

//"cat"
//"bat"
//"rat"
//"computer"
// 
//in an array
// 
//and display the contents in array in ascending order.

public class ArraysOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"cat", "bat", "rat", "computer"};
		Arrays.sort(arr);
		for(String i : arr) System.out.println(i);
	}

}
