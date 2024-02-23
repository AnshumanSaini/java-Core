package com.hughes.test;

public class NewOne {

	public void display( int z, int ...a)
	{
		System.out.println(z);
		int sum=0;
		for(int i : a)
		{
			sum+=i;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		new NewOne().display(10, 20);

	}

}
