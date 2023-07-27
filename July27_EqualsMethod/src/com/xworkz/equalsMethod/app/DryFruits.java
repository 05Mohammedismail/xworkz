package com.xworkz.equalsMethod.app;

public class DryFruits {
	
	private String dryFruitName;
	private String shopName;
	private String shopType;
	private double price;
	private double quantity;
	private double discount;
	
	
	public DryFruits(String dryFruitName, String shopName, String shopType, double price, double quantity,
			double discount) {
		this.dryFruitName = dryFruitName;
		this.shopName = shopName;
		this.shopType = shopType;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	
	public String getDryFruitName() {
		return dryFruitName;
	}
	public void setDryFruitName(String dryFruitName) {
		this.dryFruitName = dryFruitName;
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "dryFruitName=" + dryFruitName + "\n" + "shopName=" + shopName + "\n" + "shopType=" + shopType
				+ "\n" + "price in Rs=" + price + "\n" + "quantity in gms=" + quantity + "\n" + 
				"discount=" + discount;
	}
	
	
		@Override
		public boolean equals(Object obj) 
		{
			if(obj!= null)
			{
				System.out.println("Object not null checked");
				if(obj instanceof DryFruits) {
					System.out.println("Objects type matched");
					DryFruits casted = (DryFruits)obj;
					if(this.discount == casted.discount && this.dryFruitName == casted.dryFruitName &&
							this.price == casted.price && this.quantity == casted.quantity && 
							this.shopName == casted.shopName) {
						
						System.out.println("Both objects are same");
						return true;
					}
					else 
					{
						System.err.println("Both objects are not same");
					}
				}	
				else {
					System.err.println("Objects type not matched");
				}
			}
			else 
			{
				System.err.println("Object is null cant compare");
				
			}
			return false;
		}	

}
