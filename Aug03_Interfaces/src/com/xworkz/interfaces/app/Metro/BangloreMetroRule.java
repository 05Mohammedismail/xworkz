package com.xworkz.interfaces.app.Metro;

public class BangloreMetroRule implements MetroRule{

	@Override
	public void getTicket() {
		System.out.println("Ticket Should be Taken To Travel In Metro");
	}

	@Override
	public void getPlatform() {
		System.out.println("Should wait at the dedicated platform");
	}

}
