package ch03_prj1_TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double f = 0;
		double c = 0;

		// Welcome
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Welcome to the Temperature Converter App!");
		System.out.println();

		// user input
		System.out.println("Enter F Temp: ");
		double F = sc.nextDouble();
		double C = sc.nextDouble();
		
		//biz logic
		
		

		// display results?

		System.out.println("Continue? (y/n):");
		choice = sc.next();
		System.out.println();

	}

}
}