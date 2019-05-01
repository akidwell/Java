import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();

		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll the dice? y/n");
		String choice = sc.next();
		
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {

			// logic

			int dieOne = rollDie();
			System.out.println("Die One:" + dieOne);
			int dieTwo = rollDie();
			System.out.println("Die Two:" + dieTwo);
			int total = dieOne + dieTwo;
			if (total == 12) {
				System.out.println("You got boxcars!");
			}
			if (total == 2) {
				System.out.println("You got snakeeyes!");
			}
			System.out.println("Total:" + total);
			System.out.println();

			System.out.print("Roll again? (y/n): ");
			choice = sc.next();
			System.out.println();

		}

		System.out.println("Bye!");
	}
	
	private static int rollDie() {
//		return (int) (Math.random() * 6) + 1;
		int die = (int) (Math.random() * 6) + 1;
		return die;
	}
	
}
