package com.hughes.spring;
import java.util.*;

public class MapSpring {
	private String name;
	private Map map;
	
	MapSpring(){}
	
	MapSpring(String name, Map map){
		this.map=map;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void display(){
		System.out.println(this.map);
	}
	

}
