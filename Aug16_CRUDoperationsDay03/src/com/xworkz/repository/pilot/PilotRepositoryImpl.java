package com.xworkz.repository.pilot;

import com.xworkz.app.dto.PilotDTO;

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

	@Override
	public PilotDTO findByName(String name) {
		for(int pos=0; pos<index; pos++) {
			if(pilotDTOs[pos].getName().equalsIgnoreCase(name)) {
				System.out.println("Match found at index:" + pos);
				return pilotDTOs[pos];
			}
			System.out.println("Match not found at index :" + pos + " so Checking at next index");
		}
		System.err.println("Sorry match not found!!!");
		return null;
	}

	@Override
	public PilotDTO findByAge(int age) {
		for(int pos=0; pos<index; pos++) {
			if(pilotDTOs[pos].getAge() ==  age) {
				System.out.println("Match found at index:" + pos);
				return pilotDTOs[pos];
			}
			System.out.println("Match not found at index " + pos + " so Checking at next index");
		}
		System.err.println("Sorry match not found!!!");
		return null;
	}

	@Override
	public PilotDTO findByPilotId(int id) {
		for(int pos=0; pos<index; pos++) {
			if(pilotDTOs[pos].getPilotId() ==  id) {
				System.out.println("Match found at index:" + pos);
				return pilotDTOs[pos];
			}
			System.out.println("Match not found at index " + pos + " so Checking at next index");
		}
		System.err.println("Sorry match not found!!!");
		return null;
	}

	@Override
	public PilotDTO[] readAll() {
		return pilotDTOs;
	}

}



