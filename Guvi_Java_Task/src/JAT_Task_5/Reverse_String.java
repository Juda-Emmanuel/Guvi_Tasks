package JAT_Task_5;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your string input: ");
		String input = sc.nextLine();

		char[] characters = input.toCharArray();

		int left = 0, right = characters.length - 1;
		while (left < right) {
			char temp = characters[left];
			characters[left] = characters[right];
			characters[right] = temp;
			left++;
			right--;
		}

		String reversedString = new String(characters);

		System.out.println("Reversed string output is : " + reversedString);

		sc.close();
	}

}
