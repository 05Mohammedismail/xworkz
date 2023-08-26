package com.xworkz.repository.player;

import com.xworkz.dto.player.PlayerDTO;

public interface PlayerRepository {

int TOTAL_COUNT=5;
	
	public void save(PlayerDTO dto);

}
