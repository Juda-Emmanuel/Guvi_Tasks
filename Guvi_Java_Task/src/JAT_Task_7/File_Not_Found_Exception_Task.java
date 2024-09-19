package JAT_Task_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Not_Found_Exception_Task {

	public static void main(String[] args) {

		String filePath = "non_existent_file.txt";

		try {

			File file = new File(filePath);
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error: The file '" + filePath + "' does not exist.");
		}
	}
}
