package JAT_Task_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi_SignUp_And_Login_Task {

	WebDriver driver = new ChromeDriver();

	public void launchWeb() {
		driver.manage().window().maximize();
		driver.get("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void signUp() {

		WebElement signupButton = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signupButton.click();

		driver.findElement(By.id("name")).sendKeys("Guvi User");
		driver.findElement(By.id("email")).sendKeys("guviusers@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");

		WebElement submitSignup = driver.findElement(By.id("signup-btn"));
		submitSignup.click();

		if (driver.getTitle().contains("Welcome")) {
			System.out.println("Signup successful.");
		} else {
			System.out.println("Signup failed.");
		}
	}

	public void login() {

		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();

		driver.findElement(By.id("email")).sendKeys("guviuser@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");

		WebElement submitLogin = driver.findElement(By.id("login-btn"));
		submitLogin.click();

		if (driver.getTitle().contains("Dashboard")) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Login failed.");
		}
		driver.quit();
	}

	public static void main(String[] args) {

		Guvi_SignUp_And_Login_Task guviAutomation = new Guvi_SignUp_And_Login_Task();

		guviAutomation.launchWeb();
		guviAutomation.signUp();
		guviAutomation.login();
	}
}
