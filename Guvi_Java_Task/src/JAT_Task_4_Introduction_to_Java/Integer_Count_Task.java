package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Integer_Count_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your integar number : ");

		int input = sc.nextInt();

		if (input == 0) {

			System.out.println("Number of digits: 1");

		} else {

			int digitCount = 0;

			int tempNumber = Math.abs(input);

			while (tempNumber > 0) {

				tempNumber /= 10;

				digitCount++;
			}

			System.out.println("Number of digits: " + digitCount);
		}
	}
}
