package com.xworkz.runner;

import com.xworkz.app.dto.MechanicDTO;
import com.xworkz.service.mechanic.MechanicService;
import com.xworkz.service.mechanic.MechanicServiceImpl;

public class MechanicRunner {

	public static void main(String[] args) {
		System.out.println("Save and Validate operation is running in Mechanic Runner\n");

		MechanicDTO dto = new MechanicDTO("A-one garage", 456, 800, "bike servicing");
		
		MechanicService mechanicService = new MechanicServiceImpl();
		mechanicService.saveAndValidate(dto);
	}

}
