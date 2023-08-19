package com.xworkz.dto.runner;

import com.xworkz.app.dto.CustomerDTO;
import com.xworkz.repository.customer.CustomerRepository;
import com.xworkz.repository.customer.CustomerRepositoryImpl;

public class CustomerRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Customer Runner\n");
	
		CustomerDTO dto1 = new CustomerDTO("Manoj", "manojhucha@gmail.com", 9901204699l , "mysoreZoo", 99.9);
		CustomerDTO dto2 = new CustomerDTO("Suraj", "surajneelagar@gmail.com", 8971658685l , "Dharwad", 189.9);
		CustomerDTO dto3 = new CustomerDTO("Ismail", "mohammedismail@gmail.com", 9008131234l , "Hosadurga", 299.9);

		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		
		customerRepository.save(dto1);  
		customerRepository.save(dto2);
		customerRepository.save(dto3);
		
		System.out.println();
		
		System.out.println("**Finding data by name**");
		CustomerDTO byName = customerRepository.findByName("manu");
		System.out.println("Data found is  :" + byName);
		
	    System.out.println();
		
		System.out.println("**Finding data by mailId**");
		CustomerDTO byMailId = customerRepository.findByMailId("mohammedismail@gmail.com");
		System.out.println("Data found is  :" + byMailId);
		
		System.out.println();
		
		System.out.println("**Finding data by Phone Number**");
		CustomerDTO byPhNumber = customerRepository.findByPhoneNumber(9901204699l);
		System.out.println("Data found is  :" + byPhNumber);
		
		System.out.println();
		
		System.out.println("**read all data**");
		CustomerDTO[] arr  =  customerRepository.readAll();
		for(CustomerDTO data : arr) {
			if(data!= null) {
				System.out.println(data);
			}

		}
		
	}

}
