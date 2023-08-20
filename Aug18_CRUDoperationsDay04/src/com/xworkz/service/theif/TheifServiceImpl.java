package com.xworkz.service.theif;

import com.xworkz.app.dto.TheifDTO;

public class TheifServiceImpl implements TheifService {
	
	
	@Override
	public void saveAndValidate(TheifDTO dto) {
							if(dto!=null) {
								 String specializedIn = dto.getSpecializedIn();
								 double experience = dto.getExperience();
								 double age = dto.getAge();
								 String gangName = dto.getGangName();
								 int totalCases = dto.getTotalCases();
								
								 if(specializedIn!=null && !specializedIn.isEmpty() && specializedIn.length()>3 && specializedIn.length()<100) {
									System.out.println("Specialized In is : '" + specializedIn + "' it is valid input");
								}
								else {
									System.err.println("Specialized In is :'" + specializedIn + "' it is invalid input");
								}
								
								if(experience>0 && experience<150) {
									System.out.println("experience is :'" + experience + "' it is valid input");
								}
								else {
									System.err.println("experience is :'" + experience + "' it is invalid input");
								}
								
								if(age>0 && age<150) {
									System.out.println("age is :'" + age + "' it is valid input");
								}
								else {
									System.err.println("Age is :'" + age + "' it is valid input");
								}
								
								if(gangName!=null && !gangName.isEmpty() && gangName.length()>3 && gangName.length()<100) {
									System.out.println("gang name is :'" + gangName + "' it is valid input");
								}
								else {
									System.err.println("gang name is :'" + gangName + "' it is invalid input");
								}
								
								if(totalCases>0 && totalCases<150) {
									System.out.println("total cases is :'" + totalCases + "' it is valid input");
								}
								else {
									System.err.println("total cases is :'" + totalCases + "' it is invalid input");
								}
							}

	}
}
	
		

		
	


