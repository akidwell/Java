package ui;

import java.util.ArrayList;
import java.util.Scanner;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		int userNumber = Console.getIntWithinRange("Please enter a number between 1 and 5000: ", 0, 5001);
		ArrayList<Integer> factors = new ArrayList();
		  int i;
		  int flag=0;      
		  int m= userNumber/2;      
		  if(userNumber==1){  
		   System.out.println(userNumber+" is not prime number");      
		  }else{  
		   for(i=2; i<=m; i++){      
		    if(userNumber%i==0){      
		     System.out.println( userNumber +" is not prime number");      
		     flag=1;      
		     break;      
		    }      
     
		   if(flag==0)  {
			   System.out.println(userNumber+" is prime number"); }  
		   
		  }//end of else  
		  
			
		}
		choice = Console.getChoiceString("Try again?  " , "y", "n");	
		}
	
		
		System.out.println("Bye");
	}

}
