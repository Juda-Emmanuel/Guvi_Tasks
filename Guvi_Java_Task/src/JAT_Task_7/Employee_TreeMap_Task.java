package JAT_Task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Employee_TreeMap_Task {

	public static void main(String[] args) {

		TreeMap<Integer, String> employeeMap = new TreeMap<>();

		employeeMap.put(9, "Juda");
		employeeMap.put(8, "Dani");
		employeeMap.put(7, "Cya");
		employeeMap.put(6, "Praveen");

		List<String> employeeNames = new ArrayList<>(employeeMap.values());
		Collections.sort(employeeNames);

		System.out.println("Employees in alphabetical order:");
		for (String name : employeeNames) {
			System.out.println(name);
		}
	}
}
