package com.xworkz.dto.app.repository.pilot;

import com.xworkz.dto.app.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository {
	
	PilotDTO[] pilotDTOs = new PilotDTO[TOTAL_COUNT];
	
	int index = 0;
	
	@Override
	public void save(PilotDTO dto) {
		if(this.index<TOTAL_COUNT) {
			this.pilotDTOs[index] = dto;
			System.out.println(dto);
			index++;
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more data");
		}
		
	}

}



