package com.workz.service.movie;

import com.workz.dto.movie.MovieDTO;
import com.workz.repository.movie.MovieRepository;
import com.workz.repository.movie.MovieRepositoryImpl;
import com.workz.util.validate.ValidateUtil;

public class MovieServiceImpl implements MovieService{

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
			
			MovieRepository movieRepository = new MovieRepositoryImpl();
			movieRepository.save(dto);
			return true;
		}
		System.err.println("Value is null, Cannot save");
		return false;
	}

}
