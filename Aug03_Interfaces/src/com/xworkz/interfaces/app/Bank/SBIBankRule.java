package com.xworkz.interfaces.app.Bank;

public class SBIBankRule implements BankRule {

	@Override
	public void getPassbook() {
		System.out.println("Should brink Pass Book to Bank");
	}

	@Override
	public void getWait() {
		System.out.println("Should wait in queue to get your Turn");
	}

}
