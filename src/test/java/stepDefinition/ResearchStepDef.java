package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ResearchPageObj;

public class ResearchStepDef {
	
	WebDriver driver;
	ResearchPageObj researchPageObj;
	
	@Given("^I open proservices application$")
	public void i_open_proservices_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@When("^I click  the search box$")
	public void i_click_the_search_box() throws Throwable {
		researchPageObj=new ResearchPageObj(driver);
		researchPageObj.clicksearchArea();
	    
	}

	@When("^I enter the desired training$")
	public void i_enter_the_desired_training() throws Throwable {
		researchPageObj.enterTraining();
	}
    
	@When("^validate the search$")
	public void validate_the_search() throws Throwable {
		researchPageObj.validateResearch();
	}
	
	@Then("^have the search results related to the training sought$")
	public void have_the_search_results_related_to_the_training_sought() throws Throwable {
		researchPageObj.checkResearch();
	}


}
