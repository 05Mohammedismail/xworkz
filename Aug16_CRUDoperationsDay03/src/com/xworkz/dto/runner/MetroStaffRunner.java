package com.xworkz.dto.runner;

import com.xworkz.app.dto.MetroStaffDTO;
import com.xworkz.repository.metroStaff.MetroStaffRepository;
import com.xworkz.repository.metroStaff.MetroStaffRepositoryImpl;

public class MetroStaffRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Metro Staff Runner\n");

		MetroStaffDTO dto1 = new MetroStaffDTO("Banglore", "Btm", 50, 12, false);
		MetroStaffDTO dto2 = new MetroStaffDTO("Banglore", "Hoodi", 30, 8, true);
		MetroStaffDTO dto3 = new MetroStaffDTO("Banglore", "Rajajinagar", 40, 10, false);

		
		MetroStaffRepository metroStaffRepository = new MetroStaffRepositoryImpl();
		metroStaffRepository.save(dto1);
		metroStaffRepository.save(dto2);
		metroStaffRepository.save(dto3);
		
		System.out.println();
		System.out.println("**finding data by metro station name**");
		MetroStaffDTO byStationName = metroStaffRepository.findByMetroStationName("rajajinagar");
		System.out.println(byStationName);
		
		System.out.println();
		System.out.println("**finding data by number of employees**");
		MetroStaffDTO byNoOfEmployees = metroStaffRepository.findByNumberOfEmployees(45);
		System.out.println(byNoOfEmployees);
		
		System.out.println();
		System.out.println("**Read all data**");
		MetroStaffDTO[] readAll = metroStaffRepository.readAll();
		for(MetroStaffDTO data : readAll) {
			if(data!=null) {
				System.out.println(data);
			}
		}
	}

}
