package JAT_Task_7;

import java.util.ArrayList;

public class ArrayList_Task {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();

		words.add("Apple");
		words.add("Orange");
		words.add("Mango");
		words.add("Pineapple");
		words.add("Strawberry");

		System.out.println("ArrayList before clearing: " + words);

		words.clear();

		System.out.println("ArrayList after clearing: " + words);
	}
}
