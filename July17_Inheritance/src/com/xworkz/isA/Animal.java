package com.xworkz.isA;

public class Animal {
	
	String animalName;
	String animalType;
	String foundIn;
	
	public static void main(String[] args) {
		
		Monkey monkey1 = new Monkey("Raju", "Squirrel Monkey","Monkey", "Pygmy Marmoset" , "South America");
		monkey1.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * *");

		Monkey monkey2 = new Monkey("Bunty", "Spider Monkey","Monkey", "Proboscis Monkey" , "South America");
		monkey2.printInfo();
	}
	
	public Animal(String animalName , String animalType , String foundIn) {
		System.out.println("Running string, string, string constructor in Animal (Parent class)");
		this.animalName = animalName;
		this.animalType = animalType;
		this.foundIn = foundIn;
	}

}


