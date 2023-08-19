package com.xworkz.app.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
	
	private String name;
	private String mailId;
	private long phNumber;
	private String address;
	private double billTotal;
	
	public CustomerDTO() {
		System.out.println("invoking no-argument constructor");
	}

	public CustomerDTO(String name, String mailId, long phNumber, String address, double totalBill) {
		this.name = name;
		this.mailId = mailId;
		this.phNumber = phNumber;
		this.address = address;
		this.billTotal = totalBill;
	}

	public String getName() {
		return name;
	}

	public String getMailId() {
		return mailId;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public String getAddress() {
		return address;
	}

	public double getTotalBill() {
		return billTotal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTotalBill(double totalBill) {
		this.billTotal = totalBill;
	}

	@Override
	public String toString() {
		return "name=" + name + ", mailId=" + mailId + ", phNumber=" + phNumber + ", address=" + address
				+ ", totalBillAmount=" + billTotal;
	}
	
	
	
	

}
