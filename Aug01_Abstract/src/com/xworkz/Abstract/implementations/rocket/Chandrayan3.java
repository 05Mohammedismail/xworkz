package com.xworkz.Abstract.implementations.rocket;

import com.xworkz.Abstract.abstractClasses.Rocket;

public class Chandrayan3 extends Rocket {

	@Override
	public void getName() {
		System.out.println("The rocket name is Chandrayan-3");
	}
	
	@Override
	public void getBudget() {
		System.out.println("The budget is 900cr");
	}

}
