package com.xworkz.abstraction.app.waterPurifier;

public class Usama {
	
	private WaterPurifier purifier;

	public Usama(WaterPurifier purifier) {
		this.purifier = purifier;
	}
	
	public void getPurify() {
		if(purifier!=null) {
			System.out.println("Purify is not null");
			this.purifier.purify();
		}
		else {
			System.err.println("Purify is null, cannot purify");
		}
	}
	
	

}
