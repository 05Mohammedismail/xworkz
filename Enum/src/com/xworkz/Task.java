package com.xworkz;

public class Task {
	
	String taskName;
	String submitDate;
	TaskGivenBy givenBy;
	String taskStatus;
	
	public static void main(String[] args) {
		System.out.println("Running main in Task");
		
		Task ref1 = new Task("Java", "July14" ,TaskGivenBy.Om_sir);
		 Task ref2 = new Task("Sql", "July15" , TaskGivenBy.Sunil_sir);

		ref1.setTaskStatus("Completed");
		 ref2.setTaskStatus("Completed");

		
		 ref1.display();
		 System.out.println("");
		 ref2.display();
	}
	
	Task(String taskName ,String submitDate , TaskGivenBy givenBy){
		this.taskName = taskName;
		this.submitDate = submitDate;
		this.givenBy = givenBy;
	}
	
	void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	void display() {
		System.out.println("Task Subject name is :" + taskName);
		System.out.println("Task givenBY is :" + this.givenBy);
		System.out.println("Task submitDate is :" + submitDate);
		System.out.println("Task status is :" + taskStatus);

	}
	
	

}
