import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Registration");
		System.out.println();
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		
		//Prompt User input/variables
		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		System.out.print("Enter Last Name:  ");
		String lastName = sc.next();
		System.out.print("Enter 4-digit birth year:   ");
		int birthYear = sc.nextInt();
		
		System.out.println();
		
		//biz logic?
		
	
		
		//display results
		System.out.println("Welcome " + " " + firstName + " " + lastName);
		System.out.println("Your Registration is Complete");
		System.out.println("Your temp password is: " + lastName + "*" + birthYear);
		
		
		//bye
		System.out.println();
		System.out.println("Bye");


}
}
