package com.QAPractise.rottentomatoes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Karim\\eclipse-workspace"
				+ "\\QAPractise\\BrowserDrivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				Actions actions = new Actions(driver);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://www.rottentomatoes.com/");
				
				WebElement moviesMenu = driver.findElement(By.id("movieMenu"));
				WebElement tvMenu = driver.findElement(By.id("tvMenu"));
				WebElement newsMenu = driver.findElement(By.id("newsMenu"));
				
				driver.findElement(By.id("header-top-bar-login")).click();
				driver.findElement(By.id("header-top-bar-signup")).click();
				driver.findElement(By.id("header-top-bar-critics")).click();
				driver.findElement(By.id("header-whats-the-tomatometer")).click();
				driver.findElement(By.id("ticketingMenu")).click();
				actions.moveToElement(newsMenu).perform();
				actions.moveToElement(tvMenu).perform();
				actions.moveToElement(moviesMenu).perform();
				
				
				//driver.findElement(By.id("movieMenu")).click();
				
				//driver.findElement(By.id("fullscreen-search-term")).sendKeys("War Dogs");
				//driver.findElement(By.id("fullscreen-search-desktop-search-btn")).click();
				
				//driver.findElement(By.id("original_rt_logo")).click();
		
				driver.quit();

	}

}
