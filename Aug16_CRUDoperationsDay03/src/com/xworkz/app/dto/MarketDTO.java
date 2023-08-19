package com.xworkz.app.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable{
	
	private String marketName;
	private String address;
	private String marketType;
	private int numberOfShops;
	private String marketTimings;
	
	public MarketDTO() {
	}

	public MarketDTO(String marketName, String address, String marketType, int numberOfShops, String marketTimings) {
		this.marketName = marketName;
		this.address = address;
		this.marketType = marketType;
		this.numberOfShops = numberOfShops;
		this.marketTimings = marketTimings;
	}

	public String getMarketName() {
		return marketName;
	}

	public String getAddress() {
		return address;
	}

	public String getMarketType() {
		return marketType;
	}

	public int getNumberOfShops() {
		return numberOfShops;
	}

	public String getMarketTimings() {
		return marketTimings;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public void setNumberOfShops(int numberOfShops) {
		this.numberOfShops = numberOfShops;
	}

	public void setMarketTimings(String marketTimings) {
		this.marketTimings = marketTimings;
	}

	@Override
	public String toString() {
		return "marketName=" + marketName + ", address=" + address + ", marketType=" + marketType + ", numberOfShops="
				+ numberOfShops + ", marketTimings=" + marketTimings;
	}
	
	
}
