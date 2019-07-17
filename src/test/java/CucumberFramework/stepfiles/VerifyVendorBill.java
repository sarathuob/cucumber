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
	
	
	
	
	@After("@third")
	public static void tearDown(){
		
		driver.quit();
		driver = null;
	

	}

}
