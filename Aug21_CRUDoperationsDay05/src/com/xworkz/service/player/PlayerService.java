package com.xworkz.service.player;

import com.xworkz.dto.player.PlayerDTO;

public interface PlayerService {
	
	public boolean validate(PlayerDTO dto);
	
	public PlayerDTO findByName(String name);
	
	public PlayerDTO findByNameAndSport(String name, String SportName);



}
