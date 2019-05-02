import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Calculator App");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter function. Choose: (+ or x or / or -): ");
			String function = sc.next();
			System.out.println();

			System.out.print("Enter value one: ");
			double valueOne = sc.nextInt();
			System.out.print("Enter value two: ");
			double valueTwo = sc.nextInt();
			System.out.println();

			if (function.equalsIgnoreCase("+")) {
				Function.sum(valueOne, valueTwo);
			} else if (function.equalsIgnoreCase("x"))
				Function.product(valueOne, valueTwo);
			else if (function.equalsIgnoreCase("-")) {
				Function.difference(valueOne, valueTwo);
			} else if (function.equalsIgnoreCase("/")) {
				Function.quotient(valueOne, valueTwo);
			}

			Console.getChoiceString("Continue? y or n:", "y", "n");
		}

		System.out.println("Bye");

	}

}
