package JAT_Task_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Task {

	public static void createDBData() throws ClassNotFoundException, SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EMPLOYEE_DETAILS_INFO", "root",
				"Apria@2020");

		String createTableQuery = "CREATE TABLE IF NOT EXISTS Employee (" + "empcode INT PRIMARY KEY, "
				+ "empname VARCHAR(50), " + "empage INT, " + "esalary DECIMAL(10, 2))";

		Statement statement = connection.createStatement();

		statement.execute(createTableQuery);
	}

	public static void insertDBData() throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/EMPLOYEE_DETAILS_INFO", "root",
				"Apria@2020");

		Statement statement = connection.createStatement();

		String insertQuery = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES "
				+ "(101, 'Jenny', 25, 10000), " + "(102, 'Jacky', 30, 20000), " + "(103, 'Joe', 20, 40000), "
				+ "(104, 'John', 40, 80000), " + "(105, 'Shameer', 25, 90000)";

		statement.executeUpdate(insertQuery);

		System.out.println("Table created and data inserted successfully!");

		statement.close();
		connection.close();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		JDBC_Task obj = new JDBC_Task();

		obj.createDBData();
		obj.insertDBData();
	}
}
