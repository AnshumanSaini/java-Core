package com.hughes.Threading;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deser1 {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("abc.txt"));
		Game g=(Game)in.readObject();
		System.out.println(g.name);
	}

}