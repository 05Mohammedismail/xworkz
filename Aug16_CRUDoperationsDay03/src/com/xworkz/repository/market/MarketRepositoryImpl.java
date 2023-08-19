package com.xworkz.repository.market;

import com.xworkz.app.dto.MarketDTO;

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

	@Override
	public MarketDTO findByNoOfShops(int num) {
		for(int pos=0; pos<index; pos++) {
			if(marketDTOs[pos].getNumberOfShops() == num) {
				System.out.println("Match found at index:" + pos);
				return marketDTOs[pos];
			}
			System.out.println("Match not found at index: " + pos + " so Checking in next index");
		}
		System.err.println("Sorry match not found");
		return null;
	}

	@Override
	public MarketDTO findByMarketType(String type) {
		for(int pos=0; pos<index; pos++) 
		{
			if(marketDTOs[pos].getMarketType().equalsIgnoreCase(type)) {
				System.out.println("Match found at index:" + pos);
				return marketDTOs[pos];
			}
			System.out.println("Match not found at index:" + pos + " so Checking at next index");
		}
		System.err.println("Sorry match not found!!!");
		return null;
	}

	@Override
	public MarketDTO findByAddress(String address) {
		for(int pos=0; pos<index; pos++) {
			if(marketDTOs[pos].getAddress().equalsIgnoreCase(address)) {
				System.out.println("Match found at index:" + pos);
				return marketDTOs[pos];
			}
			System.out.println("Match not found at index " + pos + " so Checking at next index");
		}
		System.err.println("Sorry match not found!!!");
		return null;
	}

	@Override
	public MarketDTO[] readAll() {
		return marketDTOs;
	}


}
