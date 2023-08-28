package com.xworkz.runner.movie;

import com.xworkz.dto.movie.MovieDTO;
import com.xworkz.service.movie.MovieService;
import com.xworkz.service.movie.MovieServiceImpl;

public class MovieRunner {

	public static void main(String[] args) {
		
		MovieDTO dto1 = new MovieDTO("KGF", "Malliakrjun", 150, 9.1);
		
		MovieDTO dto2 = new MovieDTO("Pushpa", "Bharath Cenemas", 200, 8.5);
		
		MovieService movieService = new MovieServiceImpl();
	
		boolean result1 = movieService.validate(dto1);
		if(result1) {
			System.out.println("Data being saved is :" + result1);
		}
		else {
			System.err.println("Data being saved is :" + result1);
		}
		
		System.out.println("********************************");
		
		
		boolean result2 = movieService.validate(dto2);
		if(result2) {
			System.out.println("Data being saved is :" + result2);
		}
		else {
			System.err.println("Data being saved is :" + result2);
		}
		
		System.out.println("****************************");
		movieService.findByMovieName("kgfo");
		
		System.out.println("*******************************");
		movieService.findByMovieNameAndTicketCost("pushpa", 200);
	}
}
