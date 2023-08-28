package com.xworkz.repository.movie;

import com.xworkz.dto.movie.MovieDTO;

public interface MovieRepository {
	
	int TOTAL_COUNT = 5;
	public void save(MovieDTO dto);
	
	public  MovieDTO findByMovieName(String name);

	public  MovieDTO findByMovieNameAndTicketCost(String name, int TicketCost);


}
