import java.util.Scanner;

public class LetterGradeConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numericalGrade = 0;

		// Welcome
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to the Letter Grade Converter App");

			// user input
			System.out.println("Enter Numerical Grade: ");
			numericalGrade = sc.nextInt();

			// biz logic
			if (numericalGrade >= 80 & numericalGrade <= 100) {
				System.out.println("Letter grade: A");
			} else if (numericalGrade >= 70 & numericalGrade <= 79) {
				System.out.println("Letter grade: B");
			} else if (numericalGrade >= 60 & numericalGrade <= 69) {
				System.out.println("Letter grade: C");
			} else if (numericalGrade >= 50 & numericalGrade <= 59) {
				System.out.println("Letter grade: D");
			} else if (numericalGrade >= 40 & numericalGrade <= 49) {
				System.out.println("Letter grade: E");
			} else if (numericalGrade >= 0 & numericalGrade <= 39) {
				System.out.println("Letter grade: F");
			}

			// display results?

			System.out.println("Continue? (y/n):");
			choice = sc.next();
			System.out.println();
		}

		// bye
		System.out.println("Bye!");
		
		sc.close();

	}
}