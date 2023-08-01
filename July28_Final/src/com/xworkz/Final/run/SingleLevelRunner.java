package com.xworkz.Final.run;

import com.xworkz.Final.app.single.Player;

public class SingleLevelRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Single Level Runner\n");
		
		Player player = new Player("Ismail", 22, "Manoj", "male");
		player.printInfo();
	}

}
