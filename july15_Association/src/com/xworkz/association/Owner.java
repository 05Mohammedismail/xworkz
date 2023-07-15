package com.xworkz.association;

public class Owner {
	
	String name;
	int age;
	String gender = "male";
	
	
	Owner(String name , int age , String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void printInfo() {
		System.out.println("Running print Info in Owner...");
		System.out.println("Owner name : " + name);
		System.out.println("Owner age : " + age);
		System.out.println("Owner gender : " + gender);
	}
}
