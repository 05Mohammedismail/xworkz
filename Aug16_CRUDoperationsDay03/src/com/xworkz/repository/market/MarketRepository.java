package com.xworkz.repository.market;

import com.xworkz.app.dto.MarketDTO;

public interface MarketRepository {
	
	int TOTAL_LIMIT = 5;
	
	public void save(MarketDTO dto);
	
	public MarketDTO findByNoOfShops(int num);
	
	public MarketDTO findByMarketType(String type);
	
	public MarketDTO findByAddress(String address);
	
	public MarketDTO[] readAll();

}
