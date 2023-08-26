package com.xworkz.service.player;

import com.xworkz.dto.player.PlayerDTO;
import com.xworkz.repository.player.PlayerRepository;
import com.xworkz.util.validate.ValidateUtil;

public class PlayerServiceImpl implements PlayerService {
	
	private PlayerRepository playerRepository;
	
	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	@Override
	public boolean validate(PlayerDTO dto) {
		if(dto!=null) {
			System.out.println("Value is not null can save");
			String name = dto.getName();
			String sportName = dto.getSportName();
			
				
			if(ValidateUtil.validateString(name)) {
				System.out.println("Player name '" + name + "'is a valid input");
			}
			else {
				System.err.println("Player name '" + name + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateString(sportName)) {
				System.out.println("Player Sport Name'" + sportName + "'is a valid input");
			}
			else {
				System.err.println("Player Sport Name'" + sportName + "'is a invalid input");
				return false;
			}
			
		
			playerRepository.save(dto);
			return true;
		}
		else {
			System.err.println("value is null cannot save");
		}
		return false;
	}


}
