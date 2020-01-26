package org.amalitech.While_Loop;

import java.util.Scanner;

public class WeekendAss {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String [] args) {
		welcome();
				
		
	} // end of main method


	// this method welcomes the User and introduces the users to the loop
	public static void welcome() {
		System.out.println("Welcome to Re-Echo.\n"
				+ "This program re-echos anything that you enter.\n\n"
				+ "Please enter your Name to begin");
		// Accepts name of the user
		String enterName = userInput.nextLine();
		
		System.out.printf("Welcome %s %n", enterName.toUpperCase());
		
		System.out.printf("%n%s, to enter Re-echo, enter \"Start\"%n", enterName.toUpperCase());
		
		re_run();
		
	}// end of welcome method
	
	
	public static void re_run() {
		boolean program_running_bool = true;
	
		String start_trigger = "start";
		String end_trigger = "end";
		
		String user_entry = userInput.nextLine();
		
		if (user_entry.equalsIgnoreCase(start_trigger)) {
			
			System.out.println(" You have entered Re-echo");
			System.out.println("Enter any thing and Re-echo will repeat it");
			System.out.println("# To end the program, type \"end\"");
			
				reset(program_running_bool, end_trigger);
			
		} // end of if condition
		else {
			
			if(user_entry.equalsIgnoreCase(end_trigger)) {
			
			System.out.println("You must begin before You can end%n");
			System.out.println("Enter \"Start\" to begin the program");
			re_run();
			
					} // end of if condition
			
			else {
				System.out.println("Your entry is invalid\n"
						+ "Enter \"start\" to enter into re-echo");
				re_run();
					}// end of else condition
			
			} // end of else condition
		
	} // end of re-run method


	public static void reset(boolean program_running_bool, String end_trigger) {
		
	//	String yes = "yes";
		//String no = "no";
		
		while  (program_running_bool == true) {
			String echo = userInput.nextLine();
			//System.out.println(echo);
							
			if(echo.equalsIgnoreCase(end_trigger)) {
				
				assurance(program_running_bool, end_trigger);
			
		} // end of if condition
			else {
				System.out.println(echo);
			}//end of else condition
			
} // end of while loop
	}


	public static void assurance(boolean program_running_bool, String end_trigger) {
		System.out.println("Are you sure you want to leave???"
				+ "\nType in \"yes\" if you want to leave "
				+ "and \"no\" if you dont want to");
		String yes = "yes";
		String no = "no";
		
		String certain = userInput.nextLine();
		
			if (certain.equalsIgnoreCase(no))
			{
				System.out.println("Hurray!!\n"
						+ "Enter anything and re-echo will repeat it");
				reset(program_running_bool, end_trigger);
			} //end of if condition
			
			else if (certain.equalsIgnoreCase(yes)) 
			{
				program_running_bool=false;
				System.out.println("We are sad that you are leaving\n\n"
						+ "Anyway, Good bye \n");
				System.exit(0);
			} // end of else if condition
			else 
			{
				System.out.println("You have made an invalid entry");
				assurance(program_running_bool, end_trigger);
			} // end of else condition
		
	}

} // end of WeekendAss class
