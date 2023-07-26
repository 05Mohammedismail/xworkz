package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) 
	{
		System.out.println("Running main in News Paper Runner");
		
		NewsPaper newsPaper = new NewsPaper();
		
		System.out.println(newsPaper);
		
		newsPaper.setNewsPaper("Indian Express", "Indian Express ltd", "Viveck Goenka", 4.5, 3);
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println(newsPaper);
	}

}
