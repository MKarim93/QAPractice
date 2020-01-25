package com.QAPractise.letterboxd;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LetterboxdHomePage {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad Karim\\eclipse-workspace" + "\\QAPractise\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letterboxd.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}

	@Test(priority=1)
	public void letterboxdLogoTest() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'header\']/section/h1/a")).click();
		
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://letterboxd.com/";
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=2)
	public void signInLinkTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN IN")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.linkText("Forgotten?")).isDisplayed());
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
