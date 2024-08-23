package javapackage;

import java.util.Scanner;

public class Voter_Eligiblity_Task {

	public static void main(String[] args) {

		int voterAge = 18;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter voters age : ");

		int inputAge = sc.nextInt();

		if (inputAge < voterAge) {

			System.out.println("Voter not eligible");
		}

		else if (inputAge >= voterAge && inputAge < 100) {

			System.out.println("Vote is eligible");
		}

		else {

			System.out.println("Invalid age");
		}
	}
}
