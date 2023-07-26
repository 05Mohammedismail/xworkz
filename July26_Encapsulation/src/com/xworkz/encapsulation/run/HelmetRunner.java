package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in Helmet Runner");
		
		Helmet helmet = new Helmet();
		
		System.out.println(helmet);
		helmet.setHelmet("Steel Bird", 1, 2500, 2000, "orange");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println(helmet);
		
	}

}
