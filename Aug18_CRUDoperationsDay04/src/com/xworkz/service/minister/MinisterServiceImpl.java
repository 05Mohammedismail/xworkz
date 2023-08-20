package com.xworkz.service.minister;

import com.xworkz.app.dto.MinisterDTO;

public class MinisterServiceImpl  implements MinisterService
{

	@Override
	public void saveAndValidate(MinisterDTO dto) {
		if(dto!=null) {
			 String name = dto.getName();
			 double experience = dto.getExperience();
			 String designation = dto.getDesignation();
			 String partyName = dto.getPartyName();
			
			 if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<100) {
					System.out.println("Minister Name is :'" + name + "' it is valid");
				}
				else {
					System.err.println("Minister Name is :'" + name + "' it is invalid");
				}
			 
			 if(experience>0) {
				 System.out.println("Experience is :'" + experience + "' it is valid" );
			 }
			 else {
				 System.err.println("Experience is :'" + experience + "' it is invalid" );
			 }
			 
			 if(designation!=null && !designation.isEmpty() && designation.length()>1 && designation.length()<100) {
					System.out.println("Designation is :'" + designation + "' it is valid");
				}
				else {
					System.err.println("Designation is :'" + designation + "' it is invalid");
				}
			 
			 if(partyName!=null && !partyName.isEmpty() && partyName.length()>1 && partyName.length()<100) {
					System.out.println("Party Name is :'" + partyName + "' it is valid");
				}
				else {
					System.err.println("Party Name is :'" + partyName + "' it is invalid");
				}
		}
		else {
			System.err.println("Input is null");
		}
		
	} 

}
