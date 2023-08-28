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

	@Override
	public PlayerDTO findByName(String name) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getName().equalsIgnoreCase(name)) {
				System.out.println("Data matched at index " + pos);
				System.out.println("Data is " + dtos[pos]);
				return dtos[pos];
			}
			System.out.println("Data not found at index " + pos + " checking the next index");
		}
		System.err.println("Data not found");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSport(String name, String SportName) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getName().equalsIgnoreCase(name) && dtos[pos].getSportName().equalsIgnoreCase(SportName)) {
				System.out.println("Data matched at index " + pos);
				System.out.println("Data is " + dtos[pos]);
				return dtos[pos];
			}
			System.out.println("Data not found at index " + pos + " checking the next index");
		}
		System.err.println("Data not found");
		return null;
	}


}
