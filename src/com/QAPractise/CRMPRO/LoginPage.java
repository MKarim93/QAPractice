package com.QAPractise.CRMPRO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Karim\\eclipse-workspace"
				+ "\\QAPractise\\BrowserDrivers\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://classic.crmpro.com/index.html");
				
				driver.findElement(By.name("username")).sendKeys("naveenk");
				driver.findElement(By.name("password")).sendKeys("test123");
				WebDriverWait wait3 = new WebDriverWait(driver, 10);
				wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
			
		

	}

}
