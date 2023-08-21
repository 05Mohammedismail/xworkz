package com.workz.repository.movie;

import com.workz.dto.movie.MovieDTO;

public interface MovieRepository {
	
	int TOTAL_COUNT = 5;
	public void save(MovieDTO dto);

}
