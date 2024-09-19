package JAT_Task_7;

public class Array_Index_String_Index_Out_Of_Bound_Of_Exception {

	public static void main(String[] args) {
		try {

			int[] numbers = { 1, 2, 3 };

			System.out.println("Accessing element at index 3: " + numbers[3]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error: Array index is out of bounds.");
		}

		try {
			String text = "Hello";

			System.out.println("Accessing character at index 5: " + text.charAt(5));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index is out of bounds.");
		}
	}
}
