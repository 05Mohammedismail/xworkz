package com.xworkz.service.movie;

import com.xworkz.dto.movie.MovieDTO;
import com.xworkz.repository.movie.MovieRepository;
import com.xworkz.repository.movie.MovieRepositoryImpl;
import com.xworkz.util.validate.ValidateUtil;

public class MovieServiceImpl implements MovieService{
	MovieRepository movieRepository = new MovieRepositoryImpl();

	@Override
	public boolean validate(MovieDTO dto) {

		if(dto!=null) {			
			System.out.println("Value is not null can save");
			String movieName = dto.getMovieName(); 
			String theaterName = dto.getTheaterName();
			double movieTicketCost = dto.getMovieTicketCost();
			double movieRating = dto.getMovieRating();
			
			if(ValidateUtil.validateString(movieName)) {
				System.out.println("Movie name '" + movieName + "'is a valid input");
			}
			else {
				System.err.println("Movie name '" + movieName + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateString(theaterName)) {
				System.out.println("Theater name '" + theaterName+ "'is a valid input");
			}
			else {
				System.err.println("Theater name '" + theaterName + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(movieTicketCost)) {
				System.out.println("Movie TicketCost '"+ movieTicketCost+ "'is a valid input");
			}
			else {
				System.err.println("Movie TicketCost  '"+ movieTicketCost + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(movieRating)) {
				System.out.println("MovieRating'" + movieRating+ "'is a valid input");
			}
			else {
				System.err.println("MovieRating'" + movieRating + "'is a invalid input");
				return false;
			}
			
			movieRepository.save(dto);
			return true;
		}
		System.err.println("Value is null, Cannot save");
		return false;
	}

	@Override
	public MovieDTO findByMovieName(String name) {
		if(ValidateUtil.validateString(name)) {
			System.out.println("Data is valid");
		MovieDTO isFound = movieRepository.findByMovieName(name);
			return isFound;
		}
		System.err.println("Data is invalid");
		return null;
	}

	@Override
	public MovieDTO findByMovieNameAndTicketCost(String name, int TicketCost) {
		if(ValidateUtil.validateString(name) && ValidateUtil.validateNumber(TicketCost)) {
			System.out.println("Data is valid");
			MovieDTO isFound = movieRepository.findByMovieNameAndTicketCost(name, TicketCost);
				return isFound;
			}
		System.err.println("Data is invalid");
			return null;
		}  
}
