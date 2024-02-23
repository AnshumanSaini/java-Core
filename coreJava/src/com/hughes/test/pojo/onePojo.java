package com.hughes.test.pojo;

public class onePojo {
	private String firstName;
	private String lastName;
	
	public onePojo() {}
	
	public String display()
	{
		return firstName+lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
