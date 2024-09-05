package JAT_Task_6;

public class Account_Task {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public Account_Task() {
		accountNumber = "000000";
		accountHolderName = "Unknown";
		balance = 0.0;
	}

	public Account_Task(String accountNumber, String accountHolderName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited: ₹" + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Successfully withdrew: ₹" + amount);
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	}

	public void checkBalance() {
		System.out.println("Current balance is: ₹" + balance);
	}

	public static void main(String[] args) {

		Account_Task acc1 = new Account_Task();
		System.out.println("Account balance of unknown : ");
		acc1.checkBalance();
		acc1.deposit(1500);
		acc1.checkBalance();
		acc1.withdraw(500);
		acc1.checkBalance();
		System.out.println("**************************End***************************");

		Account_Task acc2 = new Account_Task("9876543210", "Juda Emmanuel", 1000.0);
		System.out.println("Account balance of Juda Emmanuel : ");
		acc2.checkBalance();
		acc2.deposit(500);
		acc2.withdraw(1000);
		acc2.checkBalance();
	}
}
