package com.hughes.test;


interface A
{
	public void display();
	public void displayA();
	public void displayC();
	public void displayB();
	
	
}

class BaseA
{
	public void display()
	{
		System.out.println("Base A");
	}
}

class B extends BaseA implements A
{
	public void display()
	{
		System.out.println("B");
	}
	public void displayB()
	{
		System.out.println("B test");
	}
}

class C extends BaseA implements A
{
	public void display()
	{
		System.out.println("C");
	}
	
	public void displayC()
	{
		System.out.println("C");
	}
}
public class HierInhTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseA a=new B();
		a.display();
		a.displayB();
		

	}

}
