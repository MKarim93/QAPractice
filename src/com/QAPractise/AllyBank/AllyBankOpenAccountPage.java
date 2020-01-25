package com.QAPractise.AllyBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllyBankOpenAccountPage {
	
WebDriver driver;
WebDriverWait wait;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad Karim\\eclipse-workspace" + "\\QAPractise\\BrowserDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ally.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	@Test(priority=1)
	public void bankGetStartedLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[6]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "View Our CD Rates, Savings Rates, IRA Rates & Checking Rates | Ally Bank";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@Test(priority=2)
	public void homeLoansLinkTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[6]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div/div[2]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Ally Home Loan Quote - Get Started Today | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=3)
	public void investLinkTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-breadcrumbs\"]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[6]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div[3]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Ally Invest: Self-Directed Online Trading & Automated Investing";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
