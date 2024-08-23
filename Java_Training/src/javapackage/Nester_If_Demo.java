package javapackage;

import java.util.Scanner;

public class Nester_If_Demo {

	public static void main(String[] args) {

		int age = 18;
		int weight = 50;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the Donor's age :");

		int inputAge = sc.nextInt();

		System.out.println("Please enter the Donor's weight :");

		int inputWeight = sc.nextInt();

		if (inputAge > age) {

			if (inputWeight > weight)

				System.out.println("Donor is eligible for Blood Donation");

			else {

				System.out.println("Donor is not eligible for Blood Donation");
			}
		}

		else {

			System.out.println("Age must be greater than (18) and Weight must be greater than (50)");
		}
	}
}
