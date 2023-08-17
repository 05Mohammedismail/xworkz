package com.xworkz.dto.app;

import java.io.Serializable;

public class TheaterDTO implements Serializable {
	
	private String theatreName;
	private String address;
	private String ownerName;
	private String movieName;
	private int ticketCost;
	
	public TheaterDTO() {

	}

	public TheaterDTO(String theatreName, String address, String ownerName, String movie, int ticketCost) {
		this.theatreName = theatreName;
		this.address = address;
		this.ownerName = ownerName;
		this.movieName = movie;
		this.ticketCost = ticketCost;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public String getAddress() {
		return address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getMovie() {
		return movieName;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setMovie(String movie) {
		this.movieName = movie;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "theatreName=" + theatreName + ", address=" + address + ", ownerName=" + ownerName + ", movieName=" + movieName
				+ ", ticketCost=" + ticketCost;
	}

	
	
}
