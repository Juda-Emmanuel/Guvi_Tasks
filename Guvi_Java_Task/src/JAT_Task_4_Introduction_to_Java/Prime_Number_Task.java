package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Prime_Number_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();

		boolean isPrime = true;

		if (input <= 1) {
			isPrime = false; // 0 and 1 are not prime numbers
		} else {
			for (int i = 2; i <= Math.sqrt(input); i++) {
				if (input % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(input + " is a prime number.");
		} else {
			System.out.println(input + " is not a prime number.");
		}
	}
}
