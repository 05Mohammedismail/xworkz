package com.xworkz.interfaces.app.Airport;

public class BangloreAirportRule implements AirportRule{

	@Override
	public void getTicket() {
		System.out.println("Ticket should be booked");
	}

	@Override
	public void getPassPort() {
		System.out.println("PassPort Should be Taken");
	}

}
