import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("The Tip Calculator App\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Cost of Meal: ");
			double mealCost = sc.nextDouble();
			System.out.println();

			for (double i = .15; i < .30; i += .05) {
				NumberFormat c = NumberFormat.getCurrencyInstance();
				NumberFormat p = NumberFormat.getPercentInstance();

				System.out.println(p.format(i));
				double tipAmt = (i * mealCost);
				System.out.println("Tip Amount: " + c.format(tipAmt));
				double totalAmt = (tipAmt + mealCost);
				System.out.println("Total Amount: " + c.format(totalAmt));
				System.out.println();
			}
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("bye");
	}
}