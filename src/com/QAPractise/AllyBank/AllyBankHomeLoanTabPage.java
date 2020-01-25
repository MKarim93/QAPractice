package com.QAPractise.AllyBank;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllyBankHomeLoanTabPage {
	
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
	
	/*
	@Test
	public void brokenLinkTest() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Buy a Home")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext()) {
			url = it.next().getAttribute("href");
			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if(!url.startsWith("https://www.ally.com/home-loans/mortgage/")){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				
				if(respCode >= 400) {
					System.out.println(url+" is a broken link");
				}
				else {
					System.out.println(url+" is a valid link");
				}
			}catch (MalformedURLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	*/
	
	@Test(priority=1)
	public void buyHomeLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buy a Home")));
		driver.findElement(By.linkText("Buy a Home")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Home Loans - Get Today's Mortgage Rates & Home Loan Calculator | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=2)
	public void refinanceLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Refinance")));
		driver.findElement(By.linkText("Refinance")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Mortgage Refinance - Get Today's Refinance Rates & Refinance Calculator | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=3)
	public void allyHomeTeamLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='section-sub']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("The Ally Home Team® Difference")));
		driver.findElement(By.linkText("The Ally Home Team® Difference")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Ally Home Loans | Rates, Reviews & How it Works";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=4)
	public void affordabilityCalculatorLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*//*[@id='section-sub']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Affordability Calculator")));
		driver.findElement(By.linkText("Affordability Calculator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Home Affordability Calculator - Could You Afford That Home? | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=5)
	public void mortgagePaymentLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*//*[@id='section-sub']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mortgage Payment Calculator")));
		driver.findElement(By.linkText("Mortgage Payment Calculator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Mortgage Payment Calculator - Estimate Your Monthly Mortgage Payment | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=6)
	public void refinanceCalculatorLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*//*[@id='section-sub']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Refinance Calculator")));
		driver.findElement(By.linkText("Refinance Calculator")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Refinance Calculator - See If Refinancing Your Mortgage Makes Sense | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=7)
	public void firstTimeHomeBuyerLinkTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*//*//*[@id='section-sub']/div/div/nav/ul/li[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Help for the First-Time Homebuyer")));
		driver.findElement(By.linkText("Help for the First-Time Homebuyer")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle = driver.getTitle();
		String expectedTitle = "First-Time Home Buyer Tips & Tools: What To Know Before You Buy | Ally";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
