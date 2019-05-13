import java.util.Scanner;

public class MakeChocolateApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Make Chocolate App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		System.out.print("Enter the goal weight of chocolate bars in a box: ");	
		int goal = sc.nextInt();
		int big = 5;
		int small = goal % big;
		
		if (small == 0) { System.out.println("-1 (no small bars needed)");
		} else { System.out.print("small bars = " + small+ ", ");
		System.out.print("big bars = " + big + ", ");
		System.out.println("goal = " + goal+ ". ");
		System.out.println("use " + small + " small chocolate bars");
		}
			
			
			
		System.out.print("Contine? y or n: ");	
		choice = sc.next();	
			
		}
		
		System.out.println("Goodbye");
		

	}

}
