package com.xworkz.service.movie;

import com.xworkz.dto.movie.MovieDTO;

public interface MovieService {
	
	public boolean validate(MovieDTO dto);
	
	public  MovieDTO findByMovieName(String name);

	public  MovieDTO findByMovieNameAndTicketCost(String name, int TicketCost);

}
