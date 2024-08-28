package JAT_Task_5;

import java.util.Scanner;

public class Anna_University_Grading_System_Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your marks (0-100): ");
		int marks = sc.nextInt();

		String grade;
		switch (marks / 10) {
		case 10:
			grade = "S";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		case 4:
			grade = "F";
			break;
		default:
			grade = "Invalid Input";
			break;
		}

		System.out.println("Your grade is: " + grade);

		sc.close();
	}
}
