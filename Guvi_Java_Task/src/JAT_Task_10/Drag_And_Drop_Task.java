package JAT_Task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Task {

	WebDriver driver = new ChromeDriver();

	public void launchWeb() {
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	}

	public void dragAndDrop() {

		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();

		String backgroundColor = target.getCssValue("background-color");
		System.out.println("Target Element Background Color after Drop: " + backgroundColor);

		String targetText = target.getText();
		if (targetText.equals("Dropped!")) {
			System.out.println("Drag and drop successful: " + targetText);
		} else {
			System.out.println("Drag and drop failed. Target text: " + targetText);
		}
		
		driver.quit();
	}

	public static void main(String[] args) {

		Drag_And_Drop_Task dragAndDrop = new Drag_And_Drop_Task();

		dragAndDrop.launchWeb();
		dragAndDrop.dragAndDrop();
	}
}
