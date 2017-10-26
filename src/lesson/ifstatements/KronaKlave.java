package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		// Users scanner input
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("Select Heads or Tails: ");
		String usersPick = usersGuess.nextLine().toLowerCase();
		
	//	System.out.println(usersPick);
		
		
		// Computers random selector.
		Random randomGenerator = new Random();
		boolean coinFlippValue = randomGenerator.nextBoolean();
		
		
	//	System.out.println(coinFlippValue);
		
		
		if (coinFlippValue == true) {
			System.out.println("Computer - Heads");
		} else {
			System.out.println("Computer - Tails");
		}
		
		
		if (coinFlippValue == true && usersPick.equals("heads") || coinFlippValue == false && usersPick.equals("tails")) {
			System.out.println("You won!");
		}  else {
			System.out.println("You lost!!!!");
		}
		
		
		
	}
}
