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

	@Override
	public MovieDTO findByMovieName(String name) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getMovieName().equalsIgnoreCase(name)) {
				System.out.println("Movie name found at index " + pos);
				System.out.println("Data is " + dtos[pos]);
				return dtos[pos];
			}
			System.out.println("Data not found at index " + pos + " checking the next index");
		}
		System.err.println("Data not found");
		return null;
	}

	@Override
	public MovieDTO findByMovieNameAndTicketCost(String name, int TicketCost) {
		for(int pos=0; pos<index; pos++) {
			if(dtos[pos].getMovieName().equalsIgnoreCase(name) && dtos[pos].getMovieTicketCost() == TicketCost) {
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
