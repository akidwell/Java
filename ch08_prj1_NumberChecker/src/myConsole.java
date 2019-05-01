import java.util.Scanner;
public class myConsole extends ConsoleNoStaticMethods {
Scanner sc = new Scanner(System.in);
	@Override
	public String getString(String prompt) {
		String s = "";
		 boolean isValid = false;
		while (!isValid) {
	            System.out.print(prompt);
	            s = sc.nextLine();
	            if (!s.isEmpty()) {
	                isValid = true;
	            } else {
	                System.out.println("Error! This entry is required.");
	          }
		}
	return s;
		
	}

	
	
}
	
