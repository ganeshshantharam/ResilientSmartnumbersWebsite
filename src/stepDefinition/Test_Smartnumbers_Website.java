package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_Smartnumbers_Website

{
	
	
	public static WebDriver driver;


	@Given("^I am on the smartnumbers website home page$")
	public void user_on_the_smartnumbers_website_home_page() throws Throwable
	{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		
			String baseUrl = "http://www.resilientplc.com";
		
			driver.navigate().to(baseUrl);
			Thread.sleep(3000);
			driver.manage().window().maximize();
	}
	
	@When("^I click on Lower - Banner - Solutions - Overview - Option$")
	public void click_on_lower_banner_solutions_overview_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4607']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Solutions - Resilientplc$")
	public void verify_page_title_solutions_overview_option() throws Throwable
	{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Solutions • Resilientplc" );
			Thread.sleep(3000);
	}
	
	@And("^I close the Browser$")
	public void close_browser() throws Throwable
	{
			driver.close();
			driver.quit();
	}
	
	@When("^I click on Lower - Banner - Solutions - Two numbers, one mobile - Option$")
	public void click_on_lower_banner_solutions_TwoNumbersOneMobile_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4473']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles The enterprise mobile - Resilientplc$")
	public void verify_page_title_solutions_TwoNumbersOneMobile_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "The enterprise mobile • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Solutions - Call Recording - Option$")
	public void click_on_lower_banner_solutions_CallRecording_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath("//*[@id='menu-item-4475']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Call recording - Resilientplc$")
	public void verify_page_title_solutions_CallRecording_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Call recording • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Solutions - Face To Face Recording - Option$")
	public void click_on_lower_banner_solutions_FaceToFaceRecording_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4628']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Face-to-face - Resilientplc$")
	public void verify_page_title_solutions_FaceToFaceRecording_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Face-to-face • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Solutions - Office Moves - Option$")
	public void click_on_lower_banner_solutions_OfficeMoves_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4477']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Office moves - Resilientplc$")
	public void verify_page_title_solutions_OfficeMoves_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Office moves • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Solutions - Business Continuity - Option$")
	public void click_on_lower_banner_solutions_BusinessContinuity_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4479']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Protect critical numbers - smartnumbers$")
	public void verify_page_title_solutions_BusinessContinuity_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Protect critical numbers • smartnumbers" );
			Thread.sleep(3000);
		}
	
	
	
	
	
	@When("^I click on Lower - Banner - Products - Overview - Option$")
	public void click_on_lower_banner_products_Overview_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4606']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles smartnumbers overview - Resilientplc$")
	public void verify_page_title_products_Overview_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "smartnumbers overview • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Products - Smartnumbers Mobile - Option")
	public void click_on_lower_banner_products_SmartnumbersMobile_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4485']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles About smartnumbers mobile.")
	public void verify_page_title_products_SmartnumbersMobile_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "About smartnumbers mobile." );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Products - Smartnumbers Call Recording - Option$")
	public void click_on_lower_banner_products_CallRecording_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4585']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles smartnumbers call recording - Resilientplc$")
	public void verify_page_title_products_CallRecording_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "smartnumbers call recording • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Products - Smartnumbers Face To Face - Option$")
	public void click_on_lower_banner_products_SmartnumbersFaceToFace_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4586']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles smartnumbers face-to-face-recording - Resilientplc.$")
	public void verify_page_title_products_SmartnumbersFaceToFace_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "smartnumbers face-to-face-recording • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Products - Smartnumbers Control - Option$")
	public void click_on_lower_banner_products_SmartnumbersControl_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4484']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles About smartnumbers control - smartnumbers$")
	public void verify_page_title_products_SmartnumbersControl_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "About smartnumbers control • smartnumbers" );
			Thread.sleep(3000);
		}
	
	
	
	
	
	
	@When("^I click on Lower - Banner - Partners - Overview - Option$")
	public void click_on_lower_banner_partners_Overview_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4492']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Partners - Resilientplc$")
	public void verify_page_title_partners_Overview_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Partners • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Partners - Distribution Partners - Option$")
	public void click_on_lower_banner_partners_DistributionPartners_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4491']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Distribution partners - Resilientplc$")
	public void verify_page_title_partners_DistributionPartners_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Distribution partners • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - Partners - Technology Partners - Option$")
	public void click_on_lower_banner_partners_TechnologyPartners_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4494']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Technology partners - Resilientplc$")
	public void verify_page_title_partners_TechnologyPartners_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Technology partners • Resilientplc" );
			Thread.sleep(3000);
		}

	@When("^I click on Lower - Banner - aboutus - Overview - Option$")
	public void click_on_lower_banner_aboutus_Overview_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4588']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles About us - Resilientplc$")
	public void verify_page_title_aboutus_Overview_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "About us • Resilientplc" );
			Thread.sleep(3000);
		}
	
	@When("^I click on Lower - Banner - aboutus - Careers - Option$")
	public void click_on_lower_banner_aboutus_Careers_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4590']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Careers - Resilientplc$")
	public void verify_page_title_aboutus_Careers_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Careers • Resilientplc" );
			Thread.sleep(3000);
		}

	@When("^I click on Lower - Banner - aboutus - Management - Option$")
	public void click_on_lower_banner_aboutus_Management_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4591']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Management - Resilientplc$")
	public void verify_page_title_aboutus_Management_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Management • Resilientplc" );
			Thread.sleep(3000);
		}

	@When("^I click on Lower - Banner - aboutus - Social responsibility - Option$")
	public void click_on_lower_banner_aboutus_SocialResponsibility_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4592']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles Social responsibility - Resilientplc$")
	public void verify_page_title_aboutus_SocialResponsibility_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Social responsibility • Resilientplc" );
			Thread.sleep(3000);
		}

	@When("^I click on Lower - Banner - aboutus - News - Option$")
	public void click_on_lower_banner_aboutus_News_option() throws Throwable
	{
			Actions act=new Actions(driver);
			WebElement element = driver.findElement(By.xpath(".//*[@id='menu-item-4589']/a"));
			act.moveToElement(element).build().perform();
			Thread.sleep(3000);
			element.click();
	}
	
	@Then("^I am taken to the page that titles News - Resilientplc$")
	public void verify_page_title_aboutus_News_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "News • Resilientplc" );
			Thread.sleep(3000);
		}

	
	// Main Page - File Menu - Solutions - Options
	
	@When("^I click on File Menue - Solutions - Overview - Option$")
	public void click_on_file_menu_solutions_Overview_option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");	  
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4367']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4367']/a"))).click();
		  	Thread.sleep(3000);
	}
	

	@When("^I click on File Menue - Solutions - Two Numbers One Mobile - Option$")
	public void click_on_file_menu_solutions_twoNumbersOnceMobile_option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2880']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2880']/a"))).click();
		  	Thread.sleep(3000);
	}
	
	@When("^I click on File Menue - Solutions - Call Recording - Option$")
	public void Click_on_File_Menu_Solutions_CallRecording_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2970']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2970']/a"))).click();
		  	Thread.sleep(3000);
	}	
	
	@When("^I click on File Menue - Solutions - Face To Face Recording - Option$")
	public void Click_on_File_Menu_Solutions_FaceToFaceRecording_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4629']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4629']/a"))).click();
		  	Thread.sleep(3000);
	}	

	@When("^I click on File Menue - Solutions - Office Moves - Option$")
	public void Click_on_File_Menu_Solutions_OfficeMoves_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-1820']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-1820']/a"))).click();
		  	Thread.sleep(3000);
	}	
	
	@When("^I click on File Menue - Solutions - Business Continuity$")
	public void Click_on_File_Menu_Solutions_BusinessContinuity_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4516']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4516']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-324']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-324']/a"))).click();
		  	Thread.sleep(3000);
	}	


	// Main Page - File Menu - Products - Options
	
	@When("^I click on File Menue - Products - Overview - Option$")
	public void Click_on_File_Menu_Products_Overview_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4044']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4044']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menue - Products - Smartnumbers Mobile - Option$")
	public void Click_on_File_Menu_Products_SmartnumbersMobile_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-396']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-396']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menue - Products - Smartnumbers Call Recording - Option$")
	public void Click_on_File_Menu_Products_SmartnumbersCallRecording_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4584']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4584']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menue - Products - Smartnumbers Face To Face Recording - Option$")
	public void Click_on_File_Menu_Products_SmartnumbersFaceToFaceRecording_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4568']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4568']/a"))).click();
		  	Thread.sleep(3000);	
	}

	@When("^I click on File Menue - Products - Smartnumbers Control - Option$")
	public void Click_on_File_Menu_Products_SmartnumbersControl_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4518']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4518']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-804']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-804']/a"))).click();
		  	Thread.sleep(3000);
	}


	// Main Page - File Menu - About Us - Options

	@When("^I click on File Menu - aboutus - Overview - Option$")
	public void Click_on_File_Menu_AboutUs_Overview_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	  
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4523']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4523']/a"))).click();
		  	Thread.sleep(3000);

	}

	@When("^I click on File Menu - aboutus - Careers - Option$")
	public void Click_on_File_Menu_AboutUs_Careers_Option() throws Throwable
	{
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4149']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4149']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menu - aboutus - Management - Option$")
	public void Click_on_File_Menu_AboutUs_Management_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4150']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4150']/a"))).click();
		  	Thread.sleep(3000);

	}

	@When("^I click on File Menu - aboutus - Social responsibility - Option$")
	public void Click_on_File_Menu_AboutUs_SocialResposibility_Option() throws Throwable
	{
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4148']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4148']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menu - aboutus - News - Option$")
	public void Click_on_File_Menu_AboutUs_News_Option() throws Throwable
	{
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-2382']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-2382']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menu - aboutus - Blog - Option$")
	public void Click_on_File_Menu_AboutUs_Blog_Option() throws Throwable
	{
		  	WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4520']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4520']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-5619']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-5619']/a"))).click();
		  	Thread.sleep(3000);

	}

	@Then("^I am taken to the page that titles Blog Archives - Resilientplc$")
	public void verify_page_title_aboutus_BlogArchives_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Blog Archives • Resilientplc" );
			Thread.sleep(3000);
		}

	

	// Main Page - File Menu - Partners - Options
	
	@When("^I click on File Menue - Partners - Overview - Option$")
	public void Click_on_File_Menu_Partners_Overview_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4229']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4229']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menue - Partners - Distribution Partners - Option$")
	public void Click_on_File_Menu_Partners_DistributionPartners_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath("//*[@id='menu-item-4264']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu-item-4264']/a"))).click();
		  	Thread.sleep(3000);
	}

	@When("^I click on File Menue - Partners - Technology Partners - Option$")
	public void Click_on_File_Menu_Partners_TechnologyPartners_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
		  	movetoElmentXpath(".//*[@id='menu-item-4519']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4519']/a"))).click();
		  	movetoElmentXpath(".//*[@id='menu-item-4228']/a");
		  	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-4228']/a"))).click();
		  	Thread.sleep(3000);
	}	
	
	

	// Main Page - File Menu - Resources - Options

	@When("^I click on File Menue - Resources - Option$")
	public void Click_on_File_Menu_Resources_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
			  	  
			movetoElmentXpath(".//*[@id='menu-item-205']/a");
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-205']/a"))).click();

	}

	@Then("^I am taken to the page that titles Resources - smartnumbers$")
	public void verify_page_title_Resources_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Resources • smartnumbers" );
			Thread.sleep(3000);
		}

	// Main Page - File Menu - Customers - Options

	@When("^I click on File Menu - Customers - Option$")
	public void Click_on_File_Menu_Customers_Option() throws Throwable
	{
			WebDriverWait wd = new WebDriverWait(driver, 30);
			  	  
			movetoElmentXpath(".//*[@id='menu-item-206']/a");
			wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-item-206']/a"))).click();

	}

	@Then("^I am taken to the page that titles Resilient plc case studies$")
	public void verify_page_title_Customers_option() throws Throwable
		{	
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, "Resilient plc case studies" );
			Thread.sleep(3000);
		}


	
	// Main Page - Smartnumbers Business Services - Options


	@When("^I click on Smartnumbers Business Services - Two Numbers One Mobile - Option$")
	public void MainPage_SmartnumbersBusinessServices_Click_TwoNumbersOneMobile() throws InterruptedException
			{
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[1]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			}
	
	@When("^I click on Smartnumbers Business Services - Call Recording - Option$")
	public void MainPage_SmartnumbersBusinessServices_Click_CallRecording() throws InterruptedException
			{  
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[2]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			}
	
	@When("^I click on Smartnumbers Business Services - Face To Face Recording - Option$")
	public void MainPage_SmartnumbersBusinessServices_Click_FaceToFaceRecording() throws InterruptedException
			{
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[3]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			}
	
	@When("^I click on Smartnumbers Business Services - Business Continuity - Option$")
	public void MainPage_SmartnumbersBusinessServices_Click__BusinessContinuity() throws InterruptedException
			{	
			  movetoElmentXpathAndClick(".//*[@id='post-4291']/div/div[2]/div[2]/div[4]/div/div/div[1]/a/img");
			  Thread.sleep(3000);
			}


	// Resource Page - All - Options
	
	 
	  @When("^I click on File Menu - Resources - All - Top_5_Benifits_of_Smartnumbers_for_FixedLlineTtelephony - Option$")
	  public void ResourcesPage_Click_Top_5_Benifits_of_Smartnumbers_for_FixedLlineTtelephony() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5789"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles Top 5 benefits of smartnumbers for fixed-line telephony - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Top_5_Benifits_of_Smartnumbers_for_FixedLlineTtelephony() throws Throwable
		{	
		  verifyPageTitle("Top 5 benefits of smartnumbers for fixed-line telephony • Resilientplc");	
		}

	  @When("^I click on File Menu - Resources - All - How_Smartnumbers_Puts_You_In_Control_of_Your_Communications - Option$")
	  public void ResourcesPage_Click_How_Smartnumbers_Puts_You_In_Control_of_Your_Communications() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5758"))).click();
		  Thread.sleep(3000);  
	  }
	  
	  @Then("^I am taken to the page that titles How smartnumbers puts you in control of your communications - Resilientplc$")
	  public void Verify_ResourcesPage_Click_How_Smartnumbers_Puts_You_In_Control_of_Your_Communications() throws Throwable
		{	
		  verifyPageTitle("How smartnumbers puts you in control of your communications • Resilientplc");	
		}

	  
	  @When("^I click on File Menu - Resources - All - Recording_Conversations_Under_Mifid_a_Quick_Guide_To_Compliance - Option$")
	  public void ResourcesPage_Click_Recording_Conversations_Under_Mifid_a_Quick_Guide_To_Compliance() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5736"))).click();
		  Thread.sleep(3000); 
	  }
	  
	  @Then("^I am taken to the page that titles Recording conversations under MiFID II: a quick guide to compliance - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Recording_Conversations_Under_Mifid_a_Quick_Guide_To_Compliance() throws Throwable
		{	
		  verifyPageTitle("Recording conversations under MiFID II: a quick guide to compliance • Resilientplc");	
		}

	  @When("^I click on File Menu - Resources - All - Face_To_Face_Recording_for_Financial_Services_a_Growing_Imperative - Option$")
	  public void ResourcesPage_Click_Face_To_Face_Recording_for_Financial_Services_a_Growing_Imperative() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5574"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that titles Face to face recording for financial services: a growing imperative - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Face_To_Face_Recording_for_Financial_Services_a_Growing_Imperative() throws Throwable
		{	
		  verifyPageTitle("Face to face recording for financial services: a growing imperative • Resilientplc");	
		} 
	  @When("^I click on File Menu - Resources - All - One_Public_Estate_Maintaining_Business_Continuity_During_Estate_Rationalisation - Option$")
	  public void ResourcesPage_Click_One_Public_Estate_Maintaining_Business_Continuity_During_Estate_Rationalisation() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5571"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles One Public Estate: maintaining business continuity during estate rationalisation - Resilientplc$")
	  public void Verify_ResourcesPage_Click_One_Public_Estate_Maintaining_Business_Continuity_During_Estate_Rationalisation() throws Throwable
		{	
		  verifyPageTitle("One Public Estate: maintaining business continuity during estate rationalisation • Resilientplc");	
		}
	  
	  @When("^I click on File Menu - Resources - All - Five_Questions_To_Ask_When_Moving_Your_Telecoms_To_New_Premises - Option$")
	  public void ResourcesPage_Click_Five_Questions_To_Ask_When_Moving_Your_Telecoms_To_New_Premises() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5436"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles 5 questions to ask when moving your telecoms to new premises - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Five_Questions_To_Ask_When_Moving_Your_Telecoms_To_New_Premises() throws Throwable
		{	
		  verifyPageTitle("5 questions to ask when moving your telecoms to new premises • Resilientplc");
		}

		
	  @When("^I click on File Menu - Resources - All - One_Public_Estate_for_Number_Management_Success_Stories - Option$")
	  public void ResourcesPage_Click_One_Public_Estate_for_Number_Management_Success_Stories() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5427"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles One Public Estate four number management success stories - Resilientplc$")
	  public void Verify_ResourcesPage_Click_One_Public_Estate_for_Number_Management_Success_Stories() throws Throwable
		{	
		  verifyPageTitle("One Public Estate: 4 number management success stories • Resilientplc");	
		}
	  
	  @When("^I click on File Menu - Resources - All - Keeping_You_In_Control_During_Sip_Migration - Option$")
	  public void ResourcesPage_Click_Keeping_You_In_Control_During_Sip_Migration() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5403"))).click();
		  Thread.sleep(3000);
	  }  
	  
	  @Then("^I am taken to the page that titles Keeping you in control during SIP migration - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Keeping_You_In_Control_During_Sip_Migration() throws Throwable
		{	
		  verifyPageTitle("Keeping you in control during SIP migration • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Mifid_Ebook - Option$")
	  public void ResourcesPage_Click_Mifid_Ebook() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-5339"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles MiFID II eBook - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Mifid_Ebook() throws Throwable
		{	
		  verifyPageTitle("MiFID II eBook • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Smartnumbers_Mobile_Datasheet - Option$")
	  public void ResourcesPage_Click_Smartnumbers_Mobile_Datasheet() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4738"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that titles smartnumbers mobile datasheet - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Smartnumbers_Mobile_Datasheet() throws Throwable
		{	
		  verifyPageTitle("smartnumbers mobile datasheet • Resilientplc");	
		}  

	  @When("^I click on File Menu - ResourcesPage - All - Smartnumbers_Call_Recording_Datasheet - Option$")
	   public void ResourcesPage_Click_Smartnumbers_Call_Recording_Datasheet() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4577"))).click();
		  Thread.sleep(3000);
	  }  

	  @Then("^I am taken to the page that titles smartnumbers call recording datasheet - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Smartnumbers_Call_Recording_Datasheet() throws Throwable
		{	
		  verifyPageTitle("smartnumbers call recording datasheet • Resilientplc");	
		}
	  
	  @When("^I click on File Menu - ResourcesPage - All - Smartnumbers_Face_To_Face_Recording_Datasheet - Option$")	
	  public void ResourcesPage_Click_Smartnumbers_Face_To_Face_Recording_Datasheet() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-4444"))).click();
		  Thread.sleep(3000);
	  }
	 
	  @Then("^I am taken to the page that titles smartnumbers face-to-face recording datasheet - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Smartnumbers_Face_To_Face_Recording_Datasheet() throws Throwable
		{	
		  verifyPageTitle("smartnumbers face-to-face recording datasheet • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Legal_Sector_Industry_Brief - Option$")
	  public void ResourcesPage_Click_Legal_Sector_Industry_Brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3711"))).click();
		  Thread.sleep(3000);
	  }
	 
	  @Then("^I am taken to the page that titles A new approach to mobile call recording - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Legal_Sector_Industry_Brief() throws Throwable
		{	
		  verifyPageTitle("A new approach to mobile call recording • Resilientplc");	
		}
	 
	  @When("^I click on File Menu - ResourcesPage - All - industry_brief - Option$")
	  public void public_sector_industry_brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3635"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that titles Legal sector industry brief - Resilientplc$")
	  public void Verify_public_sector_industry_brief() throws Throwable
		{	
		  verifyPageTitle("Legal sector industry brief • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - The_Enterprise_Mobile_For_Sales_Organisations - Option$")
	  public void ResourcesPage_Click_The_Enterprise_Mobile_For_Sales_Organisations() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3631"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that Legal titles Public sector industry brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_The_Enterprise_Mobile_For_Sales_Organisations() throws Throwable
		{	
		  verifyPageTitle("Public sector industry brief • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Mifid_Smart_Guide_To_Mobile_Call_Recording - Option$")
	  public void ResourcesPage_Click_Mifid_Smart_Guide_To_Mobile_Call_Recording() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3628"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that Legal titles The enterprise mobile for sales organisations - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Mifid_Smart_Guide_To_Mobile_Call_Recording() throws Throwable
		{	
		  verifyPageTitle("The enterprise mobile for sales organisations • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Smart_Guide_To_The_Costs_And_Risks_of_Allowing_Business_And_Personal_Calls_On_One_Phone - Option$")
	  public void ResourcesPage_Click_Smart_Guide_To_The_Costs_And_Risks_of_Allowing_Business_And_Personal_Calls_On_One_Phone() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3623"))).click();
		  Thread.sleep(3000);
	  }
	 
	  @Then("^I am taken to the page that Legal titles MiFID II: smart guide to mobile call recording - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Smart_Guide_To_The_Costs_And_Risks_of_Allowing_Business_And_Personal_Calls_On_One_Phone() throws Throwable
		{	
		  verifyPageTitle("MiFID II: smart guide to mobile call recording • Resilientplc");	
		}
	 
	  @When("^I click on File Menu - ResourcesPage - All - Smartnumbers_Control_Datasheet - Option$")
	  public void ResourcesPage_Click_Smartnumbers_Control_Datasheet() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3617"))).click();
		  Thread.sleep(3000);
	  }
	 
	  @Then("^I am taken to the page that Legal titles smartnumbers control datasheet - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Smartnumbers_Control_Datasheet() throws Throwable
		{	
		  verifyPageTitle("smartnumbers control datasheet • Resilientplc");	
		}

	 
	  @When("^I click on File Menu - ResourcesPage - All - De_Risk_Office_Moves_Solution_Brief - Option$")
	  public void ResourcesPage_Click_De_Risk_Office_Moves_Solution_Brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3610"))).click();
		  Thread.sleep(3000);
	  }
	  
	  @Then("^I am taken to the page that Legal titles De-risk office moves solution brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_De_Risk_Office_Moves_Solution_Brief() throws Throwable
		{	
		  verifyPageTitle("De-risk office moves solution brief • Resilientplc");	
		}
	 
	  @When("^I click on File Menu - ResourcesPage - All - _Protect_Critical_Numbers_Solution_Brief - Option$")
	  public void ResourcesPage_Click_Protect_Critical_Numbers_Solution_Brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3605"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that Legal titles Protect critical numbers solution brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Protect_Critical_Numbers_Solution_Brief() throws Throwable
		{	
		  verifyPageTitle("Protect critical numbers solution brief • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Mobile_Call_Recording_Solution_brief - Option$")
	  public void ResourcesPage_Click_Compliant_Mobile_Call_Recording_Solution_brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3599"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that Legal titles Compliant mobile call recording solution brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Compliant_Mobile_Call_Recording_Solution_brief() throws Throwable
		{	
		  verifyPageTitle("Compliant mobile call recording solution brief • Resilientplc");	
		}  

	  @When("^I click on File Menu - ResourcesPage - All - Mobile_Call_Recording_Ebook - Option$")
	  public void ResourcesPage_Click_Mobile_Call_Recording_Ebook() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3591"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that Legal titles Mobile call recording eBook - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Mobile_Call_Recording_Ebook() throws Throwable
		{	
		  verifyPageTitle("Mobile call recording eBook • Resilientplc");
		}

	  @When("^I click on File Menu - ResourcesPage - All - Byod_Voice_Made_Easy_Solution_Brief - Option$")
	  public void ResourcesPage_Click_Byod_Voice_Made_Easy_Solution_Brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3588"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that Legal titles BYOD voice made easy solution brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Byod_Voice_Made_Easy_Solution_Brief() throws Throwable
		{	
		  verifyPageTitle("BYOD voice made easy solution brief • Resilientplc");	
		}

	  @When("^I click on File Menu - ResourcesPage - All - Byod_Voice_The_Lost_Piece_of_The_Byod_Puzzle - Option$")
	  public void ResourcesPage_Click_Byod_Voice_The_Lost_Piece_of_The_Byod_Puzzle() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3579"))).click();
		  Thread.sleep(3000);
	  }

	  @Then("^I am taken to the page that Legal titles BYOD voice - The lost piece of the BYOD puzzle - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Byod_Voice_The_Lost_Piece_of_The_Byod_Puzzle() throws Throwable
		{	
		  verifyPageTitle("BYOD voice - The lost piece of the BYOD puzzle • Resilientplc");
		}
	  
	  @When("^I click on File Menu - ResourcesPage - All - Sustainability_And_The_Corporate_Mobile_Ebook - Option$")
	  public void ResourcesPage_Click_Sustainability_And_The_Corporate_Mobile_Ebook() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3575"))).click();
		  Thread.sleep(3000);
	  }
	 
	  @Then("^I am taken to the page that Legal titles Sustainability and the corporate mobile eBook - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Sustainability_And_The_Corporate_Mobile_Ebook() throws Throwable
		{	
		  verifyPageTitle("Sustainability and the corporate mobile eBook • Resilientplc");
		}

	  @When("^I click on File Menu - ResourcesPage - All - Insurance_Industry_Brief - Option$")
	  public void ResourcesPage_Click_Insurance_Industry_Brief() throws InterruptedException 
	  {
		  WebDriverWait wd = new WebDriverWait(driver, 30);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-205"))).click();
		  Thread.sleep(3000);
		  wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("post-3563"))).click();
		  Thread.sleep(3000);
	  }
	  @Then("^I am taken to the page that Legal titles Insurance industry brief - Resilientplc$")
	  public void Verify_ResourcesPage_Click_Insurance_Industry_Brief() throws Throwable
		{	
		  verifyPageTitle("Insurance industry brief • Resilientplc");
		} 

	

	
	
	




	
	
	
	// Common methods
	
	  public void movetoElmentXpath(String elementXpath)
	  {
		  Actions act=new Actions(driver);
		  WebElement element = driver.findElement(By.xpath(elementXpath));
		  act.moveToElement(element).build().perform();
	  }
	

	  public void movetoElmentXpathAndClick(String elementXpath) throws InterruptedException
	  {
		
		  Actions act=new Actions(driver);
		  WebElement element = driver.findElement(By.xpath(elementXpath));
		  act.moveToElement(element).build().perform();
		  Thread.sleep(3000);
		  element.click();
	  }
	  
	  public void verifyPageTitle(String expectedTitle) throws InterruptedException
	  {
			String actualTitle = null;
			actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			Thread.sleep(3000);
	  }
}
