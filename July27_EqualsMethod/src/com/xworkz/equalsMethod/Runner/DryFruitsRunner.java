package com.xworkz.equalsMethod.Runner;
import com.xworkz.equalsMethod.app.DryFruits;

public class DryFruitsRunner {

	public static void main(String[] args) {

		System.out.println("Running main in DryFruit Runner\n");
		
		DryFruits dryFruits1 = new DryFruits("Almond", "Suraj stores", "online", 200, 100, 25);
		DryFruits dryFruits2 = new DryFruits("Almond", "Suraj stores", "online", 200, 100, 25);
		
		System.out.println("Object one:\n"+dryFruits1+"\n");
		System.out.println("* * * * * * * * * * * * * * * * * *\n");
		System.out.println("Object two:\n"+dryFruits2+"\n");
		
		boolean result = dryFruits1.equals(dryFruits2);
		System.out.println("The DryFruits being same is : " + result);
	}

}
