package JAT_Task_7;

import java.util.Scanner;

public class Exception_Handling_Task {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first number: ");
			int num1 = sc.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = sc.nextInt();

			int result = num1 / num2;

			System.out.println("The result of division is: " + result);

		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} finally {

			sc.close();
		}
	}

}
