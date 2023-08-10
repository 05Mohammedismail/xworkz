package com.xworkz.repository.runner;

import com.xworkz.repository.app.Olympic.OlympicRepository;
import com.xworkz.repository.app.Olympic.OlympicRepositoryImpl;

public class OlympicRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Olympic Runner\n");
		
		OlympicRepository repository = new OlympicRepositoryImpl();
		
		repository.save(2000, "Australia");
		repository.save(2004, "Greece");
		repository.save(2008, "China");
		repository.save(2012, "UK");
		repository.save(2016, "Brazil");

		System.out.println("*******************************");
		
		repository.display();
	}
	
}
