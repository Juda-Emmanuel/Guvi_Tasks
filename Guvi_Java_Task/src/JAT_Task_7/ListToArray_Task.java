package JAT_Task_7;

import java.util.ArrayList;
import java.util.List;

public class ListToArray_Task {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();


		list.add("Apple");
		list.add("Strawberry");
		list.add("Blueberry");
		list.add("Grapes");
		list.add("Papaya");

		String[] array = list.toArray(new String[0]);


		System.out.println("Elements in the array:");
		for (String element : array) {
			System.out.println(element);
		}
	}
}
