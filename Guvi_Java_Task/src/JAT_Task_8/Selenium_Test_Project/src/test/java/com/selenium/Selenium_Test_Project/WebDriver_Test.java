package com.selenium.Selenium_Test_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// WebDriverManager.edgedriver().setup();

		// WebDriver driver = new EdgeDriver();

		// WebDriverManager.firefoxdriver().setup();

		// WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.apple.com/");

		Thread.sleep(3000);

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

	}
}
