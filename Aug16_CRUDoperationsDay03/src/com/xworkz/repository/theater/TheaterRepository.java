package com.xworkz.repository.theater;

import com.xworkz.app.dto.TheaterDTO;

public interface TheaterRepository {

	int TOTAL_COUNT = 5; 
	
	public void save(TheaterDTO dto);
	
	public TheaterDTO findByMovieName(String name);
	
	public TheaterDTO findByTicketPrice(int price);
	
	public TheaterDTO[] readAll();
			
}
