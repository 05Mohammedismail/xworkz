package com.xworks.repository.player;

import com.xworks.dto.player.PlayerDTO;

public interface PlayerRepository {
	
	int MAX_LIMIT = 5;
	
	public void save(PlayerDTO dto);
	
	public default boolean isExist(PlayerDTO dto ) {
		return false;
	}

	

}
