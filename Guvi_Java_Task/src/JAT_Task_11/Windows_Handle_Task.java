package JAT_Task_11;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handle_Task {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {

			driver.get("https://the-internet.herokuapp.com/windows");

			driver.findElement(By.linkText("Click Here")).click();

			String originalWindow = driver.getWindowHandle();
			for (String windowHandle : driver.getWindowHandles()) {
				if (!windowHandle.equals(originalWindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}

			try {
				if (driver.findElement(By.tagName("body")).getText().contains("New Window")) {
					System.out.println(" 'New Window' is present on the page.");
				} else {
					System.out.println(" 'New Window' is NOT present on the page.");
				}
			} catch (NoSuchElementException e) {
				System.out.println(" 'New Window' is NOT present on the page");
			}

			driver.close();

			driver.switchTo().window(originalWindow);

			if (driver.getWindowHandle().equals(originalWindow)) {
				System.out.println("Original window is active.");
			} else {
				System.out.println("Original window is NOT active.");
			}

		} finally {

			driver.quit();
		}
	}
}
