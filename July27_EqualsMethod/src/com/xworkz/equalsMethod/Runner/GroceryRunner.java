package com.xworkz.equalsMethod.Runner;

import com.xworkz.equalsMethod.app.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Grocery Runner\n");
		
		Grocery grocery1 = new Grocery("Vegetable",50);
		Grocery grocery2 = new Grocery("Fruit",50);
		
		System.out.println("Object one: \n" + grocery1 + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("Object two: \n" + grocery2 + "\n");

		boolean result = grocery1.equals(grocery2);
		System.out.println("The grocery being same is : " + result);
	}

}
