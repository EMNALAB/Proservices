package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.ExcelReader;
import pageObject.DevisPage;
import pageObject.SignInPageObj;

public class DevisSteps {
	WebDriver driver;
	DevisPage devispage;
	@Given("^I nagigate to quote page$")
	public void i_nagigate_to_quote_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/demander-un-devis/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^fill in the form name \"([^\"]*)\" and rownumber (\\d+)$")
	public void fill_in_the_form_name_and_rownumber(String sheetName, Integer rowNumber) throws Throwable {
		devispage = new DevisPage(driver);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:\\Users\\beaut\\Downloads\\DataTest.xlsx", sheetName);
		
		String NOMPRENOM = testData.get(rowNumber).get("NOM ET PRENOM");
		String EMAIL = testData.get(rowNumber).get("EMAIL");
		String TEL = testData.get(rowNumber).get("TEL");
		String FORMATION = testData.get(rowNumber).get("FORMATION");
		String REGION = testData.get(rowNumber).get("Région");
		String RECONVERSION = testData.get(rowNumber).get("Reconversion de Domaine");
		String EP = testData.get(rowNumber).get("Entreprise OU Particulier");
		String SOURCE = testData.get(rowNumber).get("Ou vous avez trouver notre formation ?");
		String MESSAGE = testData.get(rowNumber).get("Message");
		
		devispage.fillForm(NOMPRENOM, EMAIL, TEL, FORMATION,REGION,RECONVERSION,EP,SOURCE,MESSAGE);
	}

	@When("^click to send button$")
	public void click_to_send_button() throws Throwable {
		devispage.validateForm();
	}

	@Then("^show message$")
	public void show_message() throws Throwable {
	   
	}


}
