package com.xworkz.dto.runner;

import com.xworkz.app.dto.PilotDTO;
import com.xworkz.repository.pilot.PilotRepository;
import com.xworkz.repository.pilot.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Pilot Runner\n");
		
		PilotDTO dto1 = new PilotDTO("Ismail", "male", 22, 512, false);
		PilotDTO dto2 = new PilotDTO("Pratheek", "male", 24, 600, false);
		PilotDTO dto3 = new PilotDTO("Hitesh", "male", 23, 435, true);

		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.save(dto1);
		pilotRepository.save(dto2);
		pilotRepository.save(dto3);
		
		System.out.println();
		System.out.println("**Findind data by pilot name**");
		PilotDTO byName = pilotRepository.findByName("hitesh");
		System.out.println(byName);
		
		System.out.println();
		System.out.println("**Findind data by pilot age**");
		PilotDTO byAge = pilotRepository.findByAge(22);
		System.out.println(byAge);
		
		System.out.println();
		System.out.println("**Findind data by pilot id**");
		PilotDTO byPilotId = pilotRepository.findByPilotId(600);
		System.out.println(byPilotId);
		
		System.out.println();
		System.out.println("**Read all data**");
		PilotDTO[] data = pilotRepository.readAll();
		for(PilotDTO readAll : data) {
			if(readAll != null) {
				System.out.println(readAll);
			}
		}
	}

}
