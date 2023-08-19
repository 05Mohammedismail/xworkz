package com.xworkz.repository.customer;

import com.xworkz.app.dto.CustomerDTO;

public interface CustomerRepository {

	 int TOTAL_COUNT = 5;
	
	 public void save(CustomerDTO dto);
	
	public CustomerDTO findByName(String name);
	
	public CustomerDTO findByMailId(String mailId);
	
	public CustomerDTO findByPhoneNumber(long num);
	
	public CustomerDTO[] readAll();
 	
	
}
