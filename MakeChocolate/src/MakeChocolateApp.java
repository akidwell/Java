public class MakeChocolateApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Make Chocolate App");

			System.out.println(makeChocolate(4,1,7));

		System.out.println("Goodbye");

	}

	public static int makeChocolate(int small, int big, int goal) {
		if ((small + big * 5) < goal) { 
			return(-1); 
		} else if ((big*5) > goal) {
			return goal % 5;
		} else {
		    return goal - big * 5; 
		}
	}
}
