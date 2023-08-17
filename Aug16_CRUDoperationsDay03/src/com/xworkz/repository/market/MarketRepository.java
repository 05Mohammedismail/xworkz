package com.xworkz.dto.app.repository.market;

import com.xworkz.dto.app.MarketDTO;

public interface MarketRepository {
	
	int TOTAL_LIMIT = 5;
	
	void save(MarketDTO dto);
	

}
