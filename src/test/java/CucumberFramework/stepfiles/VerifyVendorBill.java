package CucumberFramework.stepfiles;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import CucumberFramework.driverClass.BroswerDriverFactory;
import CucumberFramework.runnerClass.MainRunner;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.junit.*;;


public class VerifyVendorBill extends BroswerDriverFactory{
	

	public VerifyVendorBill(String browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}




	By email_text = By.xpath("");
	By password_text_box = By.xpath("");
	By login_button = By.xpath("");
	By entripy_logo_first_page = By.xpath("");
	By sign_in_label = By.xpath("");
	By next_button = By.xpath("");
	By enter_password_label = By.xpath("");
	By sign_in_button = By.xpath("");
	By vendor_billing_job_title = By.xpath("");
	By other_question_button = By.xpath("");
	By new_vendor_billing_page_title = By.xpath("");
	
	By new_vendor_billing_button = By.xpath("");
	
	java.util.List<WebElement> titles = new ArrayList<>();
	static WebDriver driver;
	static Properties prop = new Properties();
	
	@Before("@first")
	public static void initializeDriver(){

		InputStream input = null;
		try {
			input = new FileInputStream("C:\\Worspace-Interview\\JustEatTesting\\src\\test\\java\\CucumberFramework\\Resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

           // Properties prop = new Properties();
            try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(prop.getProperty("browser"));
            String broswer_name = prop.getProperty("browser");
            String URL = prop.getProperty("url");
            
            BroswerDriverFactory factory = new BroswerDriverFactory(broswer_name);
            driver = factory.createDriver();
            driver.manage().window().maximize();
            driver.get(URL);
			
	
	}
	
	@Given("^log in page is loaded$")
	public void log_in_page_is_loaded() throws Throwable {
		
		//get the title into  string variable to verify
		if(driver.findElement(entripy_logo_first_page).isDisplayed())
		{
		String entripy_title = driver.findElement(entripy_logo_first_page).getText();
			if(entripy_title.equals(""))
			{
				System.out.println("title is displayed as expected");  // we can use log 4j for loggin instead of sysout 
			}
		}
		else
		{
			System.out.println("title is not displayed as expected");
		}
			
	    
	}

	@When("^Log in button is present$")
	public void log_in_button_is_present() throws Throwable {
		//click the log in button
		
		if(driver.findElement(login_button).isDisplayed())
		driver.findElement(login_button).click();
		
		else
			System.out.println("element not found");
		
	    
	}

	@Then("^goto enter email address page$")
	public void goto_enter_email_address_page() throws Throwable {
		
		if(driver.findElement(email_text).isDisplayed())
		{
		driver.findElement(email_text).sendKeys(prop.getProperty("browser"));
		driver.findElement(next_button).click();
		}
		else
		{
			System.out.println("text field not displayed");
		}
	    
	}

	@Then("^goto enter password field$")
	public void goto_enter_password_field() throws Throwable {
		
		if(driver.findElement(enter_password_label).isDisplayed())
		{
			System.out.println("on enter password page");
			if(driver.findElement(password_text_box).isDisplayed())
			{
				driver.findElement(password_text_box).sendKeys(prop.getProperty("password"));
			}
		}
		{
			System.out.println("not in log in page");
		}
		
	   
	}

	@Then("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
		
		if(driver.findElement(sign_in_button).isDisplayed())
		{
			driver.findElement(sign_in_button).click();
		}
		else
		{
			System.out.println("sign in page is not displayed");
		}
			
	   
	}

	@Given("^Vendor billing page is displayed$")
	public void vendor_billing_page_is_displayed() throws Throwable {
		
		//check all the properties of vendor billing page to make sure it is displayed correctly and all the properties are there
	   
	}

	@Then("^verify the title and tabs in the vendor billing page$")
	public void verify_the_title_and_tabs_in_the_vendor_billing_page() throws Throwable {
		
		//verify all the titles and tabs at the left side properties
	   
	}

	@Then("^verify the table with past import jobs$")
	public void verify_the_table_with_past_import_jobs() throws Throwable {
		
		//verify all the previous import statements
	   
	}

	@When("^user is on the vendor billing page$")
	public void user_is_on_the_vendor_billing_page() throws Throwable {
		
		
	   
	}

	@Given("^create new vendor billing job button is present$")
	public void create_new_vendor_billing_job_button_is_present() throws Throwable {
		
		if(driver.findElement(new_vendor_billing_button).isDisplayed())
		{
			System.out.println();
		}
		else
		{
			System.out.println();
		}
	   
	}

	@Then("^click the create new vendor billing job button$")
	public void click_the_create_new_vendor_billing_job_button() throws Throwable {
		
		driver.findElement(new_vendor_billing_button).click();
	   
	}

	@Then("^user redirect to the create new vendor billing job page$")
	public void user_redirect_to_the_create_new_vendor_billing_job_page() throws Throwable {
		
		// code to verify the new vendor billing page by verifying the title etc
	   
	}

	
	
	
	@After("@third")
	public static void tearDown(){
		
		driver.quit();
		driver = null;
	

	}

}
