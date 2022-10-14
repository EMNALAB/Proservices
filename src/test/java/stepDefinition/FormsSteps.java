package stepDefinition;

import java.awt.Robot;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.ExcelReader;
import pageObject.FormsPage;
import pageObject.SignInPageObj;
import pageObject.TrainingForm;

import org.junit.Assert;


public class FormsSteps {
	WebDriver driver;
	FormsPage formspage;
	Robot robot;
	SignInPageObj signInPageObj;
	TrainingForm trainingform; 
	
	
    @Given("^I navigate to contact us page$")
    public void i_nagigate_to_contact_us_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/cabinet-de-formation-contact/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I fill the form from given sheetname \"([^\"]*)\" and rownumber (\\d+)$")
    public void i_fill_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
    	//throws InvalidFormatException, IOException 
    	formspage = new FormsPage(driver);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData =
				reader.getData(".\\TestData\\DataTest.xlsx", sheetName);

		String nom = testData.get(rowNumber).get("NOM");
		String email = testData.get(rowNumber).get("EMAIL");
		String sujet = testData.get(rowNumber).get("SUJET");
		String message = testData.get(rowNumber).get("MESSAGE");
		formspage.fillContactUsForm(nom, email, sujet, message);

	}
    

    @When("^I click on send button$")
    public void i_click_on_send_button() throws Throwable {
    	Robot robot = new Robot();
    	robot.delay(3000);
    	formspage.clickSend();
    	robot.delay(3000);
    }
	@Then("^check the \"([^\"]*)\" that will be displayed$")
	public void check_the_that_will_be_displayed(String message) throws Throwable {
		formspage.checkResult(message);
	}

	@After
	public void quit() {
		driver.quit();
	}
    
  
	
}
