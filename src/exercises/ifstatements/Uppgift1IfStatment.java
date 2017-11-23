package exercises.ifstatements;

import java.util.Scanner;

public class Uppgift1IfStatment {
	public static void main(String[] args) {
		/*1. Prompt the user for a number and print good if the number is between 8 & 10 or 
		 *    greater than 33. Otherwise, print bad. Use the || operator in your if statement.*/
		
		Scanner userScanner = new Scanner(System.in);
		int usersPick = userScanner.nextInt();
		
		if (usersPick > 8 && usersPick < 10 || usersPick > 33) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
		
	}
}
 