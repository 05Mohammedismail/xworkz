package com.xworkz.repository.customer;

import com.xworkz.app.dto.CustomerDTO;

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

	@Override
	public CustomerDTO findByName(String name) {
		for(int pos=0; pos<index; pos++) {
			if(customerDTOs[pos].getName().equalsIgnoreCase(name)) {
				System.out.println("Match is found");
				return customerDTOs[pos];
			}
			System.out.println("Match not found at index:"+ pos + " so Checking in next index");
		}
		System.err.println("Sorry Match not found");
		return null;
	}

	@Override
	public CustomerDTO findByMailId(String mailId) {
		for(int pos=0; pos<index; pos++) {
			if(customerDTOs[pos].getMailId().equals(mailId)) {
				System.out.println("Match Found at index:" + pos );
				return customerDTOs[pos];
			}
			System.out.println("Match not found at index:" + pos + " so Checking in next index");
		}
		System.err.println("Sorry Match not found!!!");
		return null;
	}

	@Override
	public CustomerDTO findByPhoneNumber(long num) {
		for(int pos=0; pos<index; pos++) {
			if(customerDTOs[pos].getPhNumber()== num) {
				System.out.println("Match found at index:" + pos);
				return customerDTOs[pos];
			}
			System.out.println("Match not found at index:" + pos + " so Checking in next index");
		}
		System.err.println("Sorry Macth not found!!!");
		return null;
	}

	@Override
	public CustomerDTO[] readAll() {
		
		return customerDTOs;
	}

}
