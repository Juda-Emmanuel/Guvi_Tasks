package JAT_Task_9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_DemoBlaze_Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		String pageTitle = driver.getTitle();

		if (pageTitle.equals("STORE")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}

		Thread.sleep(2000);

		driver.quit();

	}
}
