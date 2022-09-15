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
import pageObject.DevisPageObj;

public class DevisStepDef {

	WebDriver driver;
	DevisPageObj devisPageObj;
	
	
	@Given("^I display the form$")
	public void i_display_the_form() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/demander-un-devis/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@When("^I enter full name$")
	public void i_enter_full_name() throws Throwable {
		devisPageObj = new DevisPageObj(driver);
		devisPageObj.enterFullname();
	}

	@When("^I enter email$")
	public void i_enter_email() throws Throwable {
		devisPageObj.enteremail();
	}

	@When("^I enter my phone number$")
	public void i_enter_my_phone_number() throws Throwable {
		devisPageObj.enterphone();
	}

	@When("^I choose the training$")
	public void i_choose_the_training() throws Throwable {
	    
	}

	@When("^I choose region$")
	public void i_choose_region() throws Throwable {
		devisPageObj.chooseR();  
	}

	@When("^I answer question$")
	public void i_answer_question() throws Throwable {
	   
	}

	@When("^I choose between compagny or particular$")
	public void i_choose_between_compagny_or_particular() throws Throwable {
	    
	}

	@When("^I select my choice$")
	public void i_select_my_choice() throws Throwable {
	    
	}

	@When("^I write a msg$")
	public void i_write_a_msg() throws Throwable {
	    
	}

	@When("^I click to send button$")
	public void i_click_to_send_button() throws Throwable {
	   
	}

	@Then("^Confirmation message should appear$")
	public void confirmation_message_should_appear() throws Throwable {
	    
	}

	@After
	public void quit() {
		driver.quit();
	}
}
