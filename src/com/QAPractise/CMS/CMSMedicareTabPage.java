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

public class CMSMedicareTabPage {
	
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
		
		//Medicare-General Information
		@Test(priority=1)
		public void medicareProgramGeneralInformationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Program - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/MedicareGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=2)
		public void newMedicareCardLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("New Medicare Card")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/medicare/new-medicare-card/nmc-home";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=3)
		public void beneficiaryNoticesInitiativeLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Beneficiary Notices Initiative (BNI)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/BNI";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=4)
		public void medicareApprovedFacilitiesTrialsRegistriesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Approved Facilities/Trials/Registries")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/MedicareApprovedFacilitie/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=5)
		public void medicareHealthSupportLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Health Support (formerly CCIP)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/CCIP/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=6)
		public void medicareSummaryNoticesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Summary Notices")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/MSN/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=7)
		public void telehealthLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Telehealth")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-General-Information/Telehealth/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Appeals and Grievances
		@Test(priority=8)
		public void medicareManagedCareAppealsGrievancesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Managed Care Appeals & Grievances")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Appeals-and-Grievances/MMCAG/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=9)
		public void medicarePrescriptionDrugAppealsGrievancesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Prescription Drug Appeals & Grievances")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Appeals-and-Grievances/MedPrescriptDrugApplGriev/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=10)
		public void originalMedicareAppealsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Original Medicare (Fee-for-service) Appeals")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Appeals-and-Grievances/OrgMedFFSAppeals/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Billing
		@Test(priority=11)
		public void electronicBillingEDITransactionsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Electronic Billing & EDI Transactions")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Billing/ElectronicBillingEDITrans/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=12)
		public void medicareFeeForServiceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Fee-for-Service 5010 - D0")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Billing/MFFS5010D0/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=13)
		public void SNFConsolidatedBillingLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("SNF Consolidated Billing")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Billing/SNFConsolidatedBilling/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=14)
		public void therapyServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Therapy Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Billing/TherapyServices/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//CMS Forms
		@Test(priority=15)
		public void CMSFormsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("CMS Forms")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/CMS-Forms/CMS-Forms/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Coding
		@Test(priority=16)
		public void HCPCSGeneralInformationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("HCPCS - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/MedHCPCSGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=17)
		public void HCPCSReleaseCodeSetsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("HCPCS Release & Code Sets")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/HCPCSReleaseCodeSets/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=18)
		public void TransitionFromICD9ToICD10LinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Transition from ICD-9-CM to ICD-10")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/ICD9ProviderDiagnosticCodes/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=19)
		public void ICD10LinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ICD-10")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/ICD10/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=20)
		public void nationalCorrectCodingInitiativeEditsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("National Correct Coding Initiative Edits")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/NationalCorrectCodInitEd/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=21)
		public void outpatientCodeEditorLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Outpatient Code Editor (OCE)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/OutpatientCodeEdit/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=22)
		public void placeOfServiceCodesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Place of Service Codes")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coding/place-of-service-codes/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Compliance and Audits
		@Test(priority=23)
		public void partACostReportAuditReimbursementLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Part A Cost Report Audit & Reimbursement")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Compliance-and-Audits/Part-A-Cost-Report-Audit-and-Reimbursement/Index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=24)
		public void partCPartDComplianceAuditsOverviewLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Part C and Part D Compliance and Audits - Overview")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Compliance-and-Audits/Part-C-and-Part-D-Compliance-and-Audits/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Coordination of Benefits & Recovery
		@Test(priority=25)
		public void coordinationBenefitsRecoveryOverviewLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Coordination of Benefits & Recovery Overview")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Coordination-of-Benefits-and-Recovery-Overview/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=26)
		public void attorneyServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Attorney Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Attorney-Services/Attorney-Services";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=27)
		public void beneficiaryServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Beneficiary Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Beneficiary-Services/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=28)
		public void COBRATradingPartnersLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("COBA Trading Partners")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/COBA-Trading-Partners/COBA-Trading-Partners-Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=29)
		public void employerServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Employer Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/EmployerServices/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=30)
		public void insurerServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Insurer Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/InsurerServices/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=31)
		public void prescriptionDrugAssistanceProgramsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Prescription Drug Assistance Programs")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Prescription-Drug-Assistance-Programs/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=32)
		public void providerServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Provider Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/ProviderServices/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=33)
		public void mandatoryInsurerReportingForGroupHealthPlansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Mandatory Insurer Reporting For Group Health Plans")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Mandatory-Insurer-Reporting-For-Group-Health-Plans/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=34)
		public void mandatoryInsurerReportingForNonGroupHealthPlansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Mandatory Insurer Reporting For Non Group Health Plans")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Mandatory-Insurer-Reporting-For-Non-Group-Health-Plans/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=35)
		public void workersCompensationMedicareSetAsideArrangementsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Workers' Compensation Medicare Set Aside Arrangements")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coordination-of-Benefits-and-Recovery/Workers-Compensation-Medicare-Set-Aside-Arrangements/WCMSA-Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Coverage
		@Test(priority=36)
		public void medicareCoverageGeneralInformationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Coverage - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/CoverageGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=37)
		public void councilForTechnologyInnovationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Council for Technology & Innovation")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/CouncilonTechInnov/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=38)
		public void coverageInformationExchangeLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Coverage Information Exchange")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/InfoExchange/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=39)
		public void coverageWithEvidenceDevelopmentLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Coverage with Evidence Development")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/Coverage-with-Evidence-Development/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=40)
		public void medicareClinicalTrialPoliciesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Clinical Trial Policies")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/ClinicalTrialPolicies/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=41)
		public void medicareCoverageDeterminationProcessLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Coverage Determination Process")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/DeterminationProcess/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=42)
		public void medicareDentalCoverageLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Dental Coverage")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/MedicareDentalCoverage/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=43)
		public void medicareCoverageRelatedInvestigationalDeviceExemptionLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Coverage Related to Investigational Device Exemption (IDE) Studies")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Coverage/IDE/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Demonstration Projects
		@Test(priority=44)
		public void medicareDemonstrationProjectsEvaluationReports() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Demonstration Projects & Evaluation Reports")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Demonstration-Projects/DemoProjectsEvalRpts/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//E-Health
		@Test(priority=45)
		public void EHealthGeneralInformationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("E-Health General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/E-Health/EHealthGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=46)
		public void EPrescribingLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("E-Prescribing")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/E-Health/Eprescribing/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=47)
		public void electronicHealthRecordsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Electronic Health Records")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/E-Health/EHealthRecords/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=48)
		public void personalHealthRecordsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Personal Health Records")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/E-Health/PerHealthRecords/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Eligibility and Enrollment
		@Test(priority=49)
		public void lowIncomeSubsidyLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Low Income Subsidy for Medicare Prescription Drug Coverage")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Eligibility-and-Enrollment/LowIncSubMedicarePresCov/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=50)
		public void medicareManagedCareLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Managed Care Eligibility and Enrollment")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Eligibility-and-Enrollment/MedicareMangCareEligEnrol/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=51)
		public void medicarePrescriptionDrugLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Prescription Drug Eligibility and Enrollment")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Eligibility-and-Enrollment/MedicarePresDrugEligEnrol/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=52)
		public void originalMedicareEligibilityLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Original Medicare (Part A and B) Eligibility and Enrollment")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Eligibility-and-Enrollment/OrigMedicarePartABEligEnrol/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=53)
		public void medicareTheMarketplaceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare & the Marketplace")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Eligibility-and-Enrollment/Medicare-and-the-Marketplace/Overview1";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//End-Stage Renal Disease
		@Test(priority=54)
		public void ESRDGenInfoLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ESRD - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/End-Stage-Renal-Disease/ESRDGeneralInformation/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=55)
		public void clinicalPerformanceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Clinical Performance Measures (CPM) Project")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/End-Stage-Renal-Disease/CPMProject/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=56)
		public void ESRDQualityIncentiveLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ESRD Quality Incentive Program")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Quality-Initiatives-Patient-Assessment-Instruments/ESRDQIP/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=57)
		public void ESRDNetworkOrgLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ESRD Network Organizations")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/End-Stage-Renal-Disease/ESRDNetworkOrganizations/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Fraud and Abuse
		@Test(priority=58)
		public void physicianSelfReferralLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Physician Self Referral")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Fraud-and-Abuse/PhysicianSelfReferral/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Health Plans
		@Test(priority=59)
		public void healthPlansGeneralInfoLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Health Plans - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/HealthPlansGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=60)
		public void healthCarePrepaymentPlansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Health Care Prepayment Plans (HCPPs)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/HCPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=61)
		public void managedCareMarketingLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Managed Care Marketing")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/ManagedCareMarketing/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=62)
		public void medicareAdvantageRatesStatisticLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Advantage Rates & Statistics")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/MedicareAdvtgSpecRateStats/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=63)
		public void medicareCostPlansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Cost Plans")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/MedicareCostPlans/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=64)
		public void medigapLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medigap (Medicare Supplement Health Insurance)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/Medigap/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=65)
		public void medicalSavingsAccountLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medical Savings Account (MSA)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/MSA/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=66)
		public void privateFeeForServiceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Private Fee-for-Service Plans")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/PrivateFeeforServicePlans/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=67)
		public void programCareForTheElderlyLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Program of All-Inclusive Care for the Elderly (PACE)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/PACE/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=68)
		public void regionalPreferredProviderLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Regional Preferred Provider Organizations (RPPO)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/RPPO/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=69)
		public void specialNeedsPlansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Special Needs Plans")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/SpecialNeedsPlans/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=70)
		public void medicareAdvantageLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Advantage Quality Improvement Program")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Health-Plans/Medicare-Advantage-Quality-Improvement-Program/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Provider Type
		@Test(priority=71)
		public void allFeeForServiceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("All Fee-For-Service Providers")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/All-Fee-For-Service-Providers-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=72)
		public void ambulatorySurgicalCentersLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Ambulatory Surgical Centers (ASC)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Ambulatory-Surgical-Centers-ASC-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=73)
		public void ambulanceServicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Ambulance Services")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Ambulances-Services-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=74)
		public void anesthesiologiestLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Anesthesiologists")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Anesthesiologists-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=75)
		public void clinicalLabsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Clinical Labs")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Clinical-Labs-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=76)
		public void criticalAccessHospitalsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Critical Access Hospitals")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Critical-Access-Hospitals-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=77)
		public void durableMedicalEquipmentLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Durable Medical Equipment (DME)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Durable-Medical-Equipment-DME-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=78)
		public void FedQualifiedHealthCentersLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Federally Qualified Health Centers (FQHC)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Federally-Qualified-Health-Centers-FQHC-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=79)
		public void homeHealthAgenciesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Home Health Agencies (HHA)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Home-Health-Agency-HHA-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=80)
		public void hospicesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Hospices")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Hospice-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=81)
		public void hospitalsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Hospitals")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Hospital-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=82)
		public void opioidTreatmentProgramsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Opioid Treatment Programs")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Opioid-Treatment-Program-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=83)
		public void practiceAdminLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Practice Administration")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Practice-Administration-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=84)
		public void pharmacistsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Pharmacists")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Pharmacist-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=85)
		public void physiciansLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Physicians")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Physician-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=86)
		public void ruralHealthClinicsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Rural Health Clinics")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Rural-Health-Clinics-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=87)
		public void skilledNursingFacilitiesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Skilled Nursing Facilities (SNF)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Center/Provider-Type/Skilled-Nursing-Facility-Center";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Medicare Advantage
		@Test(priority=88)
		public void medicareAdvantageApplicationsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Advantage Applications")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Advantage/MedicareAdvantageApps/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=89)
		public void medicareAdvantagePrescriptingDrugLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Advantage Prescription Drug Contracting (MAPD)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Advantage/MAPDContracting/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=90)
		public void planPaymentLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Plan Payment")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Advantage/Plan-Payment/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Medicare Contracting
		@Test(priority=91)
		public void medicareAdminContractorsLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Administrative Contractors")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Contracting/Medicare-Administrative-Contractors/MedicareAdministrativeContractors";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=92)
		public void contractorProviderLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Contractor Provider Customer Service Program - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Contracting/FFSProvCustSvcGen/Spotlight";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=93)
		public void MACSatisfactionLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("MAC Satisfaction Indicator (MSI)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Contracting/MSI/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Medicare Fee-for-Service Part B Drugs
		@Test(priority=94)
		public void competitiveAcquisitionLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Competitive Acquisition for Part B Drugs & Biologicals")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Part-B-Drugs/CompetitiveAcquisforBios/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=95)
		public void medicareBDrugSalesPriceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare Part B Drug Average Sales Price")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Part-B-Drugs/McrPartBDrugAvgSalesPrice/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		//Medicare Fee-for-Service Payment
		@Test(priority=96)
		public void feeSchedulesGenInfoLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Fee Schedules - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/FeeScheduleGenInfo/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=97)
		public void prospectivePaymentGenInfoLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Prospective Payment Systems - General Information")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/ProspMedicareFeeSvcPmtGen/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=98)
		public void accountableCareOrgLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Accountable Care Organizations (ACO)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/ACO/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=99)
		public void acuteInpatientLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Acute Inpatient PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/AcuteInpatientPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=100)
		public void ambulanceFeeScheduleLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Ambulance Fee Schedule")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/AmbulanceFeeSchedule/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=101)
		public void ambulatorySurgicalCenterLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Ambulatory Surgical Center (ASC) Payment")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/ASCPayment/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=102)
		public void bankruptcyLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Bankruptcy")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/Bankruptcy/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=103)
		public void clinicalLabFeeScheduleLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Clinical Laboratory Fee Schedule")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/ClinicalLabFeeSched/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=104)
		public void DMEPOSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("DMEPOS Competitive Bidding")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/DMEPOSCompetitiveBid/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=105)
		public void durableMedicalEquipmentFeeScheduleLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Durable Medical Equipment, Prosthetics/Orthotics, and Supplies Fee Schedule")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/DMEPOSFeeSched/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=106)
		public void ESRDPPSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ESRD PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/ESRDpayment/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=107)
		public void federallyQualifiedLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Federally Qualified Health Center PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/FQHCPPS/Index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=108)
		public void homeHealthPPSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Home Health PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/HomeHealthPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=109)
		public void homeInfusionTherapyLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Home Infusion Therapy")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/Home-Infusion-Therapy/Overview";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=110)
		public void hospiceLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Hospice")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/Hospice/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=111)
		public void hospitalAcquiredLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Hospital-Acquired Conditions (Present on Admission Indicator)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/HospitalAcqCond/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=112)
		public void hospitalOutpatientPPSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Hospital Outpatient PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/HospitalOutpatientPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=113)
		public void inpatientPsychiatricLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Inpatient Psychiatric Facility PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/InpatientPsychFacilPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=114)
		public void inpatientRehabilitationLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Inpatient Rehabilitation Facility PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/InpatientRehabFacPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=115)
		public void longTermCareLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Long-Term Care Hospital PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/LongTermCareHospitalPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=116)
		public void medicareFFSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare FFS Physician Feedback Program/Value-Based Payment Modifier")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/PhysicianFeedbackProgram/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=117)
		public void opioidTreatmentLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Opioid Treatment Programs (OTP)")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/Opioid-Treatment-Program/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=118)
		public void PCPricerLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("PC Pricer")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/PCPricer/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=119)
		public void physicianFeeScheduleLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Physician Fee Schedule")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/PhysicianFeeSched/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=120)
		public void physicianFeeScheduleLookUpToolLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Physician Fee Schedule Look-Up Tool")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/PFSlookup/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=121)
		public void physicianBonusesLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Physician Bonuses")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/HPSAPSAPhysicianBonuses/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=122)
		public void skilledNursingFacilityPPSLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Skilled Nursing Facility PPS")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/SNFPPS/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=123)
		public void sustainableGrowthLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sustainable Growth Rates & Conversion Factors")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/SustainableGRatesConFact/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@Test(priority=124)
		public void sharedSavingsProgramLinkTest() throws InterruptedException {
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Medicare")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Shared Savings Program")).click();
			
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.cms.gov/Medicare/Medicare-Fee-for-Service-Payment/sharedsavingsprogram/index";
			Assert.assertEquals(actualURL, expectedURL);
		}
		
		@AfterTest
		public void teardown() {
			driver.quit();
		}
}
