package com.hughes.test;
import java.io.*;
class Mat
{
	public void myMethod() throws IOException, NullPointerException {
		System.out.println("My method activated");
		throw new IOException("TEST");
	}
}

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Mat().myMethod();

	}

}