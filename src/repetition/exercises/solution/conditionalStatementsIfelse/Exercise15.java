package repetition.exercises.solution.conditionalStatementsIfelse;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		int i, n, sum = 0;

		System.out.print("Input number of terms is: ");
		{
			Scanner scanner = new Scanner(System.in);
			n = scanner.nextInt();
			System.out.println("\nThe odd numbers are :");
			for (i = 1; i <= n; i++)

			{
				System.out.println(2 * i - 1);
				sum += 2 * i - 1;
			}
			System.out.println("The Sum of odd Natural Number upto " + n + " terms is: " + sum);

		}
	}
}