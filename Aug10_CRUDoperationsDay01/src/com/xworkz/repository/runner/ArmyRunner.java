package com.xworkz.repository.runner;

import com.xworkz.repository.app.Army.ArmyRepository;
import com.xworkz.repository.app.Army.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Army Runner\n");

		ArmyRepository repository = new ArmyRepositoryImpl();
		
		repository.save("Roadrunners");
		repository.save("Night Train");
		repository.save("Demons");
		repository.save("Dawgs");
		repository.save("Wolf-pack");
		
		System.out.println("***************************");
		
		repository.display();

	}

}
