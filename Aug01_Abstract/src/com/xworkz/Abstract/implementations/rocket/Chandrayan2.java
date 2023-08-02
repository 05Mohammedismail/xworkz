package com.xworkz.Abstract.implementations.rocket;

import com.xworkz.Abstract.abstractClasses.Rocket;

public class Chandrayan2 extends Rocket{

	@Override
	public void getName() {
		System.out.println("The rocket name is Chandrayan-2");
	}
	
	@Override
	public void getBudget() {
		System.out.println("The budget is 250cr");			
	}

}
