package com.xworkz.dto.player;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDTO implements Serializable{
	
	private String name;
	private int age;
	private String nationality;
	

}
