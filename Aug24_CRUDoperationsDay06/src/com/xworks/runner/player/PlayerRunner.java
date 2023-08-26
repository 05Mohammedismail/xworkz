package com.xworks.runner.player;

import com.xworks.dto.player.PlayerDTO;
import com.xworks.repository.player.PlayerRepository;
import com.xworks.repository.player.PlayerRepositoryImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto1 = new PlayerDTO("Dhoni", 43, "Indian");
		PlayerDTO dto2 = new PlayerDTO("Kohli", 36, "Indian");
		PlayerDTO dto3 = new PlayerDTO("Dhoni", 43, "Indian");
		
		PlayerRepository playerRepository = new PlayerRepositoryImpl();
		boolean exist = playerRepository.isExist(dto1);
		if(!exist) {
			playerRepository.save(dto1);
			System.out.println("Player saved is: " + dto1);
		}
		
		System.out.println("**********************************");
		
		exist = playerRepository.isExist(dto2);
		if(!exist) {
			playerRepository.save(dto2);
			System.out.println("Player saved is: " + dto2);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto3);
		if(!exist) {
			playerRepository.save(dto3);
			System.out.println("Player saved is: " + dto3);
		}

	}

}
