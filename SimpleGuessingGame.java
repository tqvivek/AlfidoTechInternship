package com.task3;

import java.util.Random;
import java.util.Scanner;

public class SimpleGuessingGame {

	public static void main(String[] args) {
		System.out.println("********Welcome to the Simple Number Guessing Game!!***********");
		System.out.println("I have selected a number between 1 to 100.Try to guess it!");
		
		
		Random random=new Random();
		int rNumber=random.nextInt(100)+1;
		int attempts=0;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your guess (1-100):-");
			int userGuess;
			
			try {
				userGuess=Integer.parseInt(sc.nextLine());
				
			}catch(NumberFormatException e) {
				System.out.println("Invalid Input! Please enter a number between 1 and 100");
				continue;
			}
			attempts++;
			
			if(userGuess<1 || userGuess>100) {
				System.out.println("Please guess a number between 1 and 100");
				continue;
			}
			
			if(userGuess<rNumber) {
				System.out.println("Too low! Try again");
				
			}else if(userGuess>rNumber) {
				System.out.println("Too High! Try again.");
				
			}else {
				
				System.out.println("Congratulations! You've guessed the number " + rNumber +
                        " correctly.");
				System.out.println("Total attempts: " + attempts);
				break;
			}
		}
		sc.close();

	}

}
