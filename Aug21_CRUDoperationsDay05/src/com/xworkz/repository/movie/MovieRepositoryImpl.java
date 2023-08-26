package com.xworkz.repository.movie;

import com.xworkz.dto.movie.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository{
	private  MovieDTO[] dtos = new MovieDTO[TOTAL_COUNT];
	private int index = 0;

	@Override
	public void save(MovieDTO dto) {
		if(this.index<TOTAL_COUNT) {
			this.dtos[index] = dto;
			System.out.println( dto+"Data is stored at index :" + index);
			this.index++;
		}
		else {
			System.err.println("Index limit exceeded, cannot save more");
		}
		
	}

}
