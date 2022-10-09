package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.ExcelReader;
import pageObject.InscriptionObject;

import pageObject.SignInPageObj;

public class InscriptionSteps {
	WebDriver driver;
	InscriptionObject inscriptionobject;
	
	@Given("^I nagigate to home page$")
	public void i_nagigate_to_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    
	}

	@When("^I fill the form  \"([^\"]*)\" and rownumber (\\d+)$")
	public void i_fill_the_form_and_rownumber(String sheetName, Integer rowNumber) throws Throwable {
		inscriptionobject = new InscriptionObject(driver);
		inscriptionobject.accesForm();
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				//reader.getData("C:\\Users\\beaut\\Downloads\\DataTest.xlsx", sheetName);
				reader.getData(".\\TestData\\DataTest.xlsx", sheetName);
		String nom = testData.get(rowNumber).get("nom utilisateur");
		String email = testData.get(rowNumber).get("Email");
		String PASSWORD = testData.get(rowNumber).get("password");
		String Confirmer_password = testData.get(rowNumber).get("confirmer password");
		
		inscriptionobject.fillTrainingForm(nom, email, PASSWORD, Confirmer_password);
	}

	@When("^validatation$")
	public void validatation() throws Throwable {
		inscriptionobject.clickSendf();
	}

	@Then("^message is displayed$")
	public void message_is_displayed() throws Throwable {
	    
	}
}
