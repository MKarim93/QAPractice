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

public class AllyBankAutoTabPage {
	
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
	public void manageYourAccountLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Manage Your Account")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Manage Your Auto Account | Make a Vehicle Payment | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=2)
	public void leaseEndProcessLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Lease-End Process")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "End of Lease Options: Buy It, Return It, Or Get More Time | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=3)
	public void personalLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Personal")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Vehicle Financing: Compare Buying vs Leasing Options | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=4)
	public void businessLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Business")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Commercial Vehicle Financing | Business Auto Finance | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=5)
	public void monthlyPaymentCalculatorLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Monthly Payment Calculator")).click();
		
		Thread.sleep(3000);
		String expectedURL = driver.getCurrentUrl();
		String actualURL = "https://www.ally.com/auto/calculators/car-payment-calculator.html";
		
		Assert.assertEquals(actualURL, expectedURL);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=6)
	public void vehicleServiceContractsLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Vehicle Service Contracts")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Ally Premier Protection - Vehicle Service Contracts | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=7)
	public void findAProtectionProductLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find a Protection Product")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Find A Protection Product";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=8)
	public void customerBenefitsSupportLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer Benefits & Support")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Claims Support - Ally Premier Protection | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=9)
	public void makeAPaymentLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-auto\']/div/div[3]/div[1]/a")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Manage Your Auto Account | Make a Vehicle Payment | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
	}
	
	@Test(priority=10)
	public void findaADealerLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find a Dealer")).click();
		
		Thread.sleep(3000);
		String expectedTitle = driver.getTitle();
		String actualTitle = "Find Auto Dealers Near Me | Dealer Locator | Ally";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
