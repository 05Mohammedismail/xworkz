package com.xworks.repository.player;

import com.xworks.dto.player.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository {
	
	PlayerDTO[] dtos  = new PlayerDTO[MAX_LIMIT];
	int index = 0;

	@Override
	public void save(PlayerDTO dto) {
	if(index<MAX_LIMIT) {
		dtos[index] = dto;
		System.out.println("Data saved at index  " + index + "  is " + dto);
		index++;
	}
	else {
		System.err.println("Index limit reached, cannot save more");
	}
	
	}
	
	@Override
	public boolean isExist(PlayerDTO dto) {
		for(int pos=0; pos<dtos.length; pos++) {
			PlayerDTO temp = dtos[pos];
			if(temp!=null  ) {
				System.out.println("Checking if the data is already exists at index :" + pos );
				if(temp.getName().equals(dto.getName()) && temp.getAge() == dto.getAge() && temp.getNationality().equals(dto.getNationality())) {
					System.err.println("Data already exists, cannot save");
					return true;
				}
			}
		}
		System.out.println("Data doesn't exists, can save");
		return false;
	}

}
