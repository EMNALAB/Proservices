package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SignInPageObj;


public class SingnInStepDef {
	WebDriver driver;
	SignInPageObj signInPageObj;
	
	
	@Given("open application")
	public void open_application() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("click on Login button")
	public void click_on_login_button() {
		signInPageObj = new SignInPageObj(driver);
		signInPageObj.displaypopup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("enter username")
	public void enter_username() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		signInPageObj.enterLogin();
		
	}

	@When("enter password")
	public void enter_password() {
		signInPageObj.enterPwd();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("click on connection button")
	public void click_on_connection_button() {
		signInPageObj.validate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		signInPageObj.checkHome();
	}
	
	@When("^enter invalidusername$")
	public void enter_invalidusername() throws Throwable {
		signInPageObj = new SignInPageObj(driver);  
		signInPageObj.enterIU();
	}

	@When("^enter invalidpassword$")
	public void enter_invalidpassword() throws Throwable {
		signInPageObj.invalidPwd();
	}

	@Then("^error msg should be displayed$")
	public void error_msg_should_be_displayed() throws Throwable {
		signInPageObj.errorMsg();
	}

}
