package com.xworkz.diamondProblem.runner;

import com.xworkz.diamondProblem.app.pet.CatPetRule;
import com.xworkz.diamondProblem.app.pet.DogPetRule;
import com.xworkz.diamondProblem.app.pet.MyPetRule;
import com.xworkz.diamondProblem.app.pet.PetRule;

public class PetRuleRunner {

	public static void main(String[] args) {
		System.out.println("Runnig main in Pet Rule Runner\n");
		
		PetRule pet = new MyPetRule();
		pet.getBath();
		pet.getFood();
		
		System.out.println(" ");
		
		DogPetRule dog = new MyPetRule();
		dog.getBath();
		dog.getFood();
		dog.getWalk();
		
		System.out.println();
		
		CatPetRule cat = new MyPetRule();
		cat.getBath();
		cat.getFood();
		cat.getSleep();
		
		System.out.println(" ");
		
		MyPetRule myPet = new MyPetRule();
		myPet.getBath();
		myPet.getFood();
		myPet.getWalk();
		myPet.getSleep();


	}

}
