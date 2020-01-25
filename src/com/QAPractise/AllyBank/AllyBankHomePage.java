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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllyBankHomePage {

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

	@Test(priority=5)
	public void negativeloginTest() throws InterruptedException {
		driver.findElement(By.id("login-btn")).click();
		Select s = new Select(driver.findElement(By.id("account")));
		s.selectByVisibleText("Bank or Invest Login");

		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@data-id='submit']")).click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "Temporarily Unavailable | Ally");
	}
	
	@Test(priority=3)
	public void homepageModuleTest() {
		driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[2]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[3]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[3]/button")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[4]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[5]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[5]/button")).getText());
		
		driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[6]/button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[6]/button")).getText());
		
	}
	
	@Test(priority=1)
	public void getAllLinks() {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) {
			System.out.println(link.getText()+" - "+link.getAttribute("href"));
		}
	}
	
	@Test(priority=2)
	public void brokenLinkTest() {
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
			if(!url.startsWith("https://www.ally.com/")){
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
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
