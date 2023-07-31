package com.xworkz.Final.app;

public class Coacher {
	
	private String name;
	private int age;
	
	public Coacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}



	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}



	public void printInfo() {
		System.out.println("Coach Name :"+name);
		System.out.println("Coach age :"+age);
	}
	
	
	
	
}
