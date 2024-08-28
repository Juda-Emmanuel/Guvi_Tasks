package JAT_Task_5;

import java.util.Scanner;

public class Star_Pattern_Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter your number of the pattern: ");
		int shape = sc.nextInt();

		for (int i = 0; i < shape; i++) {
			for (int j = 0; j < shape; j++) {
				if (j == i || j == shape - i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
