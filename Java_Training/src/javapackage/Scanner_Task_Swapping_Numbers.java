package javapackage;

import java.util.Scanner;

public class Scanner_Task_Swapping_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number : ");
		int a = sc.nextInt();
		System.out.println("Enter your Second number : ");
		int b = sc.nextInt();

		int swap = a;
		a = b;
		b = swap;

		System.err.println("Before Swapping");
		System.out.println("Your first number entered is : " + a);
		System.out.println("Your second number entered is : " + b);

		System.out.println("After Swapping");
		System.out.println("Your first swapped number is : " + a);
		System.out.println("Your Second swapped number is : " + b);

	}
}
