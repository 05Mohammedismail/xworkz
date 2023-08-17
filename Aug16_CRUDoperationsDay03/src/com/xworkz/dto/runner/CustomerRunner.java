package com.xworkz.dto.runner;

import com.xworkz.dto.app.CustomerDTO;
import com.xworkz.dto.app.repository.customer.CustomerRepository;
import com.xworkz.dto.app.repository.customer.CustomerRepositoryImpl;

public class CustomerRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Customer Runner\n");
	
		CustomerDTO dto = new CustomerDTO("Manoj", "manojhucha@gmail.com", 9901204699l , "mysoreZoo", 99.9);
		
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		
		customerRepository.save(dto);  
		
	}

}
