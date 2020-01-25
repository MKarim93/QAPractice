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

public class AllyBankMenuDrawer {
	
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
		
		//Start Of BankTab Testing
		@Test(priority = 1)
		public void onlineSavingsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Online Savings")).click();

			Thread.sleep(5000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/online-savings-account/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 2)
		public void interestCheckingLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			driver.findElement(By.linkText("Interest Checking")).click();

			Thread.sleep(5000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/interest-checking-account/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.get("https://www.ally.com/");
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 3)
		public void moneyMarketLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Money Market"))).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/money-market-account/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 4)
		public void compareAllSavingsLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Compare All Savings")));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("High Yield CD")));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Raise Your Rate CD"))).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/raise-your-rate-cd/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 7)
		public void noPenaltyCDLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("No Penalty CD")));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Compare All CDs")));
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

			Thread.sleep(3000);;
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/ira/high-yield-cd/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\"page-header\"]/section[4]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 10)
		public void IRARaiseYourRateCDLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("IRA Raise Your Rate CD")));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("IRA Online Savings")));
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About IRAs")));
			driver.findElement(By.linkText("About IRAs")).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ATM Locator")));
			driver.findElement(By.linkText("ATM Locator")).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/find-atms/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 17)
		public void startingToSaveLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Starting to Save")));
			driver.findElement(By.linkText("Starting to Save")).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Planning for Retirement")));
			driver.findElement(By.linkText("Planning for Retirement")).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/retirement-savings/";
			Assert.assertEquals(actualURL, expectedURL);

			driver.findElement(By.xpath("//*[@id=\"section-sub\"]/div/div/nav/ul/li[1]/button")).click();
		}

		@Test(priority = 21)
		public void openAccountBtnTest() throws InterruptedException {

			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Account"))).click();

			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/bank/view-rates/";
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
/************************************************************************************************************************************************************/
		//Start Of AutoTab Testing
		@Test(priority=22)
		public void manageYourAccountLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Manage Your Account")));
			driver.findElement(By.linkText("Manage Your Account")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Manage Your Auto Account | Make a Vehicle Payment | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=23)
		public void leaseEndProcessLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Lease-End Process")));
			driver.findElement(By.linkText("Lease-End Process")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "End of Lease Options: Buy It, Return It, Or Get More Time | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=24)
		public void personalLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Personal")));
			driver.findElement(By.linkText("Personal")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Vehicle Financing: Compare Buying vs Leasing Options | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=25)
		public void businessLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Business")));
			driver.findElement(By.linkText("Business")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Commercial Vehicle Financing | Business Auto Finance | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=26)
		public void monthlyPaymentCalculatorLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Monthly Payment Calculator")));
			driver.findElement(By.linkText("Monthly Payment Calculator")).click();
			
			Thread.sleep(3000);
			String expectedURL = driver.getCurrentUrl();
			String actualURL = "https://www.ally.com/auto/calculators/car-payment-calculator.html";
			
			Assert.assertEquals(actualURL, expectedURL);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=27)
		public void vehicleServiceContractsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Vehicle Service Contracts")));
			driver.findElement(By.linkText("Vehicle Service Contracts")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Ally Premier Protection - Vehicle Service Contracts | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=28)
		public void findAProtectionProductLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Find a Protection Product")));
			driver.findElement(By.linkText("Find a Protection Product")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Find A Protection Product";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=29)
		public void customerBenefitsSupportLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Customer Benefits & Support")));
			driver.findElement(By.linkText("Customer Benefits & Support")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Claims Support - Ally Premier Protection | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}
		
		@Test(priority=30)
		public void makeAPaymentLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Make")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Manage Your Auto Account | Make a Vehicle Payment | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[2]/button")).click();
		}

		@Test(priority=31)
		public void findaADealerLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Find a Dealer")).click();
			
			Thread.sleep(3000);
			String expectedTitle = driver.getTitle();
			String actualTitle = "Find Auto Dealers Near Me | Dealer Locator | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
/**
 * @throws InterruptedException **********************************************************************************************************************************/
		//Start Of HomeLoans Tab Testing
		@Test(priority=32)
		public void buyHomeLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Buy a Home")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Home Loans - Get Today's Mortgage Rates & Home Loan Calculator | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=33)
		public void refinanceLinkTest() throws InterruptedException {

			Thread.sleep(3000);
			driver.findElement(By.linkText("Refinance")).click();

			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Mortgage Refinance - Get Today's Refinance Rates & Refinance Calculator | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=34)
		public void allyHomeTeamLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("The Ally Home Team® Difference")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Ally Home Loans | Rates, Reviews & How it Works";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=35)
		public void affordabilityCalculatorLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Affordability Calculator")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Home Affordability Calculator - Could You Afford That Home? | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=36)
		public void mortgagePaymentLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Mortgage Payment Calculator")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Mortgage Payment Calculator - Estimate Your Monthly Mortgage Payment | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=37)
		public void refinanceCalculatorLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Refinance Calculator")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Refinance Calculator - See If Refinancing Your Mortgage Makes Sense | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[3]/button")).click();
		}
		
		@Test(priority=38)
		public void helpForTheFirstTimeHomeBuyerLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Help for the First-Time Homebuyer")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "First-Time Home Buyer Tips & Tools: What To Know Before You Buy | Ally";
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[4]/button")).click();
		}
		
/************************************************************************************************************************************/
		//Start Of InvestTab Testing
		@Test(priority=39)
		public void selfDirectedTradingLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Self-Directed Trading")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=40)
		public void managedPortfoliosLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Managed Portfolios")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/managed-portfolios/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=41)
		public void stocksETFLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Stocks and ETFs")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=first-ic-panel";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=42)
		public void commissionFreeETFLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Commission-free ETFs")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/etfs/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=43)
		public void optionsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Options")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/options-trading/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=44)
		public void bondsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Bonds")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=fourth-ic-panel";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=45)
		public void mutualFundsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Mutual Funds")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/?linkTo=choices-and-pricing&setPanel=fifth-ic-panel";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=46)
		public void marginAccountLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Margin Account")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/self-directed-trading/margin-account/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=47)
		public void forexLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Forex")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/forex/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=48)
		public void investingWithUsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Investing With Us")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[4]/button")).click();
		}
		@Test(priority=49)
		public void allyInvestAPILinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Ally Invest API")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/api/invest/documentation/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[4]/button")).click();
		}
		
		@Test(priority=50)
		public void getStartedBtnTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Get")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/invest/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\"learn-menu\"]/button")).click();
		}
		
/****************************************************************************************************************************************/
		//Start Of LearnTab Testing
		@Test(priority=51)
		public void startingOutLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Starting Out")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/emergency-fund/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
		}
		@Test(priority=52)
		public void marriagePartnershipLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Marriage & Partnership")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/combining-finances/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\"learn-menu\"]/button")).click();
		}
		@Test(priority=53)
		public void homeLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Home")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/first-time-home-buyer/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
		}
		@Test(priority=54)
		public void familyLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Family")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/savings-goal-calculator/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
		}
		@Test(priority=55)
		public void retirementLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Retirement")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/retirement-savings/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
		}
		@Test(priority=56)
		public void exploreTipsToolsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Explore Our Tips & Tools for Every Milestone")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.ally.com/education/financial-life/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			driver.findElement(By.xpath("//*[@id=\'learn-menu\']/button")).click();
		}
		@Test(priority=57)
		public void learnFinancialBasicsLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.linkText("Learn financial basics with Wallet Wise courses")).click();
			
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.allywalletwise.com/";
			
			Assert.assertEquals(actualURL, expectedURL);
			
			Thread.sleep(2000);
			driver.get("https://www.ally.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[6]/button")).click();
		}
		
/****************************************************************************************************************************************/
		//Start Of OpenAccountTab Testing
		@Test(priority=58)
		public void bankGetStartedLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div[1]/a")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "View Our CD Rates, Savings Rates, IRA Rates & Checking Rates | Ally Bank";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			driver.findElement(By.xpath("//*[@id=\'section-sub\']/div/div/nav/ul/li[6]/button")).click();
		}
		
		
		@Test(priority=59)
		public void homeLoansLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div/div[2]/a")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Ally Home Loan Quote - Get Started Today | Ally";
			
			Assert.assertEquals(actualTitle, expectedTitle);
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Ally Home")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'page-header\']/section[4]/div/div/nav/ul/li[6]/button")).click();
		}
		
		@Test(priority=60)
		public void investLinkTest() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'nav-openaccount\']/div/div[3]/a")).click();
			
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Ally Invest: Self-Directed Online Trading & Automated Investing";
			
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
		}

}
