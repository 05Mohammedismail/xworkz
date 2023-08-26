package com.xworkz.countries.implementations;

import com.xworkz.countries.app.CountryRepository;

public class CountryRepositoryImplementation  implements CountryRepository{
	
	String[] allNames = new String[MAX_LIMIT];

	private int num = 0;
	
	private int start = 0;
	
	@Override
	public void save(String name) {
		
		if(num<MAX_LIMIT) {
			allNames[num] = name;
			System.out.println("Name at index: "+ num + " is: " + allNames[num] );
			num++;
		}
		else {
			System.err.println("Index Limit exceeded, Cannot store anymore");
		}
	}


	@Override
	public boolean isExist(String name) {
		for (int index = 0; index < allNames.length; index++) {
			if(allNames[index].equalsIgnoreCase(name)) {
				System.out.println("Name checked is: " + name);
				return true;
			}
			else {
			}
		}
		return false;
	}


	@Override
	public String returnUpperCase(String name) {

		if(isExist(name)) {
			System.out.println("Name found ");
			String caseChange = name.toUpperCase();
			return "Upper Case of given name " + name + " is: " + caseChange;
		}
		else {
			System.out.println("Given name: " +"'"+ name +"'"+" not found");
			return "so cannot be changed to upper case";
		}
		
	}


	
	@Override
	public String[] findStartsWith(String name) {
		String[] values = new String[MAX_LIMIT];
		for(int index=0; index<MAX_LIMIT; index++) {
			String subString = allNames[index];
			if(subString.startsWith(name)) {
				values[start] = subString;
				System.out.println("Country name Starting with "+ name + " is " + values[start]);
				start++;
			}
		}
		return values;
	}


	@Override
	public String[] findEndsWith(String name) {
		String[] values = new String[MAX_LIMIT];
		for(int index=0; index<MAX_LIMIT; index++) {
			String subString = allNames[index];
			if(subString.endsWith(name)) {
				values[start] = subString;
				System.out.println("Country name Ending with "+ name + " is " + values[start]);
				start++;
			}
		}
		return values;
	}
	
	@Override
	public void orderAscending() {
		for(int first=0; first<MAX_LIMIT; first++) {
			for(int second=first+1; second<MAX_LIMIT; second++) {
				if(allNames[first].compareTo(allNames[second]) > 0) {
					String temp = allNames[first];
					allNames[first] = allNames[second];
					allNames[second] = temp;
					
				}
			}
			System.out.println(allNames[first]);
		}
	}


	@Override
	public void orderDescending() {
			for(int first=0; first<MAX_LIMIT; first++) {
				for(int second=first+1; second<MAX_LIMIT; second++) {
					if(allNames[first].compareTo(allNames[second]) < 0) {
						String temp = allNames[first];
						allNames[first] = allNames[second];
						allNames[second] = temp;
						
					}
				}
				System.out.println(allNames[first]);
			}
		}

	@Override
	public int savedCount(String[] arr) {
		  int count = 0;
		 String[] store = new String[MAX_LIMIT];
	        for (int index = 0; index < arr.length; index++) {
	            if (arr[index] != null) {
	            	store[count] = arr[index];
	                count++;
	            }
	        }
	        System.out.println("Number of elements stored is : " + count);
	  return 0;

		
	

	}

}

	


	


	
	