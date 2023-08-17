package com.xworkz.dto.runner;

import com.xworkz.dto.app.MetroStaffDTO;
import com.xworkz.dto.app.repository.metroStaff.MetroStaffRepository;
import com.xworkz.dto.app.repository.metroStaff.MetroStaffRepositoryImpl;

public class MetroStaffRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Metro Staff Runner\n");

		MetroStaffDTO dto = new MetroStaffDTO("Banglore", "Btm", 50, 12, false);
		
		MetroStaffRepository metroStaffRepository = new MetroStaffRepositoryImpl();
		metroStaffRepository.save(dto);
		
	}

}
