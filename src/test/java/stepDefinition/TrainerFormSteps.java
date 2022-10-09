package stepDefinition;

import java.awt.Robot;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.ExcelReader;
import pageObject.FormsPage;
import pageObject.SignInPageObj;
import pageObject.TrainingForm;

public class TrainerFormSteps {
	WebDriver driver;
	Robot robot;
	SignInPageObj signInPageObj;
	TrainingForm trainingform; 
	@Given("^I nagigate to recuitement of trainers page$")
    public void i_nagigate_to_recuitement_of_trainers_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/recrutement-formateur/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I fill the form through given sheet name \"([^\"]*)\" and rownumber (\\d+)$")
    public void i_fill_the_form_through_given_sheet_name_and_rownumber(String sheetName, Integer rowNumber) throws Throwable {
    	signInPageObj = new SignInPageObj(driver);
    	trainingform = new TrainingForm(driver);
    	signInPageObj.displaypopup();
    	signInPageObj.enterLogin();
    	signInPageObj.enterPwd();
    	signInPageObj.validate();
    	ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\beaut\\Downloads\\DataTest.xlsx", sheetName);
		
		String nom = testData.get(rowNumber).get("Nom");
		String email = testData.get(rowNumber).get("Email");
		String TEL = testData.get(rowNumber).get("Tel");
		String MASSAGE = testData.get(rowNumber).get("msg");
		
		trainingform.fillTrainingForm(nom, email, TEL, MASSAGE);
		
    }

    @When("^validate the sending$")
    public void validate_the_sending() throws Throwable {
    	trainingform.clickSendf();
    }

    @Then("^a sending confirmation message is displayed$")
    public void a_sending_confirmation_message_is_displayed() throws Throwable {
       
    }
	
	
}
