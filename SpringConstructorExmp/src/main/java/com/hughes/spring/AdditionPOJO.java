package com.hughes.spring;

public class AdditionPOJO {
	private int one;
	private int two;
	
	AdditionPOJO(int a, int b){
		this.one=a;
		this.two=b;
	}
	
	public void add(){
		System.out.println(one+two);
	}

}
