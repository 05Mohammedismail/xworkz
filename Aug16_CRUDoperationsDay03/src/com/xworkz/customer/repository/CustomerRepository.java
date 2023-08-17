package com.xworkz.dto.app.repository.customer;

import com.xworkz.dto.app.CustomerDTO;

public interface CustomerRepository {

	 int TOTAL_COUNT = 5;
	
	void save(CustomerDTO dto);
}
