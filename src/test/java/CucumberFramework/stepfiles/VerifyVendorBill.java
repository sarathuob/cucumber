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
import org.junit.*;;


public class VerifyVendorBill {
	
	
	By title = By.xpath("//span[@class='is-visuallyHidden']");
	By input_box = By.xpath("//input[@name='postcode']");
	By search_button = By.xpath("//button[@data-test-id='find-restaurants-button']");
	By header_title = By.xpath("//h1[@class='c-contentHeader-title']");
	By sub_title = By.xpath("//span[@class='c-contentHeader-subTitle']");
	By all_rest_titles = By.xpath("//h3[@class='c-exp-listing-item-title']");
	By main_header_in_hotel_page = By.xpath("//h1[@class='name']");
	By help_button = By.xpath("//li[@class=\"supportLink\"]/a");
	By help_page_title = By.xpath("//div[@class='c-order-customisation--login']/h1");
	By login_button = By.xpath("//div[@class='actions-container']/a");
	By other_question_button = By.xpath("//a[@data-ft='other-questions-link']");
	java.util.List<WebElement> titles = new ArrayList<>();
	public static WebDriver driver;
	
	
	@Before("@first")
	public static void initializeDriver(){

		InputStream input = null;
		try {
			input = new FileInputStream("C:\\Worspace-Interview\\JustEatTesting\\src\\test\\java\\CucumberFramework\\Resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

            Properties prop = new Properties();
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
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Log in button is present$")
	public void log_in_button_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^goto enter email address page$")
	public void goto_enter_email_address_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^goto enter password field$")
	public void goto_enter_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Vendor billing page is displayed$")
	public void vendor_billing_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify the title and tabs in the vendor billing page$")
	public void verify_the_title_and_tabs_in_the_vendor_billing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify the table with past import jobs$")
	public void verify_the_table_with_past_import_jobs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user is on the vendor billing page$")
	public void user_is_on_the_vendor_billing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^create new vendor billing job button is present$")
	public void create_new_vendor_billing_job_button_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click the create new vendor billing job button$")
	public void click_the_create_new_vendor_billing_job_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user redirect to the create new vendor billing job page$")
	public void user_redirect_to_the_create_new_vendor_billing_job_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user is on the create new vendor billing job$")
	public void user_is_on_the_create_new_vendor_billing_job() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Vendor name text box and vendor file upload text box is displayed$")
	public void vendor_name_text_box_and_vendor_file_upload_text_box_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user select the file to upload$")
	public void user_select_the_file_to_upload() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user click the upload button$")
	public void user_click_the_upload_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^uploaded data from the file is displayed as table data$")
	public void uploaded_data_from_the_file_is_displayed_as_table_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify all invoice numbers format$")
	public void verify_all_invoice_numbers_format() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify PO numbers contains only alpha numeric numbers$")
	public void verify_PO_numbers_contains_only_alpha_numeric_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify invoice amount only have positive numbers$")
	public void verify_invoice_amount_only_have_positive_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	@After("@third")
	public static void tearDown(){
		
		driver.quit();
		driver = null;
	

	}

}
