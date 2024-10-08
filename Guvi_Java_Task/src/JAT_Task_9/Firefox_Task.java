package JAT_Task_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current url of the page is " + currentUrl);
		
		Thread.sleep(2000);

		driver.navigate().refresh();
		
		Thread.sleep(2000);

		driver.close();

	}
}
