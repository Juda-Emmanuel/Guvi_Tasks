package JAT_Task_6;

public class Employee_Task {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee_Task(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee_Task [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public int getGetAnnualSalary() {
		return 12 * getAnnualSalary;
	}

	public void setGetAnnualSalary(int getAnnualSalary) {
		this.getAnnualSalary = getAnnualSalary;
	}

	public int getRaiseSalary() {
		return 10 / 100 * raiseSalary;
	}

	public void setRaiseSalary(int raiseSalary) {
		this.raiseSalary = raiseSalary;
	}

	private int getAnnualSalary;
	private int raiseSalary;

	public static void main(String[] args) {

		Employee_Task emp = new Employee_Task(12345678, "Juda", "Emmanuel", 12000);

		System.out.println(emp.getId() + " " + emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary());

	}
}
