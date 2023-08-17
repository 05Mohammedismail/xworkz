package com.xworkz.dto.app.repository.pilot;

import com.xworkz.dto.app.PilotDTO;

public interface PilotRepository {

	int TOTAL_COUNT = 5;
	
	void save(PilotDTO dto);
	
}
