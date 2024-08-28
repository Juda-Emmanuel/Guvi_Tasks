package JAT_Task_5;

import java.util.Scanner;

public class Palindrome_Task {

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {

			while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}

			if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your string input: ");
		String input = sc.nextLine();

		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		sc.close();
	}
}
