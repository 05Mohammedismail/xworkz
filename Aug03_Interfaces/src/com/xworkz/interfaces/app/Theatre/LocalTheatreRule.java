package com.xworkz.interfaces.app.Theatre;

public class LocalTheatreRule  implements TheatreRule{

	@Override
	public void getTicket() {
		System.out.println("Ticket Should be Taken");
	}

	@Override
	public void getOnTime() {
		System.out.println("Should be there before movie Starts");
	}
	
	

}
