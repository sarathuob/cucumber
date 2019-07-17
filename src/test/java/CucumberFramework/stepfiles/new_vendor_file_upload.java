package CucumberFramework.stepfiles;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CucumberFramework.driverClass.BroswerDriverFactory;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class new_vendor_file_upload extends BroswerDriverFactory{
	
	WebDriver driver = createDriver();
	
	public new_vendor_file_upload(String browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	By vendor_files_label = By.xpath("");
	By vendor_file_txt_box = By.xpath("");
	By upload_button = By.xpath("");
	By save_button = By.xpath("");
	By invoice_table_column_values = By.xpath("");
	By PO_table_column_values = By.xpath("");
	By total_table_column_values = By.xpath("");
	By ignore_table_column_values = By.xpath("");
	
	@When("^user is on the create new vendor billing job$")
	public void user_is_on_the_create_new_vendor_billing_job() throws Throwable {
		
		//user verification of vendor new page
		
		
	   
	}

	@When("^Vendor name text box and vendor file upload text box is displayed$")
	public void vendor_name_text_box_and_vendor_file_upload_text_box_is_displayed() throws Throwable {
		
		//use send keys to send the location of the file to upload using text box, 
		if(driver.findElement(vendor_file_txt_box).isDisplayed())
			System.out.println("text box is displayed");
		else
			System.out.println("text box not displayed");
		
	   
	}

	@Then("^user select the file to upload$")
	public void user_select_the_file_to_upload() throws Throwable {
		
		driver.findElement(vendor_file_txt_box).sendKeys("path to the file ");
	    
	}

	@Then("^user click the upload button$")
	public void user_click_the_upload_button() throws Throwable {
		
		if(driver.findElement(upload_button).isDisplayed())
		driver.findElement(upload_button).click();
		else
			System.out.println("upload button not present");
	   
	}

	@When("^uploaded data from the file is displayed as table data$")
	public void uploaded_data_from_the_file_is_displayed_as_table_data() throws Throwable {
		
		//code to verify if the data is displayed in table 
	    
	}

	@Then("^verify all invoice numbers format$")
	public void verify_all_invoice_numbers_format() throws Throwable {
		
		java.util.List<WebElement> invoices_from_table = new ArrayList<>();
		
		//verify if invoice are contain only alpha numeric characters
		
		invoices_from_table = driver.findElements(invoice_table_column_values);
		
		
		   boolean alpha_num = isAlphaNumeric(invoices_from_table);
		   
		   if(alpha_num)
			   System.out.println("oly alpha numeric");
		   else
			   System.out.println("not alpha numeric");
			
			
		}
		

	@Then("^verify PO numbers contains only alpha numeric numbers$")
	public void verify_PO_numbers_contains_only_alpha_numeric_numbers() throws Throwable {
	    
		java.util.List<WebElement> po_boxes = new ArrayList<>();
		
		//verify if invoice are contain only alpha numeric characters
		
		po_boxes = driver.findElements(PO_table_column_values);
		
		
		   boolean alpha_num = isAlphaNumeric(po_boxes);
		   
		   if(alpha_num)
			   System.out.println("only alpha numeric");
		   else
			   System.out.println("not alpha numeric");
	}

	@Then("^verify invoice amount only have positive numbers$")
	public void verify_invoice_amount_only_have_positive_numbers() throws Throwable {
		
		java.util.List<WebElement> invoices = new ArrayList<>();
		
		//verify if invoice are contain only alpha numeric characters
		
		invoices = driver.findElements(PO_table_column_values);
		
		
		   boolean num = isNumber(invoices);
		   
		   if(num)
			   System.out.println("only numbers");
		   else
			   System.out.println("only numbers");
	    
	}

	


	// alpha numeric check function to return true or false 
	public static boolean isAlphaNumeric(java.util.List<WebElement> numbers) {
		
		
		
		for (WebElement var : numbers) 
		{ 
			if(!var.getText().matches("^[a-zA-Z0-9]*$"))
				  return false;
		}
		return true;
	}
	
	private boolean isNumber(java.util.List<WebElement> numbers) {

		for (WebElement var : numbers) 
		{ 
			if(!var.getText().matches("^\\d+$"))
				  return false;
		}
		return true;
		
		
	}
	
}
