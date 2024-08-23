package javapackage;

import java.util.Scanner;

public class Switch_Case_Grade_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your Grade : ");

		char inputGrade = sc.nextLine().charAt(0);

		switch (inputGrade) {

		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Well Done");
			break;
		case 'C':
			System.out.println("Passed");
			break;
		case 'D':
			System.out.println("Better Try Again");
			break;

		default:
			System.out.println("Invalid Grade");
		}

	}
}
