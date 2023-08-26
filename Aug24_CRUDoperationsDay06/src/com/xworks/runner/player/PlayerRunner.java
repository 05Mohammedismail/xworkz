package com.xworks.runner.player;

import com.xworks.dto.player.PlayerDTO;
import com.xworks.repository.player.PlayerRepository;
import com.xworks.repository.player.PlayerRepositoryImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto1 = new PlayerDTO("Dhoni", 43, "Indian");
		PlayerDTO dto2 = new PlayerDTO("Kohli", 36, "Indian");
		PlayerDTO dto3 = new PlayerDTO("Dhoni", 43, "Indian");
		PlayerDTO dto4 = new PlayerDTO("Raina", 34, "Indian");
		PlayerDTO dto5 = new PlayerDTO("Yuvraj", 38, "Indian");
		PlayerDTO dto6 = new PlayerDTO("Jadeja", 36, "Indian");
		PlayerDTO dto7 = new PlayerDTO("KL Rahul", 33, "Indian");

		PlayerRepository playerRepository = new PlayerRepositoryImpl();
		boolean exist = playerRepository.isExist(dto1);
		if(!exist) {
			playerRepository.save(dto1);
		}
		
		System.out.println("**********************************");
		
		exist = playerRepository.isExist(dto2);
		if(!exist) {
			playerRepository.save(dto2);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto3);
		if(!exist) {
			playerRepository.save(dto3);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto4);
		if(!exist) {
			playerRepository.save(dto4);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto5);
		if(!exist) {
			playerRepository.save(dto5);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto6);
		if(!exist) {
			playerRepository.save(dto6);
		}
		
		System.out.println("**********************************");

		exist = playerRepository.isExist(dto7);
		if(!exist) {
			playerRepository.save(dto7);
		}

	}

}
