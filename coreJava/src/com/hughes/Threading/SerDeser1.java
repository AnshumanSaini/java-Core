package com.hughes.Threading;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Game implements Serializable{
	String name="Game";
}
public class SerDeser1 {

	public static void main(String[] args) {
		Game g=new Game();
		try
		{
			FileOutputStream fout=new FileOutputStream("abc.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fout);
			ob.writeObject(g);
			ob.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
