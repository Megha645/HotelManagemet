package com.hotel.hilton;

public class Person {

	private String name;
	private char sex;
	
	public Person(String name,char sex) {
		this.sex = sex;
		this.name = name;
	}
	
	public Person() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
}
