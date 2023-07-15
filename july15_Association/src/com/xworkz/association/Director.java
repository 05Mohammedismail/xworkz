package com.xworkz.association;

public class Director {
	
	String name;
	int age;
	int noOfMovies;    

	Director(String name , int age , int noOfMovies){
		this.name = name;
		this.age = age;
		this.noOfMovies = noOfMovies;
	}
	
	void printInfo() {
		System.out.println("Running print info in Director");
		System.out.println("Director name :" + this.name);
		System.out.println("Director age  :" + this.age);
		System.out.println("Director noOfMovies  :" + this.noOfMovies);
	}

}
