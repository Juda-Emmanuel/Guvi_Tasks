package JAT_Task_7;

import java.util.Scanner;

public class Age_Validation_Task {

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above to proceed.");
		} else {
			System.out.println("Age is valid. You are eligible.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			validateAge(age);

		} catch (InvalidAgeException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {

			sc.close();
		}
	}
}
