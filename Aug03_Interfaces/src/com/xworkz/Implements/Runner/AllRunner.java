package com.xworkz.Implements.Runner;

import com.xworkz.interfaces.app.Airport.AirportRule;
import com.xworkz.interfaces.app.Airport.BangloreAirportRule;
import com.xworkz.interfaces.app.Army.GeneralArmyRule;
import com.xworkz.interfaces.app.Bank.SBIBankRule;
import com.xworkz.interfaces.app.Company.SoftwareCompanyRule;
import com.xworkz.interfaces.app.Home.MyHomeRule;
import com.xworkz.interfaces.app.Hospital.CityHospitalRule;
import com.xworkz.interfaces.app.Hostel.CollegeHostelRule;
import com.xworkz.interfaces.app.Hostel.HostelRule;
import com.xworkz.interfaces.app.Hotel.NonVegHotelRule;
import com.xworkz.interfaces.app.Metro.*;
import com.xworkz.interfaces.app.Metro.MetroRule;
import com.xworkz.interfaces.app.Pub.HighfyPubRule;
import com.xworkz.interfaces.app.Saloon.DesiSaloonRule;
import com.xworkz.interfaces.app.Theatre.LocalTheatreRule;
import com.xworkz.interfaces.app.VTU.CollegeVTURule;


public class AllRunner {

	public static void main(String[] args) {
		
		System.out.println("**ArmyRule**");
		GeneralArmyRule generalArmyRule = new GeneralArmyRule();
		generalArmyRule.getHairCut();
		generalArmyRule.getUniform();
		System.out.println("Wake Up At :"+generalArmyRule.WAKE_UP_AT);
		
		System.out.println("******************************");
		
		System.out.println("**SaloonRule**");
		DesiSaloonRule desiSaloonRule = new DesiSaloonRule();
		desiSaloonRule.waitForYourTurn();
		desiSaloonRule.dontMove();
		System.out.println("Price is :"+desiSaloonRule.PRICE);
		
		System.out.println("******************************");
		
		System.out.println("**HostelRule**");
		HostelRule hostelRule = new CollegeHostelRule();
		System.out.println("Hostel Name is :"+hostelRule.HOSTEL_NAME);
		hostelRule.closingTime();
		hostelRule.getFee();
		
		System.out.println("*******************************");
		
		System.out.println("**Hospital Rule**");
		CityHospitalRule cityHospitalRule = new CityHospitalRule();
		System.out.println("Hospital Open Time is :"+cityHospitalRule.OPEN_TIME);
		cityHospitalRule.getMask();
		cityHospitalRule.getMedicine();
		
		System.out.println("*******************************");
		
		System.out.println("**Metro Rules**");
		BangloreMetroRule bangloreMetroRule = new BangloreMetroRule();
		MetroRule.getStation();
		bangloreMetroRule.getTicket();
		bangloreMetroRule.getPlatform();
		
		System.out.println("********************************");
		
		System.out.println("**Hotel Rule**");
		NonVegHotelRule nonVegHotelRule = new NonVegHotelRule();
		System.out.println("Hotel Type is :"+NonVegHotelRule.HOTEL_TYPE);
		nonVegHotelRule.getFood();
		nonVegHotelRule.payBill();
		
		System.out.println("*********************************");
		
		System.out.println("**Airport Rule**");
		BangloreAirportRule bangloreAirportRule = new BangloreAirportRule();
		System.out.println("Airport Loction is :"+AirportRule.LOCATION);
		bangloreAirportRule.getPassPort();
		bangloreAirportRule.getTicket();
		
		System.out.println("*********************************");
		
		System.out.println("**Theatre Rule**");
		
		LocalTheatreRule localTheatreRule = new LocalTheatreRule();
		System.out.println("Movie name is :"+LocalTheatreRule.MOVIE_NAME);
		localTheatreRule.getOnTime();
		localTheatreRule.getTicket();
		
		System.out.println("*********************************");
		
		System.out.println("**Home Rule**");
		MyHomeRule myHomeRule = new MyHomeRule();
		System.out.println("Rule Maker is :"+MyHomeRule.RULE_MAKER);
		myHomeRule.getHomeBefore();
		myHomeRule.dontUseBadWords();
		
		System.out.println("**********************************");
		
		System.out.println("**Company Rule**");
		SoftwareCompanyRule softwareCompanyRule = new SoftwareCompanyRule();
		System.out.println("Work Start Time is :"+SoftwareCompanyRule.WORK_START_TIME);
		softwareCompanyRule.getEmployeId();
		softwareCompanyRule.getFormal();
		
		System.out.println("**********************************");
		
		System.out.println("**Pub Rule**");
		HighfyPubRule highfyPubRule = new HighfyPubRule();
		System.out.println("Pub opens at :"+HighfyPubRule.OPEN_TIME);
		highfyPubRule.getPartner();
		highfyPubRule.dontFight();
		
		System.out.println("**********************************");
		
		System.out.println("**VTU Rule**");
		CollegeVTURule collegeVTURule = new CollegeVTURule();
		System.out.println("University name :"+CollegeVTURule.UNIVERSITY_NAME);
		collegeVTURule.getExamFee();
		collegeVTURule.getPass();
		
		System.out.println("***********************************");
		
		System.out.println("**Bank Rule**");
		SBIBankRule sbiBankRule = new SBIBankRule();
		System.out.println("Bank Name :"+SBIBankRule.BANK_NAME);
		sbiBankRule.getPassbook();
		sbiBankRule.getWait();
		
	}
	
}
			
			



