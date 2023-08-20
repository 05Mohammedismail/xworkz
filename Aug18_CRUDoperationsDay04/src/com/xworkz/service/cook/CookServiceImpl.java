package com.xworkz.service.cook;

import com.xworkz.app.dto.CookDTO;

public class CookServiceImpl implements CookService{

	@Override
	public void saveAndValidate(CookDTO dto) {
		if(dto!=null) {
			String specialItem = dto.getSpecialItem();
			String hotelName = dto.getHotelName();
			String gender = dto.getGender();
			double salary = dto.getSalary();
		
			if(specialItem!=null && !specialItem.isEmpty() && specialItem.length()>3 && specialItem.length()<100) {
				System.out.println("Specialization is :'" + specialItem + "' it is valid");
			}
			else {
				System.err.println("Specialization is :'" + specialItem + "' it is invalid");
			}
			
			if(hotelName!=null && !hotelName.isEmpty() && hotelName.length()>3 && hotelName.length()<100) {
				System.out.println("Hotel name is :'" + hotelName + "' it is valid");
			}
			else {
				System.err.println("Hotel name is :'" + hotelName + "' it is invalid");
			}
			if(gender!=null && !gender.isEmpty() && gender.length()>3 && gender.length()<100) {
				System.out.println("Gender is :'" + gender + "' it is valid");
			}
			else {
				System.err.println("Gender is :'" + gender+ "' it is invalid");
			}
			
			if(salary>0) {
				System.out.println("Salary is:'" + salary + "'it is valid");
			}
			else {
				System.err.println("Salary is:'" + salary + "'it is invalid");
			}
		
		}
		else {
			System.err.println("Input is null");
		}
		
	}

}
