package com.xworkz.dto.movie;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MovieDTO  implements Serializable{
	
	private String movieName;
	private String theaterName;
	private double movieTicketCost;
	private double movieRating;

}
