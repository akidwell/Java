package ch03_prj1_TemperatureConverter;

import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	

		// Welcome
		System.out.println("Welcome to the Temperature Converter App!");
		System.out.println();
		
		//loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// user input
		System.out.print("Enter F Temp: ");
		double F = sc.nextDouble();
		
		//biz logic
		
		double C = ( (F-32) * 5/9 );
		

		// display results?
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		
		System.out.println("Degree in Celsius:"+number.format(C));
		System.out.println();

		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();

	}
		
		System.out.println("bye");

}
}