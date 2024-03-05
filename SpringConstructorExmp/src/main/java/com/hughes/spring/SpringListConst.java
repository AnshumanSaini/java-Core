package com.hughes.spring;

import java.util.*;


public class SpringListConst {
	
	private String fullName;
	private List list;
	
	SpringListConst(String fullName, List list){
		this.fullName=fullName;
		this.list=list;
	}
	
	public void display(){
		System.out.println(this.list);
	}

}
