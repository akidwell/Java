package ui;

import java.util.Arrays;
import java.util.Scanner;

import business.Student;
import util.Console;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the student scores application");
		Scanner sc = new Scanner(System.in);
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int numberOfStudents = Console.getInt("Enter Number of Students: ", 0, 501);
			Student[] students = new Student[numberOfStudents];

			int i = 0;
			for (i = 0; i < numberOfStudents; i++) {
				Student s = new Student();
				System.out.println("STUDENT " + (i + 1));
				System.out.print("enter first name: ");
				s.setFirstName(sc.next());
				System.out.print("Enter last name: ");
				s.setLastName(sc.next());
				System.out.print("Enter score: ");
				s.setScore(sc.next());
				System.out.println();
				students[i] = s;
			}

			System.out.println("SUMMARY");
			Arrays.sort(students);
			for (Student s : students)
				System.out.println(s);

			choice = Console.getChoiceString("Continue? (y or n)", "y", "n");
		}

		{
			System.out.println("goodbye");

		}

	}
}
