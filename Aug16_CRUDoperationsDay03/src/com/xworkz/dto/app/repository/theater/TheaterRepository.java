package com.xworkz.dto.app.repository.theater;

import com.xworkz.dto.app.TheaterDTO;

public interface TheaterRepository {

	int TOTAL_COUNT = 5; 
	
	void save(TheaterDTO dto);
}
