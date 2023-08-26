package com.xworkz.repository.movie;

import com.xworkz.dto.movie.MovieDTO;

public interface MovieRepository {
	
	int TOTAL_COUNT = 5;
	public void save(MovieDTO dto);

}
