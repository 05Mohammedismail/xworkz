package com.xworkz.dto.runner;

import com.xworkz.app.dto.MarketDTO;
import com.xworkz.repository.market.MarketRepository;
import com.xworkz.repository.market.MarketRepositoryImpl;

public class MarketRunner {

	
public static void main(String[] args) {
	
	System.out.println("Running main in Market Runner\n");
	
	MarketDTO dto1 = new MarketDTO("Shivaji Market", "Shivaji Nagar", "Fashion", 500, "8am to 9pm");
	MarketDTO dto2 = new MarketDTO("Banglore Market", "Banglore", "Groceries", 800, "6am to 7pm");
	MarketDTO dto3 = new MarketDTO("Hyderabad Market", "Hyderabad", "Accesseries", 500, "7am to 10pm");

	MarketRepository marketRepository = new MarketRepositoryImpl();
	marketRepository.save(dto1);
	marketRepository.save(dto2);
	marketRepository.save(dto3);
	
	System.out.println();
	System.out.println("**Finding data byNumberOFShops**");
	MarketDTO byNoOfShops = marketRepository.findByNoOfShops(800);
			System.out.println(byNoOfShops );
		
			
			System.out.println();
			System.out.println("**Finding data by market type**");
			MarketDTO byMarketType = marketRepository.findByMarketType("fashio");
			System.out.println(byMarketType);

			System.out.println();
			System.out.println("**Finding data by market address**");
			MarketDTO byMarketAddress = marketRepository.findByAddress(null);
			System.out.println(byMarketAddress);
			
			System.out.println();
			System.out.println("**Read all data**");
			MarketDTO[]  readAll = marketRepository.readAll();
			for(MarketDTO data : readAll) {
				if(data!=null) {
					System.out.println( data);
				}
			}
	}
}
	


