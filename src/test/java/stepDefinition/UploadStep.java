package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.SignInPageObj;
import pageObject.UploadPage;

public class UploadStep {
	WebDriver driver;
	SignInPageObj signInPageObj;
	UploadPage uploadPage;
	
	@Given("^open app$")
	public void open_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/profile/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("^access my profile$")
	public void access_my_profile() throws Throwable {
		signInPageObj = new SignInPageObj(driver);
		uploadPage = new UploadPage(driver);
		signInPageObj.displaypopup();
		signInPageObj.enterLogin();
		signInPageObj.enterPwd();
		signInPageObj.validate();
		
	}

	@When("^click to upload button$")
	public void click_to_upload_button() throws Throwable {
		uploadPage.accesProfile();
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

	@After
	public void quit() throws InterruptedException {
		Thread.sleep(6);
		driver.quit();
	}
}
