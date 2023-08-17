package com.xworkz.dto.app.repository.metroStaff;

import com.xworkz.dto.app.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{

	MetroStaffDTO[] metroStaffDTOs = new MetroStaffDTO[TOTAL_COUNT];
		
		int index = 0;
		
		@Override
		public void save(MetroStaffDTO dto) {
			if(this.index<TOTAL_COUNT) {
				this.metroStaffDTOs[index] = dto;
				System.out.println(dto);
				index++;
			}
			else {
				System.err.println("Index limit exceeded, Cannot store more data");
			}
		
		}
		
}
