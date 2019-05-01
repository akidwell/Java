import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("************************************");
		System.out.println("I'm thinking of a number from 1 to 100");
		System.out.println("Try to guess it");

		Scanner sc = new Scanner(System.in);
		int count = 1;
		String choice = "Y";
		while (choice.equalsIgnoreCase("y")) {
			
			
			
			
			

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			sc.nextLine();
		}
		System.out.println("Bye- Come back soon");

	}

}
