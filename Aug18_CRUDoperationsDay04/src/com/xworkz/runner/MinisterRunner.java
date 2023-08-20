package com.xworkz.runner;

import com.xworkz.app.dto.MinisterDTO;
import com.xworkz.service.minister.MinisterService;
import com.xworkz.service.minister.MinisterServiceImpl;

public class MinisterRunner {

	public static void main(String[] args) {

		System.out.println("Save and Validate operation is running in Minister Runner\n");
		
		MinisterDTO dto = new MinisterDTO("Yadyuvarappa", 30, "CM", "BJP");
		MinisterService ministerService = new MinisterServiceImpl();
		ministerService.saveAndValidate(dto);

	}

}
