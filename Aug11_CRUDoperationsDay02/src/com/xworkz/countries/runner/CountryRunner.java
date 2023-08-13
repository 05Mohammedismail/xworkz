package com.xworkz.countries.runner;

import com.xworkz.countries.app.CountryRepository;
import com.xworkz.countries.implementations.CountryRepositoryImplementation;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Country Runner\n");
		
		CountryRepository repository = new CountryRepositoryImplementation();
		System.out.println("Stroring and Displaying names of Countries");
		repository.save("India");
		repository.save("Africa");
		repository.save("England");
		repository.save("Australia");
		repository.save("NewZealand");
		repository.save("Ireland");
		repository.save("Koria");
		repository.save("China");
		repository.save("Russia");
		repository.save("SriLanka");
		
		System.out.println();
		System.out.println("*Is exist*");
		boolean check = repository.isExist("india");
		System.out.println("Country name existance is : " + check);
		
		System.out.println();
		System.out.println("*Return to Upper case*");
		String upCase = repository.returnUpperCase("srilanka");
		System.out.println(upCase);
		
		System.out.println();
		System.out.println("*Find Startswith*");
		String[] store1 = repository.findStartsWith("A");
		
		System.out.println();
		System.out.println("*Find EndsWith*");
		String[] store2 = repository.findEndsWith("a");
		
		System.out.println();
		System.out.println("*Ascending Order*");
		repository.orderAscending();
		 
		System.out.println();
		System.out.println("*Descending Order*");
		repository.orderDescending();
		
		System.out.println();
		System.out.println("*Saved Count*");
		repository.savedCount(store1);
		System.out.println("");
		repository.savedCount(store2);

		 
	}

	
	
}
