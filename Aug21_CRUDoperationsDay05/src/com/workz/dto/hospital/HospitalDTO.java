package com.workz.dto.hospital;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class HospitalDTO implements Serializable{
	
	private String hospitalName;
	private String hospitalAddress;
	private int noOfWards;
	private int noOfDoctors;

}
