package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ReviewPageObj;
import pageObject.SignInPageObj;
import managers.FileReaderManager;

public class ReviewStepDef {
	
	
	
	WebDriver driver;
	ReviewPageObj reviewPageObj;
	
	

	@Given("^authenticate$")
	public void authenticate() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		reviewPageObj = new ReviewPageObj(driver);
		reviewPageObj.authentification();
		driver.get("https://proservices-training-company.com/profile/");
	}

	@Given("^Access the profile$")
	public void access_the_profile() throws Throwable {
		driver.get("https://proservices-training-company.com/profile/");
		//reviewPageObj.accederProfil();
	}

	@When("^Click on the quiz link$")
	public void click_on_the_quiz_link() throws Throwable {
		reviewPageObj.firstQuizLink();
	}

	@When("^Quiz description  is displayed$")
	public void quiz_description_is_displayed() throws Throwable {
		reviewPageObj.firstCheck();
	}

	@When("^Access quiz details$")
	public void access_quiz_details() throws Throwable {
		reviewPageObj.secondQuizLink();
	}

	@When("^click on review quiz button$")
	public void click_on_review_quiz_button() throws Throwable {
		reviewPageObj.clickReviewButton();
	}

	@Then("^First question should be displayed$")
	public void first_question_should_be_displayed() throws Throwable {
	    
	}

	@When("^Click on the next button$")
	public void click_on_the_next_button() throws Throwable {
		reviewPageObj.clickNext();
	}

	@Then("^Second question should be displayed$")
	public void second_question_should_be_displayed() throws Throwable {
		//reviewPageObj.clickNext();
	}

	@Then("^Third question should be displayed$")
	public void third_question_should_be_displayed() throws Throwable {
		//reviewPageObj.clickNext();
	}

	@Then("^Forth question should be displayed$")
	public void forth_question_should_be_displayed() throws Throwable {
		//reviewPageObj.clickNext();
	}

	@Then("^Fifth question should be displayed$")
	public void fifth_question_should_be_displayed() throws Throwable {
		//reviewPageObj.clickNext();
	}

	@Then("^Sixth question should be displayed$")
	public void sixth_question_should_be_displayed() throws Throwable {
		
	}

	@Then("^Seventh question should be displayed$")
	public void seventh_question_should_be_displayed() throws Throwable {
		
	}

	@Then("^Eighth question should be displayed$")
	public void eighth_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Nineth question should be displayed$")
	public void nineth_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Tenth question should be displayed$")
	public void tenth_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Eleventh question should be displayed$")
	public void eleventh_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Twelfth question should be displayed$")
	public void twelfth_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Thirteenth question should be displayed$")
	public void thirteenth_question_should_be_displayed() throws Throwable {
	    
	}

	@Then("^Fourteenth question should be displayed$")
	public void fourteenth_question_should_be_displayed() throws Throwable {
	   
	}

	@Then("^Fifteenth question should be displayed$")
	public void fifteenth_question_should_be_displayed() throws Throwable {
	   
	}

	@Then("^Sixteenth question should be displayed$")
	public void sixteenth_question_should_be_displayed() throws Throwable {
	   
	}

	@When("^Click on the summary button$")
	public void click_on_the_summary_button() throws Throwable {
		reviewPageObj.clickSummary();
	}

	@Then("^Result should be displayed$")
	public void result_should_be_displayed() throws Throwable {
	    
	}

	@When("^Click on the the cross$")
	public void click_on_the_the_cross() throws Throwable {
	   
	}

	@Then("^the quiz page disappear$")
	public void the_quiz_page_disappear() throws Throwable {
	    
	}
    
	@After
	public void quit() {
		driver.quit();
	}

}
