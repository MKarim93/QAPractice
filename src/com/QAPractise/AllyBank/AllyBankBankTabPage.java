package com.QAPractise.AllyBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllyBankBankTabPage {

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

	@Test(priority = 1)
	public void onlineSavingsLinkTest() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Online Savings")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/online-savings-account/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 2)
	public void interestCheckingLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Interest Checking")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/interest-checking-account/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 3)
	public void moneyMarketLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Money Market")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/money-market-account/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 4)
	public void compareAllSavingsLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Compare All Savings")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/savings-account-rates/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 5)
	public void highYieldCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("High Yield CD")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/high-yield-cd/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 6)
	public void raiseYourRateCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Raise Your Rate CD")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/raise-your-rate-cd/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 7)
	public void noPenaltyCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("No Penalty CD")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/no-penalty-cd/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 8)
	public void compareAllCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Compare All CDs")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/cd-rates/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 9)
	public void IRAHighYieldCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("IRA High Yield CD")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/ira/high-yield-cd/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 10)
	public void IRARaiseYourRateCDLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("IRA Raise Your Rate CD")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/ira/raise-your-rate-cd/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 11)
	public void IRAOnlineSavingsLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("IRA Online Savings")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/ira/online-savings-account/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 12)
	public void aboutIRALinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("About IRAs")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/about-iras/#overview";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 13)
	public void compareAllIRALinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Compare All IRAs")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/ira/ira-account/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 14)
	public void whyBankWithUSLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Why Bank With Us")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/online-banking/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 15)
	public void howToBankWithUSLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("How to Bank With Us")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/online-banking/how-to-bank-with-ally/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 16)
	public void ATMLocatorLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("ATM Locator")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/find-atms/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 17)
	public void startingToSaveLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Starting to Save")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/emergency-fund/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 18)
	public void combiningFinancesLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Combining Finances")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/combining-finances/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 19)
	public void savingAsAFamilyLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Saving as a Family")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/savings-goal-calculator/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 20)
	public void planningForRetirementLinkTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Planning for Retirement")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/education/financial-life/retirement-savings/";
		Assert.assertEquals(actualURL, expectedURL);

		driver.findElement(By.xpath("//*[@id=\"section-sub\"]/div/div/nav/ul/li[1]/button")).click();
	}

	@Test(priority = 21)
	public void openAccountBtnTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-bank\']/div/div[4]/div[1]/a")).click();

		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/bank/view-rates/";
		Assert.assertEquals(actualURL, expectedURL);

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
