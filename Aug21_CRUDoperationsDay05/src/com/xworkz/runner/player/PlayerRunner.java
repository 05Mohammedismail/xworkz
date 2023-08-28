package com.xworkz.runner.player;

import com.xworkz.dto.player.PlayerDTO;
import com.xworkz.repository.player.PlayerRepository;
import com.xworkz.repository.player.PlayerRepositoryImpl;
import com.xworkz.service.player.PlayerService;
import com.xworkz.service.player.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		
		PlayerDTO dto1 = new PlayerDTO("Dhoni", "Cricket");
		PlayerDTO dto2 = new PlayerDTO("Messi", "Football");
		PlayerDTO dto3 = new PlayerDTO("LeeChongWei", "Badminton");
		
		PlayerRepository playerRepository  = new PlayerRepositoryImpl();
		
		PlayerService playerService  = new PlayerServiceImpl(playerRepository);
		boolean result  = playerService.validate(dto1);

		if(result) {
			System.out.println("Data being saved is :" + result);
		}
		else {
			System.err.println("Data being saved is :" + result);
		}
		
		System.out.println("*****************************");
		result = playerService.validate(dto2);
		if(result) {
			System.out.println("Data being saved is :" + result);
		}
		else {
			System.err.println("Data being saved is :" + result);
		}
		
		System.out.println("*****************************");
		result = playerService.validate(dto3);
		if(result) {
			System.out.println("Data being saved is :" + result);
		}
		else {
			System.err.println("Data being saved is :" + result);
		}

		System.out.println("*****************************");
		playerService.findByName("dhoni");
		
		System.out.println("*****************************");
		playerService.findByNameAndSport("leechongwei", "badminton");
		
	}

}
