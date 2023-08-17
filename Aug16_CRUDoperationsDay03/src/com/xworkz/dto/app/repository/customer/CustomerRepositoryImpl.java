package com.xworkz.dto.app.repository.customer;

import com.xworkz.dto.app.CustomerDTO;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	CustomerDTO[] customerDTOs = new CustomerDTO[TOTAL_COUNT];
	
	int index = 0;
	
	@Override
	public void save(CustomerDTO dto) {
		if(this.index<TOTAL_COUNT) {
			this.customerDTOs[index] = dto;
			System.out.println(dto);
			index++;
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more data");
		}
		
	}

}
