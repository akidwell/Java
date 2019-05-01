import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Factorial Calculator App");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		//userinput
			
		System.out.print("Enter and integer that's greater than 0 and less than 20: ");
		int n=sc.nextInt();
		
			
		//biz logic
		long fact = 1;
		for (int i = 1; i <= n; i++) {
		fact = fact * i;
		}
     
			
		//display
		System.out.println("The factorial of: " + n + " is " + fact);
		
		
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

	}
		
		System.out.println("bye");

}
}