package com.xworkz.marketRunner;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {

	public static void main(String[] args) {

		SuperMarket sMarket = new SuperMarket();
		sMarket.sell(); //In Market its package default in SMarket we overrides it to public
		//sMarket.buy(); //It is not visible because its protected in Parent class
		
		OnlineMarket online = new OnlineMarket();
		//online.sell(); // since sell() is package default we can't access it outside the package
		online.buy();  // since buy() is protected we are changing its visibility to public by overriding it in a subclass
	}

}
