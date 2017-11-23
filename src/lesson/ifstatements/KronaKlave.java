package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		// Users scanner input
		Scanner usersGuess = new Scanner(System.in);

		int wins = 0;
		int loss = 0;
		int draw = 0;

		int numberOfGames = 20;

		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));

			System.out.println("Select Heads or Tails: ");
			String usersPick = usersGuess.nextLine().toLowerCase();

			// Computers random selector.
			Random randomGenerator = new Random();
			boolean coinFlippValue = randomGenerator.nextBoolean();

			if (coinFlippValue == true) {
				System.out.println("Computer - Heads");
			} else {
				System.out.println("Computer - Tails");
			}

			if (coinFlippValue == true && usersPick.equals("heads")
					|| coinFlippValue == false && usersPick.equals("tails")) {
				System.out.println("You won!");
				wins++;
			} else {
				System.out.println("You lost!!!!");
				loss++;
			}
			System.out.println("Wins: " + wins);
			System.out.println("Loss: " + loss);

		}

	}
}
