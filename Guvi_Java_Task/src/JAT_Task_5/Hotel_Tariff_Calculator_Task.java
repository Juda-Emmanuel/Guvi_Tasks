package JAT_Task_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel_Tariff_Calculator_Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter the month of stay (1-12): ");
		int month = sc.nextInt();

		System.out.print("Enter the room rent per day: ");
		double roomRent = sc.nextDouble();

		System.out.print("Enter the number of days stayed in hotel: ");
		double days = sc.nextDouble();
	
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:

			roomRent *= 1.20;
			System.out.println("It's peak season! The room rent is increased by 20%.");
			break;
		default:
			System.out.println("Final room rent is ");
			break;
		}

		System.out.println( roomRent * days +"0");

		sc.close();
	}
}
