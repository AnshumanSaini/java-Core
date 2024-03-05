package com.hughes.spring;

public class SubtractionPOJO {
	private int one;
	private int two;
	
	SubtractionPOJO(int a, int b){
		this.one=a;
		this.two=b;
	}
	
	public void sub(){
		System.out.println(one-two);
	}

}
