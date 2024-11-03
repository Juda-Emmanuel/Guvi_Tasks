package JAT_Task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Task {

	WebDriver driver = new ChromeDriver();
	
	public void launchWeb() {
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
	}
	
	public void datePicker() {
		
        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);
        
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();
        
        WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
        nextButton.click();
        
        WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
        date.click();
        
        String selectedDate = datepicker.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);
        
        driver.quit();
	}

	public static void main(String[] args) {
		
		iFrame_Task frames = new iFrame_Task();
		
		frames.launchWeb();
		frames.datePicker();
	}
}
