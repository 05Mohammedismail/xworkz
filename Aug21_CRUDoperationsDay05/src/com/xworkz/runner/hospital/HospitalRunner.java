package com.xworkz.runner.hospital;

import com.xworkz.dto.hospital.HospitalDTO;
import com.xworkz.service.hospital.HospitalService;
import com.xworkz.service.hospital.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO dto1 = new HospitalDTO("Meghan", "Shimoga", 40, 10);
		HospitalDTO dto2 = new HospitalDTO("Government Hospital", "Banglore", 10, 5 );
		
		HospitalService  hospitalService = new HospitalServiceImpl();
		
		boolean result1 = hospitalService.validate(dto1);
		if(result1) {
			System.out.println("Inputs being saved is : "+ result1);
		}
		else {
			System.err.println("Inputs being saved is : "+ result1);
		}
		
		System.out.println("*******************************");
		
		boolean result2 = hospitalService.validate(dto2);
		if(result2) {
			System.out.println("Inputs being saved is : "+ result2);
		}
		else {
			System.err.println("Inputs being saved is : "+ result2);
		}
		
		System.out.println("********************************");
		
		hospitalService.findByHospitalName("government hospital");
		
		System.out.println("**********************************");
		
		hospitalService.findByNameAndNoOfDoctors("Government Hospital", 5);
	
	}

}
