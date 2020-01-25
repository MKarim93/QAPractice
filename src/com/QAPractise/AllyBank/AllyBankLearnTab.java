package com.QAPractise.AllyBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllyBankLearnTab {
	
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
	public void startingOutLinkTest() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"learn-menu\"]/button"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Starting Out"))).click();
		
		Thread.sleep(2000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/emergency-fund/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
	}
	@Test(priority=2)
	public void marriagePartnershipLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Marriage & Partnership"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/combining-finances/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\"learn-menu\"]/button")).click();
	}
	@Test(priority=3)
	public void homeLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/first-time-home-buyer/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
	}
	@Test(priority=4)
	public void familyLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Family"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/savings-goal-calculator/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
	}
	@Test(priority=5)
	public void retirementLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Retirement"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/retirement-savings/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
	}
	@Test(priority=6)
	public void exploreTipsToolsLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Explore Our Tips & Tools for Every Milestone"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
	}
	@Test(priority=7)
	public void learnFinancialBasicsLinkTest() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Learn financial basics with Wallet Wise courses"))).click();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.allywalletwise.com/";
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
