package com.xworkz.dto.runner;

import com.xworkz.app.dto.TheaterDTO;
import com.xworkz.repository.theater.TheaterRepository;
import com.xworkz.repository.theater.TheaterRepositoryImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Theater Runner\n");
		
		TheaterDTO dto1 = new TheaterDTO("Malli", "Banglore", "Mallikarjun", "pushpa", 150);		
		TheaterDTO dto2 = new TheaterDTO("Cinemex", "Mysore", "Chetan", "Bahubali", 200);
		TheaterDTO dto3 = new TheaterDTO("ShowBuzzer", "Bijapur", "Suresh", "kgf", 250);

		
		TheaterRepository repository = new TheaterRepositoryImpl();
		repository.save(dto1);
		repository.save(dto2);
		repository.save(dto3);
		
		System.out.println();
		System.out.println("**Find data by movie name**");
		System.out.println(repository.findByMovieName("kgf"));
		
		System.out.println();
		System.out.println("**Find data by ticket cost**");
		System.out.println(repository.findByTicketPrice(200));
		
		System.out.println();
		System.out.println("**Read all Data**");
		TheaterDTO[] data = repository.readAll();
		for(TheaterDTO readAll : data) {
			if(readAll != null) {
				System.out.println(readAll);
			}
		}
	}
	
}