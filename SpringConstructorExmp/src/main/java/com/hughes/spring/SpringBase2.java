package com.hughes.spring;

public class SpringBase2 {
	
	SpringBase1 b1ref;
	
	SpringBase2(){
		System.out.println("SpringBase2");
	}

	public SpringBase1 getB1ref() {
		return b1ref;
	}

	public void setB1ref(SpringBase1 b1ref) {
		this.b1ref = b1ref;
	}
	
	public void Base2Display(){
		b1ref.display();
	}

}
