package com.xworkz.repository.theater;

import com.xworkz.app.dto.TheaterDTO;

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

		@Override
		public TheaterDTO findByMovieName(String name) {
			for(int pos=0; pos<index; pos++) {
				if(theaterDTOs[pos].getMovie().equalsIgnoreCase(name)) {
					System.out.println("Match found at index:" + pos);
					return theaterDTOs[pos];
				}
				System.out.println("Match not found at index :" + pos + " so Checking at next index");
			}
			System.err.println("Sorry match not found!!!");
			return null;
		
		}

		@Override
		public TheaterDTO findByTicketPrice(int price) {
			for(int pos=0; pos<index; pos++) {
				if(theaterDTOs[pos].getTicketCost() ==  price) {
					System.out.println("Match found at index:" + pos);
					return theaterDTOs[pos];
				}
				System.out.println("Match not found at index " + pos + " so Checking at next index");
			}
			System.err.println("Sorry match not found!!!");
			return null;
		}

		@Override
		public TheaterDTO[] readAll() {
			return theaterDTOs;
		}
	
	}
