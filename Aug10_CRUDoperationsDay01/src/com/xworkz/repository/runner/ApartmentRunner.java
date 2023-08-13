package com.xworkz.repository.runner;

import com.xworkz.repository.app.Apartment.ApartmentRepository;
import com.xworkz.repository.app.Apartment.ApartmentRepositoryImpl;

public class ApartmentRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Apartment Runner\n");
		
		ApartmentRepository repository = new ApartmentRepositoryImpl();
		repository.save("Nice Homes");
		repository.save("Royal Homes");
		repository.save("Simple Homes");
		repository.save("Ideal Homes");
		repository.save("Ideal Homes wonder");
		
		System.out.println("*******************************");
		
		repository.display();

	}

}
