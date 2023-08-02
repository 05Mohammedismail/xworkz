package com.xworkz.Abstract;
import com.xworkz.Abstract.abstractClasses.Rocket;
import com.xworkz.Abstract.implementations.rocket.*;

public class RocketRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Rocket Runner\n");
		
		Rocket rocket1 = new Chandrayan2();
		rocket1.getCountry();
		rocket1.getName();
		rocket1.getBudget();

		System.out.println("* * * * * * * * * * * * * * * *");
		
		Rocket rocket2 = new Chandrayan3();
		rocket2.getCountry();
		rocket2.getName();
		rocket2.getBudget();
	}

}
