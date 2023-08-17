package com.xworkz.dto.runner;

import com.xworkz.dto.app.PilotDTO;
import com.xworkz.dto.app.repository.pilot.PilotRepository;
import com.xworkz.dto.app.repository.pilot.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Pilot Runner\n");
		
		PilotDTO dto = new PilotDTO("Ismail", "male", 22, 512, false);

		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.save(dto);
	}

}
