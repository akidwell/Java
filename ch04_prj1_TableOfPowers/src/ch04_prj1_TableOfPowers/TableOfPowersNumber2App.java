package ch04_prj1_TableOfPowers;

import java.util.Scanner;

public class TableOfPowersNumber2App {

	public static void main(String[] args) {

		System.out.println("Welcome to Updated Squares/Cubes Table");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// user input
			System.out.print("Enter an Integer: ");
			int n = sc.nextInt();
			System.out.println();

			// biz logic

			for (int i = 1; i <= n; i++) {
				int squareValue = i * i;
				int cubeValue = i * i * i;

				// display results

				System.out.print("Number:" + i + "\t");
				System.out.print("Squared:" + squareValue + "\t");
				System.out.println("Cubed: " + cubeValue + "\t");
				System.out.println();
			}
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

		System.out.println("Bye!");
	}
}
