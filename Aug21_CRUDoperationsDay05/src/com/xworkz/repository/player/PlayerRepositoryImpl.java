package com.xworkz.repository.player;

import com.xworkz.dto.player.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository {
	
	private PlayerDTO[] dtos = new PlayerDTO[TOTAL_COUNT];
	private int index = 0;
	
	@Override
	public void save(PlayerDTO dto) {
		if(index<TOTAL_COUNT) {
			this.dtos[index] = dto;
			System.out.println( dto+"Data is stored at index :" + index);
			this.index++;
		}
		else {
			System.err.println("Index limit exceeded, cannot save more " );
		}
		
	}


}
