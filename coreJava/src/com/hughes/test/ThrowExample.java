package com.hughes.test;
import java.lang.*;

public class ThrowExample {
	public static void eventest(int a)
	{
		if(a%2==0) System.out.println("even no");
		else throw new ArithmeticException("Given noo is not even");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eventest(3);
	}

}
