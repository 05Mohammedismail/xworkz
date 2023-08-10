package com.xworkz.repository.app.Olympic;

public interface OlympicRepository {

	int TOTAL = 5;
	
	void save(int year, String country);
	
	void display();
}
