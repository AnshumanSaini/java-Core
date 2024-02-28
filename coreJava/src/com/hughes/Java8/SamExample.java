package com.hughes.Java8;

@FunctionalInterface
interface SamExample1{
	void display();
	
	public default void h1(){ //default methods...
		System.out.println("hi");
	}
}

public class SamExample implements SamExample1{

	public static void main(String[] args) {
		new SamExample().display();
		new SamExample().h1();

	}
	
	public void display(){
		System.out.println("hey");
	}

}
