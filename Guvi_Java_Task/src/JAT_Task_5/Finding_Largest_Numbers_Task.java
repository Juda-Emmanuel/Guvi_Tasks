package JAT_Task_5;

import java.util.Scanner;

public class Finding_Largest_Numbers_Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the 2nd number: ");
		int num2 = sc.nextInt();

		System.out.print("Enter the 3rd number: ");
		int num3 = sc.nextInt();

		int largest = num1;
		if (num2 > largest) {
			largest = num2;
		}

		if (num3 > largest) {
			largest = num3;
		}

		System.out.println("The largest number is: " + largest);

		sc.close();
	}
}
