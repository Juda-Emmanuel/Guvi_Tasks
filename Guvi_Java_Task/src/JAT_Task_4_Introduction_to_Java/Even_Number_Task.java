package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Even_Number_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your value :");

		int inputValue = sc.nextInt();

		if (inputValue % 2 == 0) {

			System.out.println("Even number");
		}

		else {

			System.out.println("Not an Even number");
		}
	}
}
