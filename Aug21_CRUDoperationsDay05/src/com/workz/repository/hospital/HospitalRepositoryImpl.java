package com.workz.repository.hospital;

import com.workz.dto.hospital.HospitalDTO;

public class HospitalRepositoryImpl  implements HospitalRepository{
	private HospitalDTO[] dtos = new HospitalDTO[TOTAL_COUNT];
	private int index = 0;
	
	@Override
	public void save(HospitalDTO dto) {
		if(index<TOTAL_COUNT) {
			this.dtos[index] = dto;
			System.out.println( dto+"Data is stored at index :" + index);
			this.index++;
		}
		else {
			System.err.println("Index limit exceeded, cannot save more " );
		}
		
	}

}