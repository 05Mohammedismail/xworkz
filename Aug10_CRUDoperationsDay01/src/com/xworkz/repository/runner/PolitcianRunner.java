package com.xworkz.repository.runner;

import com.xworkz.repository.app.Politician.PoliticianRepository;
import com.xworkz.repository.app.Politician.PoliticianRepositoryImpl;

public class PolitcianRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Politician Runner\n");
		
		PoliticianRepository repository =  new PoliticianRepositoryImpl();
		repository.save("DKS");
		repository.save("Pradeep");
		repository.save("Prathap");
		repository.save("HDK");
		repository.save("Manoj");
		
		System.out.println("**************************");
		
		repository.display();
	}

}
