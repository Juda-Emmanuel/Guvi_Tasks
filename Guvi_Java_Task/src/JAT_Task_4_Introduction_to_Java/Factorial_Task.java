package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Factorial_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your input : ");

		int input = sc.nextInt();

		int factorial = 1;

		for (int i = 1; i <= input; i++) {

			factorial *= i;
		}

		System.out.println("Factorial of " + input+"!" + " = " + factorial);
	}
}
