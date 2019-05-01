package ui;

import java.text.NumberFormat;
import java.util.Scanner;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Account Balance App");
		System.out.println();

		SavingsAccount sa = new SavingsAccount(1000, .01);
		CheckingAccount ca = new CheckingAccount(1000, 1);
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("Starting Balances");
		printBalances(sa, ca, cf);
		System.out.println("\nEnter the Transactions for the Month: \n");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String transType = Console.getChoiceString(sc, "Withdraw or Deposit?", "w", "d");
			String accountType = Console.getChoiceString(sc, "Checking or Savings? c/s", "c", "s");
			double amt = Console.getDouble("Amount", 0, Double.POSITIVE_INFINITY);

			Account a;
			if (accountType.equalsIgnoreCase("c")) {
				a = ca;
			} else {
				a = sa;
			}
			if (transType.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			} else {
				a.deposit(amt);
			}

			choice = Console.getChoiceString(sc, "Continue?", "y", "n");

		}
		ca.subtractMonthlyFee();
		sa.applyMonthlyPayment();
		System.out.println("Monthly Payment and Fees:");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.println("savings int payment:" + cf.format(sa.getMonthlyIntPayment()));

		{
			System.out.println("Final Balances:");
			printBalances(sa, ca, cf);
			System.out.println();
		}

		System.out.println("Goodbye");
	}

	private static void printBalances(SavingsAccount sa, CheckingAccount ca, NumberFormat cf) {
		System.out.println("Checking;" + cf.format(ca.getBalance()));
		System.out.println("Savings:" + cf.format(sa.getBalance()));
	}

}
