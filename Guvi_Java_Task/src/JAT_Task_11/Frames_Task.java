package JAT_Task_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Task {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("http://the-internet.herokuapp.com/nested_frames");

			String pageTitle = driver.getTitle();
			if ("Frames".equals(pageTitle)) {
				System.out.println("Page title is verified as 'Frames'.");
			} else {
				System.out
						.println("Page title verification failed. Expected: 'Frames', but found a blank response : '" + pageTitle + "'");
			}

			driver.switchTo().frame("frame-top");

			int frameCount = driver.findElements(By.cssSelector("frame")).size();
			if (frameCount == 3) {
				System.out.println("There are three frames on the page.");
			} else {
				System.out.println("Frame count mismatch: Expected 3, found " + frameCount);
			}

			driver.switchTo().frame("frame-left");
			verifyText(driver, "LEFT");

			driver.switchTo().parentFrame();

			driver.switchTo().frame("frame-middle");
			verifyText(driver, "MIDDLE");

			driver.switchTo().parentFrame();

			driver.switchTo().frame("frame-right");
			verifyText(driver, "RIGHT");

			driver.switchTo().defaultContent();

			driver.switchTo().frame("frame-bottom");
			verifyText(driver, "BOTTOM");

			driver.switchTo().defaultContent();

		} finally {
			driver.quit();
		}
	}

	private static void verifyText(WebDriver driver, String expectedText) {
		WebElement body = driver.findElement(By.tagName("body"));
		if (body.getText().contains(expectedText)) {
			System.out.println("Text '" + expectedText + "' is present.");
		} else {
			System.out.println("Text '" + expectedText + "' is NOT present.");
		}
	}
}
