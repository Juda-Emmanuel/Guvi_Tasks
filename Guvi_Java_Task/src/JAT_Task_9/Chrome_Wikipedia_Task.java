package JAT_Task_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Wikipedia_Task {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wikipedia.org/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Artificial Intelligence");

		searchBox.submit();

		Thread.sleep(2000);

		WebElement historyLink = driver.findElement(By.xpath("//span[contains(text(), 'History')]"));
		historyLink.click();
		
		Thread.sleep(2000);

		String sectionTitle = driver.findElement(By.xpath("//span[contains(text(), 'History')]")).getText();
		System.out.println("Title of the section is: " + sectionTitle);
		
		driver.quit();

	}

}
