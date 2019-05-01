import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rectangle Calculator App");
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double length = getDouble(sc, "Enter Length: ");
			double width = getDouble(sc, "Enter Width: ");
			
			double area = width * length;
			System.out.println("Area: " + area);
			double perimeter = 2 * width + 2 * length;
			System.out.println("Perimeter: " + perimeter);		
			
			choice = askToContinue(sc);

		}

		System.out.println("Bye");

	}

	public static double getDouble (Scanner sc, String Prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(Prompt);
			if (sc.hasNextDouble()) 
			{d = sc.nextDouble();
			isValid = true;
			} else {
			System.out.println("error invalid number. try again.");
			}
			sc.nextLine();
		}
		return d;
	}
				
	  public static String askToContinue(Scanner sc) {
	    	 System.out.print("Continue? (y/n): ");
	         String choice = sc.next();
	         sc.nextLine();  
	         System.out.println();
	         return choice;	
			
			
	  }
			
		}
			
		
		
	
	
	


