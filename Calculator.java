package com.task1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    boolean exit=false;
	    
	    System.out.println("WELCOME TO THE CALCULATOR APPLICATION!");
	    
	    while(!exit) {
	    	
	    	System.out.println("Enter the first number");
	    	if(!sc.hasNextDouble()) {
	    		System.out.println("Error:Invalid Input.Please enter valid number");
	    		sc.next();
	    		continue;
	    	}
	    	double n1=sc.nextDouble();
	    	System.out.println("Enter an operator (+,-,*,/):");
	    	char operator=sc.next().charAt(0);
	    	
	    	
	    	System.out.println("Enter the second number:");
	    	if(!sc.hasNextDouble()) {
	    		System.out.println("Error: Invalid input.Please enter valid number");
	    		sc.next();
	    		continue;
	    		
	    	}
	    	double n2=sc.nextDouble();
	    	
	    	double result=0;
	    	boolean validOperation =true;
	    	
	    	switch(operator){
	    	
	    	case '+':
	    		result=n1 + n2;
	    		break;
	    		
	    	case '-':
	    		result=n1-n2;
	    		break;
	    		
	    	case '*':
	    		result=n1*n2;
	    		break;
	    		
	    	case '/':
	    		if(n2 !=0) {
	    			result=n1/n2;
	    		}else {
	    			System.out.println("Error: Division by zero is not allowed");
	    			validOperation=false;
	    			
	    		}
	    		break;
	    	default:	
	    		System.out.println("Error: Invalid operator");
	    		validOperation=false;
	    	
	    	
	    	}
	    	if(validOperation) {
	    		System.out.println("Result:"+result);
	    	}
	    	System.out.println("Do you want to perform another operation?");
	    	String choice=sc.next().toLowerCase();
	    	
	    	if(choice.equals("no")) {
	    		exit=true;
	    		
	    		System.out.println("Exiting the Calculator Application.GoodBye!");
	    		
	    	}
	    	
	    }
	    
	    sc.close();
		

	}

}
