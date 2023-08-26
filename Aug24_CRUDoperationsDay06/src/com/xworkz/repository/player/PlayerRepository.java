package com.xworkz.repository.player;

import com.xworkz.dto.player.PlayerDTO;

public interface PlayerRepository {
	
	int MAX_LIMIT = 5;
	
	public void save(PlayerDTO dto);
	
	public default boolean isExist(PlayerDTO dto ) {
		return false;
	}

	

}
