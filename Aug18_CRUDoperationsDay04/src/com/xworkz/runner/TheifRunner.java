package com.xworkz.runner;

import com.xworkz.app.dto.TheifDTO;
import com.xworkz.service.theif.TheifService;
import com.xworkz.service.theif.TheifServiceImpl;

public class TheifRunner {

	public static void main(String[] args) {
		
		System.out.println("Save and Validate operation is running in Theif Runner\n");
		TheifDTO dto = new TheifDTO("chain snatching", 2.5, 24, null, 0);
		TheifService service = new TheifServiceImpl();
		
		service.saveAndValidate(dto);
						
	}

}
