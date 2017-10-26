/**
 * 
 * 1. Prompt the user for a number and print good if the number is between 8 & 10 or 
 *    greater than 33. Otherwise, print bad. Use the || operator in your if statement.
 *  
 * 2. Write Java program to allow the user to input his/her age. Then the program will show 
 *    if the person is eligible to vote. A person who is eligible to vote must be older than 
 *    or equal to 18 years old.
 * 
 *    Output:
 *      Enter your age: 18
 *      You are eligible to vote.
 * 
 * 3. Write a Java program to determine whether an input number is an even number.
 * Represent it with code:
 * 
 * 4. A programmer is going to the grocery store and his wife tells him, 
 *    "Buy a gallon of milk, and if there are eggs, buy a dozen." 
 *    So the programmer goes, buys everything, and drives back to his house. 
 *    Upon arrival, his wife angrily asks him, "Why did you get 13 gallons of milk?" 
 *    The programmer says, "There were eggs!".
 *    Represent it with code:
 *
 * 5. Write a program to determine the cost of an automobile insurance premium, 
 *    based on driver's age and the number of accidents that the driver has had.
 * 
 *    The basic insurance charge is $500. There is a surcharge of $100 if the driver is 
 *    under 25 and an additional surcharge for accidents:
 *    # of accidents               	Accident Surcharge
 *          1                              	50
 *          2                               125
 *          3                               225
 *          4                               375
 *          5                               575
 *          6                        or more No insurance
 *
 *
 * 6. Skapa en räknare som beräknar hur många timmar minuter och sekunder som en löpare 
 *    springer.
 *    - Börja med att fråga om en starttid
 *    - Fråga om en sluttid 
 *    - Skriv sedan ut hur mång timmar, minuter och sekunder som löparen har sprungit.
 *    # Men vad händer om löparen börjar springa vid klockan 23:59?
 *  
 * 7. *Prompt the user for two words. If they are the same, print Great - the same. 
 *    If they are the same except for the case, print Okay - almost the same. 
 *    If they are the same length, print At least the same length. 
 *    You will need the following string functions.
 * 
 * 8. Write a Java program which reads a year (integer) from the user and decides 
 *    whether that year is a leap year. A year is a leap year (and so contains a February 29) 
 *    if it is divisible by 4. But if the year is also divisible by 100 then it is not a 
 *    leap year, unless it is divisible by 400. This means that years such as 1992, 1996 are 
 *    leap years because they are divisible by 4 and are not affected by the rest of the rule 
 *    which applies to century years such as 1900 and 2000. Century years are not leap years 
 *    except where they are a multiple of 400. Hence, the years 1700, 1800 and 1900 were not 
 *    leap years and did not contain a February 29. But the year 2000 was a leap year, the 
 *    first such century leap year since 1600.
 */
package exercises.ifstatements;

import java.util.Random;

/**
 * @author jonas.andree
 *
 */
public class IfStatements {
	
	public static void main (String[] args) {
		/*
		 * 1. Prompt the user for a number and print good if the number is between 8 & 10 or 
		 *    greater than 33. Otherwise, print bad. Use the || operator in your if statement.
		 */
		Random randomGeneretator = new Random();
		int computer = 0;
		int user = 0;
		int user2 = 0;
		
		for (int i = 0; i < 1000000; i++) {
			int userPick = randomGeneretator.nextInt(13);
			int userPick2 = randomGeneretator.nextInt(13);
			int computerPick = randomGeneretator.nextInt(13);
			
			System.out.println("User 1 = " + userPick);
			System.out.println("User 2 = " + userPick2);
			System.out.println("Computer = " + computerPick);
			
			
			if ( userPick == computerPick && userPick2 == computerPick) {
				System.out.println("Draw!");
			} else if (userPick > computerPick && userPick > userPick2) {
				System.out.println("User1 win!");
				user = user + 2;
			} else if (userPick2 > computerPick && userPick2 > userPick) {
				System.out.println("User2 win!");
				user2 = user2 + 2;
			} else if (computerPick > userPick && computerPick > userPick2) {
				System.out.println("Computer win!");
				computer = computer + 2;
			} else if (computerPick == userPick && computerPick > userPick2) {
				computer++;
				userPick++;
			} else if (computerPick == userPick2 && computerPick > userPick) {
				computer++;
				userPick2++;
			} else if (userPick == userPick2 && computerPick < userPick) {
				userPick++;
				userPick2++;
			} else {
				System.out.println("Wird!");
			}
		}

		System.out.println();
		if (computer > user && computer > user2) {
			System.out.println("Computer = " + computer);
			if (user > user2) {
				System.out.println("User1 = " + user);
				System.out.println("User2 = " + user2);		
			} else {
				System.out.println("User2 = " + user2);
				System.out.println("User1 = " + user);
			}
		} else if (user > computer && user > user2) {
			System.out.println("User1 = " + user);
			if(computer > user2) {
				System.out.println("Computer = " + computer);
				System.out.println("User2 = " + user2);		
			} else {
				System.out.println("User2 = " + user2);		
				System.out.println("Computer = " + computer);
			}
		} else if (user2 > computer && user2 > user) {
			System.out.println("User2 = " + user2);
			if (computer > user) {
				System.out.println("Computer = " + computer);
				System.out.println("User1 = " + user);				
			} else {
				System.out.println("User1 = " + user);
				System.out.println("Computer = " + computer);
			}
		}
	}
}
