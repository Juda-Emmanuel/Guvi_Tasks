package JAT_Task_4_Introduction_to_Java;

import java.util.Scanner;

public class Swapping_Numbers_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first number : ");

		int a = sc.nextInt();

		System.out.println("Please enter your second number : ");

		int b = sc.nextInt();

		System.err.println("Output before Swapping : - ");
		System.out.println("Your first number is : " + a);
		System.out.println("Your second number is : " + b);

		int swap = a;
		a = b;
		b = swap;

		System.out.println("======================");
		System.out.println("Output after Swapping : - ");
		System.out.println("Your first number is : " + a);
		System.out.println("Your second number is : " + b);

	}
}
