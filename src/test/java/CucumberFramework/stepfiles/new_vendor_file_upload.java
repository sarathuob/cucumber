package CucumberFramework.stepfiles;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class new_vendor_file_upload {
	
	By vendor_files_label = By.xpath("");
	By vendor_file_txt_box = By.xpath("");
	By upload_button = By.xpath("");
	By save_button = By.xpath("");
	
	@When("^user is on the create new vendor billing job$")
	public void user_is_on_the_create_new_vendor_billing_job() throws Throwable {
		
		//user verification of vendor new page
	   
	}

	@When("^Vendor name text box and vendor file upload text box is displayed$")
	public void vendor_name_text_box_and_vendor_file_upload_text_box_is_displayed() throws Throwable {
		
		//use send keys to send the location of the file to upload using text box, 
		
		
	   
	}

	@Then("^user select the file to upload$")
	public void user_select_the_file_to_upload() throws Throwable {
	    
	}

	@Then("^user click the upload button$")
	public void user_click_the_upload_button() throws Throwable {
	   
	}

	@When("^uploaded data from the file is displayed as table data$")
	public void uploaded_data_from_the_file_is_displayed_as_table_data() throws Throwable {
	    
	}

	@Then("^verify all invoice numbers format$")
	public void verify_all_invoice_numbers_format() throws Throwable {
	    
	}

	@Then("^verify PO numbers contains only alpha numeric numbers$")
	public void verify_PO_numbers_contains_only_alpha_numeric_numbers() throws Throwable {
	    
	}

	@Then("^verify invoice amount only have positive numbers$")
	public void verify_invoice_amount_only_have_positive_numbers() throws Throwable {
	    
	}

}
