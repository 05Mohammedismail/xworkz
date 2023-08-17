package com.xworkz.dto.runner;

import com.xworkz.dto.app.MarketDTO;
import com.xworkz.dto.app.repository.market.MarketRepository;
import com.xworkz.dto.app.repository.market.MarketRepositoryImpl;

public class MarketRunner {

	
public static void main(String[] args) {
	
	System.out.println("Running main in Market Runner\n");
	
	MarketDTO dto = new MarketDTO("Shivaji Market", "Shivaji Nagar", "Fashion", 500, "8am to 9pm");
	
	MarketRepository marketRepository = new MarketRepositoryImpl();
	marketRepository.save(dto);
}
	

}
