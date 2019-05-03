package ui;

import java.text.NumberFormat;
import java.util.Scanner;

import util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		Scanner sc= new Scanner(System.in);
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		int timesAtBat = Console.getIntWithinRange("Enter Number of times at bat: ", 0, 31);
		System.out.println();
			
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home");
		System.out.println();
		
		
		double [] resultForAtBat = new double[timesAtBat];	
		double nbrOverZero=0;
		double basesEarned=0;
		for (int i = 0; i < timesAtBat; i++) {
			resultForAtBat[i] = Console.getInt("Result for at-bat" + (i+1) + ": ", -1, 5);
			if (resultForAtBat[i] > 0 ) {
				nbrOverZero++;
			}
				basesEarned+=resultForAtBat[i];
			
				
		}
		double battingAvg= nbrOverZero / timesAtBat;
		System.out.println("Batting Average: " + battingAvg);
		System.out.println();
		double sluggingPercent= basesEarned / timesAtBat;
		System.out.println("Slugging Percent: " + sluggingPercent);
		System.out.println();
		
		choice = Console.getChoiceString("Another Player? y/n", "y", "n");
		}
	
		System.out.println("Goodbye");
	}


}
