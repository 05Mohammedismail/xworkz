package com.xworkz.repository.pilot;

import com.xworkz.app.dto.PilotDTO;

public interface PilotRepository {

	int TOTAL_COUNT = 5;
	
	public void save(PilotDTO dto);
	
	public PilotDTO findByName(String name);
	
	public PilotDTO findByAge(int age);
	
	public PilotDTO findByPilotId(int id);
	
	public PilotDTO[] readAll();
	
	
	
	
	
}
