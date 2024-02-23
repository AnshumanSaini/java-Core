package com.hughes.test;
import com.hughes.customExceptions.VoteException;

public class VoteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=2;
		try
		{
			if(age<18) throw new VoteException("Invalid Age");
			else System.out.println("Valid Age");
		}
		catch(VoteException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
