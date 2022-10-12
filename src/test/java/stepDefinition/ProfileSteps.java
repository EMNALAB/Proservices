package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SignInPageObj;
import pageObject.ProfilePageObj;

public class ProfileSteps {
	WebDriver driver;
	SignInPageObj signInPageObj;
	ProfilePageObj profilPageObj;
	
	@Given("^open app$")
	public void open_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/profile/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("^access my profile$")
	public void access_my_profile() throws Throwable {
		signInPageObj = new SignInPageObj(driver);
		profilPageObj = new ProfilePageObj(driver);
		signInPageObj.displaypopup();
		signInPageObj.enterLogin();
		signInPageObj.enterPwd();
		signInPageObj.validate();
		
	}

	@When("^click to upload button$")
	public void click_to_upload_button() throws Throwable {
		profilPageObj.accesProfile();
	}

	@When("^chose picture$")
	public void chose_picture() throws Throwable {
	    
	}

	@When("^click to save changes button$")
	public void click_to_save_changes_button() throws Throwable {
	    
	}

	@Then("^profile picture will be updated$")
	public void profile_picture_will_be_updated() throws Throwable {
	   
	}
	@When("^I click to avatar icon$")
	public void i_click_to_avatar_icon() throws Throwable {

	}

	@Then("^click on the delete button to delete the image$")
	public void click_on_the_delete_button_to_delete_the_image() throws Throwable {

	}

	@When("^I click to main icon$")
	public void i_click_to_main_icon() throws Throwable {

	}

	@When("^I fill the form with information \"([^\"]*)\" and rownumber (\\d+)$")
	public void i_fill_the_form_with_information_and_rownumber(String arg1, int arg2) throws Throwable {

	}

	@Then("^check confirmation \"([^\"]*)\"$")
	public void check_confirmation(String arg1) throws Throwable {

	}

	@When("^I click to password icon$")
	public void i_click_to_password_icon() throws Throwable {

	}

	@When("^Fill \"([^\"]*)\" and rownumber (\\d+)$")
	public void fill_and_rownumber(String arg1, int arg2) throws Throwable {

	}

	@When("^click to save button$")
	public void click_to_save_button() throws Throwable {

	}

	@Then("^check \"([^\"]*)\"$")
	public void check(String arg1) throws Throwable {

	}


	@After
	public void quit() throws InterruptedException {
		Thread.sleep(6);
		driver.quit();
	}
}
