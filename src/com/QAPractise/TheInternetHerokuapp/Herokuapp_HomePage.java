package com.QAPractise.TheInternetHerokuapp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Herokuapp_HomePage {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad Karim\\eclipse-workspace" + "\\QAPractise\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	/*@Test
	public void checkBoxTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		Thread.sleep(2000);
			boolean x = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
			if (x==false)
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}*/
	
	@Test
	public void javaScriptAlertTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alerts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String print = alert.getText();
		Thread.sleep(2000);
		System.out.println(print);
		Thread.sleep(2000);
		alert.accept();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
