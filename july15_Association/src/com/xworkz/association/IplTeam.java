package com.xworkz.association;

public class IplTeam {
	
	String name;
	String jerseyColor;
	int foreignPlayers;
	int iplTrophies;

			 Franchise fr1 = new Franchise("Chennai Super kings" , "India Cements"); //from Franchise class
			 Franchise fr2 = new Franchise("Royal Challenge" , "United Spirits Limited");

	public static void main(String[] args) {
		System.out.println("Running main in IplTeam");
			IplTeam team1 = new IplTeam("CSK" , "Yellow");
			IplTeam team2 = new IplTeam("RCB" , "Red");
			
			team1.setForeignPlayers(4);
			team2.setForeignPlayers(4);
			
			team1.iplTrophies = 5;
			team2.iplTrophies = 0;

			team1.printInfo();
			System.out.println("");
			team1.fr1.printInfo();
			
			
			System.out.println("* * * * * * * * * * * * * * *");
			
			team2.printInfo();		
			System.out.println("");
			team2.fr2.printInfo();

			

			
	}
	
	IplTeam(String name ,String jerseyColor){
		this.name = name;
		this.jerseyColor = jerseyColor;
	}
	
	void setForeignPlayers(int foreignPlayers) {
		this.foreignPlayers = foreignPlayers;
	}
	
	void printInfo() {
		System.out.println("Running print Info in TplTeam");
		System.out.println("Ipl team name : " + name);
		System.out.println("Jersey Color team : " + jerseyColor);
		System.out.println("No of Forein players in Ipl team : " + foreignPlayers);
		

	}

}
