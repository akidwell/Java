import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Addition Calculator App");

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
				sum(valueOne, valueTwo);
			} else if (function.equalsIgnoreCase("x"))
				product(valueOne, valueTwo);
			else if (function.equalsIgnoreCase("-")) {
				difference(valueOne, valueTwo);
			} else if (function.equalsIgnoreCase("/")) {
				quotient(valueOne, valueTwo);
			}

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}

		System.out.println("Bye");

	}

	public static void sum(double valueOne, double valueTwo) {
		double sum = valueOne + valueTwo;
		System.out.println("Sum: " + sum);
		return;

	}

	public static void product(double valueOne, double valueTwo) {
		double product = valueOne * valueTwo;
		System.out.println("Sum: " + product);
		return;
	}

	public static void difference(double valueOne, double valueTwo) {
		double difference = valueOne - valueTwo;
		System.out.println("difference: " + difference);
		return;

	}

	public static void quotient(double valueOne, double valueTwo) {
		double quotient = valueOne / valueTwo;
		System.out.println("difference: " + quotient);
		return;

	}
}
