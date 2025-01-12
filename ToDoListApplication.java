package com.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApplication {

	public static void main(String[] args) {
		ArrayList<Task> tasks=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		
		System.out.println("**********Welcome to the To-Do List Application*************");
		
		while(!exit) {
			
			System.out.println("\n choose an option:");
			System.out.println("1.Add a new task");
			System.out.println("2.View All tasks");
			System.out.println("3.Mark a task as complete");
			System.out.println("4.Delete a task");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			
			if(!sc.hasNextInt()) {
				System.out.println("Error: Please enter a valid number");
				sc.next();
				continue;
			}
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the task description");
				String description=sc.nextLine();
				tasks.add(new Task(description));
				System.out.println("Task added successfully...");
				break;
				
			case 2:
				if(tasks.isEmpty()) {
					System.out.println("No tasks available.");
					
				}else {
					System.out.println("\n To-Do List:");
					for(int i=0;i<tasks.size();i++) {
						System.out.println((i+1)+"."+tasks.get(i));
						
						
					}
				}
				break;
				
			case 3:
				if(tasks.isEmpty()) {
					System.out.println("No tasks available to mark as complete.");
					
				}else {
					System.out.println("Enter the task number to mark as complete ");
					if(sc.hasNextInt()) {
						int taskNumber=sc.nextInt();
						if(taskNumber > 0 && taskNumber<=tasks.size()) {
							tasks.get(taskNumber-1).markAsComplete();
							System.out.println("Task marked as complete");
						}else {
							System.out.println("Error: Invalid task number");
						}
					}else {
						System.out.println("Error:Please enter a valid number.");
						sc.next();
					}
				}
				break;
			case 4:
				if(tasks.isEmpty()) {
					System.out.println("No tasks available to delete.");
					
				}else {
					System.out.println("Enter the task number to delete.");
					if(sc.hasNextInt()) {
						int taskNumber=sc.nextInt();
						if(taskNumber>0 && taskNumber<=tasks.size()) {
							tasks.remove(taskNumber-1);
							System.out.println("Task deleted successfully..");
							
						}else {
							System.out.println("Error:Invalid task Number.");
						}
						
					}else {
						System.out.println("Error: Please enter a valid number.");
						sc.next();
					}
				}
				break;
			case 5:
				exit =true;
				System.out.println("Exiting the To-Do List Application.GoodBye!");
				break;
			default:
				System.out.println("Error: Invalid choice.Please select a valid options");
			}
			
		}
		sc.close();
		

	}

}
