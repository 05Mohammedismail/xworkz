package com.xworkz.dto.runner;

import com.xworkz.dto.app.TheaterDTO;
import com.xworkz.dto.app.repository.theater.TheaterRepository;
import com.xworkz.dto.app.repository.theater.TheaterRepositoryImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Theater Runner\n");
		
		TheaterDTO dto = new TheaterDTO("Mallikarjun", "Banglore", "Mallikarjun", "pushpa", 150);
		
		TheaterRepository repository = new TheaterRepositoryImpl();
		repository.save(dto);

	}

}
