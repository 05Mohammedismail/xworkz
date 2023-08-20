package com.xworkz.runner;

import com.xworkz.app.dto.CeoDTO;
import com.xworkz.service.ceo.CeoService;
import com.xworkz.service.ceo.CeoServiceImpl;

public class CeoRunner {

	public static void main(String[] args) {
		System.out.println("Save and Validate operation is running in Ceo Runner\n");
		
		CeoDTO ceoDTO1 = new CeoDTO("SteveJobs", "Apple", 93231321, 30);

		CeoService ceoService  =  new CeoServiceImpl();
		ceoService.saveAndValidate(ceoDTO1);


	}

}
