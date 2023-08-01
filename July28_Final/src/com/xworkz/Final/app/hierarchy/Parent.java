package com.xworkz.Final.app.hierarchy;

public class Parent {
	
	private String name;
	private long number;
	
	
	public Parent(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public void printInfo() {
		System.out.println("Parent Name :"+name);
		System.out.println("Parent Number :"+number);
	}
	

}
