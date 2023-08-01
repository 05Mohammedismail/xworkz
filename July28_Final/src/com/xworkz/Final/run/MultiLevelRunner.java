package com.xworkz.Final.run;
import com.xworkz.Final.app.*;
import com.xworkz.Final.app.multiLevel.FoodShop;

public class MultiLevelRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in Multi Level Runner\n");
		
		FoodShop foodShop = new FoodShop("Kalyan Nagar", "5th street, 2nd cross, kalyanNagar","Manoj foods", 
											"Street Shop", "Non-Veg", "Manoj" );
		
		foodShop.printInfo();
		

	}

}
