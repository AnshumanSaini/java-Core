package com.hughes.assignment;
import com.hughes.customExceptions.CharacterException;

//Program,
//If given i/p is number,throw Numberformat exception 
//otherwise  if i/p is character ,throw CharacterException
//Else display Valid String

public class Fourteen {
	public static void check(String str) throws NumberFormatException, CharacterException
	{
		if(str.length()==1)
		{
			if(Character.isDigit(str.charAt(0))) throw new NumberFormatException("this is a number");
			else throw new CharacterException("this is a Character");
		}
		else System.out.println(str);
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try
		{
//			check("hey");
//			check("h");
			check("1");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
