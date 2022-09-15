package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.RegisterPageObj;
import pageObject.ResearchPageObj;
import managers.FileReaderManager;

public class RegisterStepDef {
	
	
	WebDriver driver;
	RegisterPageObj registerPageObj;
	
	@Given("^open  website application$")
	public void open_website_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	}
	
	
	@When("^access the registration form$")
	public void access_the_registration_form() throws Throwable {
		registerPageObj=new RegisterPageObj(driver);
		registerPageObj.accesForm(); 
	}
	@When("^enter login$")
	public void enter_login() throws Throwable {
		registerPageObj.enterUsername();
	}

	@When("^enter pwd$")
	public void enter_pwd() throws Throwable {
		registerPageObj.enterPassword();
	}


	@When("^enter email$")
	public void enter_email() throws Throwable {
		registerPageObj.enterEmail();
	}

	@When("^confirm password$")
	public void confirm_password() throws Throwable {
		registerPageObj.enterconfirmPassword();
	}

	@Then("^click to validate registration button$")
	public void click_to_validate_registration_button() throws Throwable {
		registerPageObj=new RegisterPageObj(driver);
		registerPageObj.validateAccount();
	}

	@Then("^home should be displayed$")
	public void home_should_be_displayed() throws Throwable {
		registerPageObj.checkHome();
	}

	@When("^enter an existing user$")
	public void enter_an_existing_user() throws Throwable {
		registerPageObj.enteruser();
	}

	@Then("^error msg is displayed$")
	public void error_msg_is_displayed() throws Throwable {
		registerPageObj.checkid();
	}
	@When("^enter new login$")
	public void enter_new_login() throws Throwable {
		registerPageObj.newlogin();
	}

	@When("^enter new pwd$")
	public void enter_new_pwd() throws Throwable {
		registerPageObj.newpwd();
	}

	@When("^confirm new password$")
	public void confirm_new_password() throws Throwable {
		registerPageObj.newcpwd();
	}
	@When("^enter existing email$")
	public void enter_existing_email() throws Throwable {
		registerPageObj.existingemail();
		registerPageObj.validate();
		registerPageObj.checkemail();
	}
	
	@After
	public void quit() {
		driver.quit();
	}
}
