package com.QAPractise.EchoEcho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_HomePage {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad Karim\\eclipse-workspace" + "\\QAPractise\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test
	public void dropDownToolTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Online Tools")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("DROP DOWN MENU")).click();
		Select select = new Select(driver.findElement(By.name("choice")));
		
		select.selectByVisibleText("YAHOO");
		
		driver.findElement(By.xpath("//*[@type='button']")).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.yahoo.com/";
		Assert.assertEquals(actualURL, expectedURL);
	}

}
