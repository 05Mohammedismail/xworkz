package com.xworkz.countries.app;

public interface CountryRepository {

	 int MAX_LIMIT = 10;
	 
	 void save(String name);
	 
	 boolean isExist(String name);
	 
	 String returnUpperCase(String name);
	 
	 String[] findStartsWith(String name);
	 
	 String[] findEndsWith(String name);
	
   	void orderAscending();
	
	void orderDescending();

	int savedCount(String[] arr);
 		 
		 
	 
	
}
