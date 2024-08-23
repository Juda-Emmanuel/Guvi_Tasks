package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Senior_Citizen_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the age : ");

		int age = sc.nextInt();

		if (age >= 65) {

			System.out.println("The person is Senior Citizen");
		}

		else {

			System.out.println("The person is not a Senior Citizen");
		}
	}
}
