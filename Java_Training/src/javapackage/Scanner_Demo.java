package javapackage;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your input number : ");

		int a = sc.nextInt();

		System.out.println("Entered number is : " + a);

	}
}
