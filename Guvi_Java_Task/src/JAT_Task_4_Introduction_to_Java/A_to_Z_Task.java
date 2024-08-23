package JAT_Task_4_Introduction_to_Java;

public class A_to_Z_Task {

	public static void main(String[] args) {

		for (char alphabets = 'A'; alphabets <= 'Z'; alphabets++) {
			System.out.print(alphabets + " ");
		}

		System.out.print("====Upper Case to Lower Case====");

		for (char alphabets = 'a'; alphabets <= 'z'; alphabets++) {
			System.out.print(alphabets + " ");
		}
	}
}
