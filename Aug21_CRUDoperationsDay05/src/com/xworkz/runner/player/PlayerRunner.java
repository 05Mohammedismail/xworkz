package com.xworkz.runner.player;

import com.xworkz.dto.player.PlayerDTO;
import com.xworkz.repository.player.PlayerRepository;
import com.xworkz.repository.player.PlayerRepositoryImpl;
import com.xworkz.service.player.PlayerService;
import com.xworkz.service.player.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		
		PlayerDTO dto = new PlayerDTO("Dhoni", "Cricket");
		
		PlayerRepository playerRepository  = new PlayerRepositoryImpl();
		
		PlayerService playerService  = new PlayerServiceImpl(playerRepository);
		boolean result  = playerService.validate(dto);

		if(result) {
			System.out.println("Data being saved is :" + result);
			
		}
		else {
			System.err.println("Data being saved is :" + result);
		}
	}

}
