import java.util.Scanner;

public class NumberCheckerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Odd/Even Checker App");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		ConsoleNoStaticMethods c = new ConsoleNoStaticMethods();
		int i=0;
		i = c.getInt("Enter an Integer: ");
		System.out.println();
		
		boolean isEven;
		if ((i % 2) == 0)
		{isEven = true;
		    System.out.println("This number"+ " "+ i + " " + "is even");
		} else {isEven = false;
		    System.out.println("This number" + " "+ i + " " + "is odd");
		    System.out.println();
		}
		
		myConsole myconsole= new myConsole();
		myconsole.getString("Continue: y/n? ");
		System.out.println();
			
		}
		
		System.out.println("Bye");

	}

}
