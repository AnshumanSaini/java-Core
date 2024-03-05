package com.hughes.spring;
import java.util.*;
public class SetSpring {
	private String name;
	private HashSet set;
	
	SetSpring(){}
	
	SetSpring(String name, HashSet set){
		this.name=name;
		this.set=set;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashSet getSet() {
		return set;
	}

	public void setSet(HashSet set) {
		this.set = set;
	}
	
	public void display(){
		System.out.println(this.set);
	}
	
}
