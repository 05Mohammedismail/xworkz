package com.workz.service.hospital;

import com.workz.dto.hospital.HospitalDTO;
import com.workz.repository.hospital.HospitalRepository;
import com.workz.repository.hospital.HospitalRepositoryImpl;
import com.workz.util.validate.ValidateUtil;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validate(HospitalDTO dto) {
		if(dto!=null) {
			System.out.println("Value is not null can save");
			String name = dto.getHospitalName();
			String address = dto.getHospitalAddress();
			int noOfWards = dto.getNoOfWards();
			int noOFDoctors = dto.getNoOfDoctors();
				
			if(ValidateUtil.validateString(name)) {
				System.out.println("Hospital name '" + name + "'is a valid input");
			}
			else {
				System.err.println("Hospital name '" + name + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateString(address)) {
				System.out.println("Hospital address '" + address + "'is a valid input");
			}
			else {
				System.err.println("Hospital address'" + address + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(noOfWards)) {
				System.out.println("Hospital noOfWards '" + noOfWards + "'is a valid input");
			}
			else {
				System.err.println("Hospital noOfWards '" + noOfWards + "'is a invalid input");
				return false;
			}
			
			if(ValidateUtil.validateNumber(noOFDoctors)) {
				System.out.println("Hospital noOFDoctors '" + noOFDoctors+ "'is a valid input");
			}
			else {
				System.err.println("Hospital noOFDoctors'" + noOFDoctors+ "'is a invalid input");
				return false;
			}
			HospitalRepository hospitalRepository  = new  HospitalRepositoryImpl();
			hospitalRepository.save(dto);
			return true;
		}
		else {
			System.err.println("value is null cannot save");
		}
		return false;
	}

}
