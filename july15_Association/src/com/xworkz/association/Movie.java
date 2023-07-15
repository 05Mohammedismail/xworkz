package com.xworkz.association;

public class Movie {
	
	String name;
	double budget;
	String language;
	String releaseDate ;
	
	Director director = new Director("Prashanth neel" , 43 , 5);

	public static void main(String[] args) {
		
		System.out.println("Running main in Movie");
		
		Movie movie1 = new Movie("KGF" , 80);
		Movie movie2 = new Movie("UGRAM" , 4);
		
		movie1.setLanguage("Kannada");
		movie2.setLanguage("Kannada");
		
		
		movie1.releaseDate = "21Dec2018";
		movie2.releaseDate = "21Feb2014";
      
		movie1.printInfo();
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		movie2.printInfo();

	}
	
	Movie(String name , double budget){
		this.name = name;
		this.budget = budget;
	}
	
	void setLanguage(String language) {
		this.language = language;
	}
	
	void printInfo() {
		System.out.println("Running print info in Movie");
		System.out.println("Movie name  :" + this.name);
		System.out.println("Movie budget in Cr:" + this.budget);
		System.out.println("Movie language :" + this.language);
		System.out.println("Movie releaseDate :" + this.releaseDate);
		System.out.println("");
		this.director.printInfo();

	}

}
