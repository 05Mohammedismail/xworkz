package com.xworkz.Final.run;

import com.xworkz.Final.app.hierarchy.Daughter;
import com.xworkz.Final.app.hierarchy.Parent;
import com.xworkz.Final.app.hierarchy.Son;

public class HierarchyRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Hierarchy Runner\n");
		
		Parent son = new Son("Raju", 8966422315l, "Chotu", 20);
		HierarchyRunner.show(son);
		
		System.out.println("* * * * * * * * * * * * * * * * * *");
		
		Parent daughter = new Daughter("Raju", 8966422315l, "Chutki", 15);
		HierarchyRunner.show(daughter);

	}


	public static void show(Parent parent){
		if(parent!= null) {
			
			if(parent instanceof Son) {
				Son son = (Son)parent;
				son.printInfo();
				}
			
			 if(parent instanceof Daughter) {
				Daughter daughter = (Daughter)parent;
				daughter.printInfo();
			}
		}
		else {
		System.err.println("Object is null please provide a valid value");
		}
	
	}
	
}
