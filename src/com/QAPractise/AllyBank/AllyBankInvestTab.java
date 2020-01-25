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

public class AllyBankInvestTab {
	
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
	public void selfDirectedTradingLinkTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Self-Directed Trading")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=2)
	public void managedPortfoliosLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Managed Portfolios")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/managed-portfolios/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=3)
	public void stocksETFLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Stocks and ETFs")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=first-ic-panel";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=4)
	public void commissionFreeETFLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Commission-free ETFs")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/etfs/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=5)
	public void optionsLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Options")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/options-trading/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=6)
	public void bondsLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Bonds")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=fourth-ic-panel";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=7)
	public void mutualFundsLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Mutual Funds")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=fifth-ic-panel";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=8)
	public void marginAccountLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Margin Account")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/self-directed-trading/margin-account/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=9)
	public void forexLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forex")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/forex/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=10)
	public void investingWithUsLinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Investing With Us")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=11)
	public void allyInvestAPILinkTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Ally Invest API")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/api/invest/documentation/";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[4]/button")).click();
	}
	@Test(priority=12)
	public void getStartedBtnTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'nav-invest\']/div/div[4]/div[1]/a")).click();
		
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.ally.com/invest/";
		
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
