package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.FpObj;
import pageObject.SignInPageObj;

public class FpStepDef {
	
	WebDriver driver;
	FpObj fpobject;

	@Given("^I access the password reset page$")
	public void i_access_the_password_reset_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

	@When("^I enter an existing email address$")
	public void i_enter_an_existing_email_address() throws Throwable {
		fpobject = new FpObj(driver);
		//fpobject.accesform();
		//driver.navigate().to("https://mail.google.com/");
		driver.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S-2080187473%3A1663022952361813&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&hl=fr&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWpZ9pxynABgyzXbKIRrFp6TVA3ngkc4NvFgpTIeJEQW5_mLgOJiaca-MrMiEKp1Iy9J6oVxvA");
		fpobject.gmailcnx();
	}

	@When("^I click to Reset password button$")
	public void i_click_to_Reset_password_button() throws Throwable {
	   
	}

	@When("^A sending confirmation message is displayed$")
	public void a_sending_confirmation_message_is_displayed() throws Throwable {
	    
	}

	@Then("^I access to my mailbox$")
	public void i_access_to_my_mailbox() throws Throwable {
	 
	}

	@Then("^I check if I have received an email to reset my password$")
	public void i_check_if_I_have_received_an_email_to_reset_my_password() throws Throwable {
	   
	}

	@When("^I enter an email(\\d+)@yahoo\\.fr address that does not exist or with an incorrect format$")
	public void i_enter_an_email_yahoo_fr_address_that_does_not_exist_or_with_an_incorrect_format(int arg1) throws Throwable {
	    
	}

	@Then("^An error message should be displayed$")
	public void an_error_message_should_be_displayed() throws Throwable {
	   
	}

	@When("^I enter an abc(\\d+)\\.com address that does not exist or with an incorrect format$")
	public void i_enter_an_abc_com_address_that_does_not_exist_or_with_an_incorrect_format(int arg1) throws Throwable {
	    
	}

	@When("^I enter an automation@ address that does not exist or with an incorrect format$")
	public void i_enter_an_automation_address_that_does_not_exist_or_with_an_incorrect_format() throws Throwable {
	    
	}
	@After
	public void quit() {
		driver.quit();
	}

}
