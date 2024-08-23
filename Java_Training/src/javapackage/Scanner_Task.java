package javapackage;

import java.util.Scanner;

public class Scanner_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your first number : ");
		int a = sc.nextInt();
		System.out.println("Please enter your Second number : ");
		int b = sc.nextInt();

		int add = a + b;
		int sub = a - b;
		int multiple = a * b;
		int divisible = a / b;

		System.out.println("Addition of your enter numbers are : " + add);
		System.out.println("Subtraction of your enter numbers are : " + sub);
		System.out.println("Multiple of your enter numbers are : " + multiple);
		System.out.println("Divisible of your enter numbers are : " + divisible);
	}
}
