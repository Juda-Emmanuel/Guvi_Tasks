package JAT_Task_5;

import java.util.Scanner;

public class Pattern_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your input : ");

		int input = sc.nextInt();

		int skip = 1;

		for (int i = 1; i <= input; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(skip + " ");
				skip++;
			}

			System.out.println();
		}

		sc.close();
	}
}
