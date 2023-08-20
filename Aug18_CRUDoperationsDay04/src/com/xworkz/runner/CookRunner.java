package com.xworkz.runner;

import com.xworkz.app.dto.CookDTO;
import com.xworkz.service.cook.CookService;
import com.xworkz.service.cook.CookServiceImpl;

public class CookRunner {

	public static void main(String[] args) {
		System.out.println("Save and Validate operation is running in Cook Runner\n");
		
		CookDTO cookDTO  = new CookDTO("Biriyani", "Bright Hotel", "Male", 45000);
		
		CookService cookService =  new CookServiceImpl();
		cookService.saveAndValidate(cookDTO);

	}

}
