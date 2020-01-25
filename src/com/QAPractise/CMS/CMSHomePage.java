package com.QAPractise.CMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CMSHomePage {
	
	WebDriver driver;
	WebDriverWait wait;
		@BeforeTest
		public void setup() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Mohammad Karim\\eclipse-workspace" + "\\QAPractise\\BrowserDrivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cms.gov/");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 10);
		}
		
		@Test(priority=1)
		public void medicareTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=2)
		public void medicareCHIPTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicaid/CHIP")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.medicaid.gov/";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=2)
		public void medicareMedicaidCoordinationTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.get("https://www.cms.gov/Medicare/Medicare");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare-Medicaid Coordination")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare-Medicaid-Coordination/Medicare-MedicaidCoordination";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=3)
		public void privateInsuranceTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Private Insurance")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/CCIIO/index";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=4)
		public void innovationCenterTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Innovation Center")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://innovation.cms.gov/";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=5)
		public void regulationsGuidanceTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Regulations & Guidance")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Regulations-and-Guidance/Regulations-and-Guidance";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=6)
		public void researchStatisticsDataSystemsTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Research, Statistics, Data & Systems")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Research-Statistics-Data-and-Systems/Research-Statistics-Data-and-Systems";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=7)
		public void outreachEducationTabTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Outreach & Education")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Outreach-and-Education/Outreach-and-Education";
			
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
		}

}
