import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Table of Powers App");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// user input
			System.out.println("Enter an Integer: ");
			int n = sc.nextInt();

			// Biz Logic
			for (int i = 1; i <= n; i++) {
				int squareValue = i * i;
				int cubeValue = i * i * i;

				// display results
				System.out.print(i+"\t");
				System.out.print("Squared: " + squareValue + "\t") ;
				System.out.println("Cubed:" + cubeValue);

			}

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}

		System.out.println("bye");

	}
}