package exercises.ifstatements;

import java.util.Scanner;

/**
 * 01. Prompt the user for a number and print good if the number is between 8 & 10 or 
 *
 *    greater than 33. Otherwise, print bad. Use the || operator in your if statement.
 */  
public class Uppgift1 {

	public static void main(String[] args) {
		
		// Används för att skanna av det som användaren skriver. Samt gör så att användaren kan skriva.
		Scanner userScanner = new Scanner(System.in);
		
		// En fråga till användaren.
		System.out.println("Skriv in ett nummer: ");
		
		// Tar in input från användaren om användaren har skrivit ett heltal.7
		// Sparar som ett heltal.
		int userNumber =  userScanner.nextInt();
		
		// Kollar om usernumber är större än 8 och samtigt mindre än 10 eller större än 33.
		if (userNumber > 8 && userNumber < 10 || userNumber > 33) {
			// Skriver ut bra till användaren 
			System.out.println("Good");
		} else {
			// Skriver ut dåligt till användaren.
			System.out.println("Bad");
		}
		

	}

}
