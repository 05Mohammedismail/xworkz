package com.xworkz.repository.metroStaff;

import com.xworkz.app.dto.MetroStaffDTO;

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

		@Override
		public MetroStaffDTO findByMetroStationName(String name) {
			for(int pos=0; pos<index; pos++) {
				if(metroStaffDTOs[pos].getMetroStationName().equalsIgnoreCase(name)) {
					System.out.println("Match found at index: "+ pos);
					return metroStaffDTOs[pos];
				}
				System.out.println("Match not found at index : " + pos + " so Checking at next index");
			}
			System.out.println("Sorry match not found!!!");
			return null;
		}

		@Override
		public MetroStaffDTO findByNumberOfEmployees(int num) {
			for(int pos=0; pos<index; pos++) {
				if(metroStaffDTOs[pos].getTotalNoOfEmployees() == num){
					System.out.println("Match found at index: " + pos );
					return metroStaffDTOs[pos];
				}
				System.out.println("Match not found at index : " + pos + " so Checking at next index");
			}
			System.out.println("Sorry match not found!!!");
			return null;
		}

		@Override
		public MetroStaffDTO[] readAll() {
			
			return metroStaffDTOs;
		}
		
}
