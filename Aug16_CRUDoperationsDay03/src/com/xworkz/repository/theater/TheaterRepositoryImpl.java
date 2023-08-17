package com.xworkz.dto.app.repository.theater;

import com.xworkz.dto.app.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {
	TheaterDTO[] theaterDTOs = new TheaterDTO[TOTAL_COUNT];
		
		int index = 0;
		
		@Override
		public void save(TheaterDTO dto) {
			if(this.index<TOTAL_COUNT) {
				this.theaterDTOs[index] = dto;
				System.out.println(dto);
				index++;
			}
			else {
				System.err.println("Index limit exceeded, Cannot store more data");
			}
			
		}
	
	}
