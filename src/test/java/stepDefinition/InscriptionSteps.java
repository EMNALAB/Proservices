package stepDefinition;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
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
	@Given("^I navigate to home page$")
	public void i_navigate_to_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/espace-test/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("^I access the registration form$")
	public void i_access_the_registration_form() throws Throwable {
		inscriptionobject = new InscriptionObject(driver);
		inscriptionobject.accesForm();
	}
	@When("^I fill the form  \"([^\"]*)\" and rownumber (\\d+)$")
	public void i_fill_the_form_and_rownumber(String sheetName, Integer rowNumber) throws Throwable {
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
	@When("^validation$")
	public void validation() throws Throwable {
		inscriptionobject.clickSendf();
	}
	@Then("^user space must be displayed$")
	public void user_space_must_be_displayed() throws Throwable {
		inscriptionobject.chekHomPage();
	}
	//@Then("^click to logout button$")
	//public void click_to_logout_button() throws Throwable {
	//	inscriptionobject.deconnexion();
	//}
	@Then("^\"([^\"]*)\" is displayed$")
	public void is_displayed(String message) throws Throwable {
		inscriptionobject.checkMsg(message);
	}
	@After
	public void quit() {
		driver.quit();
	}
}
