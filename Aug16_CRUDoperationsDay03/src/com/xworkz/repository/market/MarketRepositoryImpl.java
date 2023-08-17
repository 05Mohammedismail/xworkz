package com.xworkz.dto.app.repository.market;

import com.xworkz.dto.app.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository{
	

	MarketDTO[] marketDTOs = new MarketDTO[TOTAL_LIMIT];
	
	int index = 0;
	
	@Override
	public void save(MarketDTO dto) {
		if(this.index<TOTAL_LIMIT) {
			this.marketDTOs[index] = dto;
			System.out.println(dto);
			index++;
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more data");
		}
		
	}


}
