package changeCalculator;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Welcome to the Change Calculator App");
		System.out.println();
		
		System.out.print("Enter Change amount:");
		int cents = sc.nextInt();
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents/10;
		cents %= 10;
		
		int nickels= cents/5;
		int pennies = cents % 5;
		
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies" + pennies);
		
		System.out.println();
		System.out.print("Continue? y or n: ");
		choice = sc.next();
		
		}
		
		System.out.println("good bye");
		
	}

}
 