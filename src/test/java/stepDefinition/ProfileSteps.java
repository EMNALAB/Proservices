package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import managers.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.FormsPage;
import pageObject.SignInPageObj;
import pageObject.ProfilePageObj;
import pageObject.TctQuizPo;

public class ProfileSteps {
	WebDriver driver;
	SignInPageObj signInPageObj;
	ProfilePageObj profilPageObj;
	TctQuizPo quizpo;
	
	@Given("^open app$")
	public void open_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/profile/EMNAlabidi/settings/avatar/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("^access my profile$")
	public void access_my_profile() throws Throwable {

		//signInPageObj = new SignInPageObj(driver);
		profilPageObj = new ProfilePageObj(driver);
		profilPageObj.accesProfile();
		//signInPageObj.displaypopup();
		//signInPageObj.enterLogin();
		//signInPageObj.enterPwd();
		//signInPageObj.validate();
		
	}

	@When("^click to upload button$")
	public void click_to_upload_button() throws Throwable {
		profilPageObj.changePicture();
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
	public void i_fill_the_form_with_information_and_rownumber(String sheetName, int rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
		profilPageObj = new ProfilePageObj(driver);
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData =
				reader.getData(".\\TestData\\DataTest.xlsx", sheetName);
		String Biographical = testData.get(rowNumber).get("Biographical Info");
		String nom = testData.get(rowNumber).get("First Name");
		String prenom = testData.get(rowNumber).get("Last Name");
		String NICKNAME = testData.get(rowNumber).get("Nickname");
		profilPageObj.fillpersonnalinfor(Biographical, nom, prenom, NICKNAME);
	}

	@When("^I validate modification$")
	public void i_validate_modification() throws Throwable {
		profilPageObj.valider();
	}
	@Then("^check confirmation \"([^\"]*)\"$")
	public void check_confirmation(String expected) throws Throwable {
		profilPageObj.verifier_maj_personal_inf(expected);
	}

	@When("^I click to password icon$")
	public void i_click_to_password_icon() throws Throwable {
		profilPageObj.iconepawword();
	}

	@When("^Fill \"([^\"]*)\" and rownumber (\\d+)$")
	public void fill_and_rownumber(String sheetName, int rowNumber) throws Throwable {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData =
				reader.getData(".\\TestData\\DataTest.xlsx", sheetName);
		String oldP = testData.get(rowNumber).get("Old password");
		String newP = testData.get(rowNumber).get("New password");
		String confirmP = testData.get(rowNumber).get("Confirmation password");
		profilPageObj.changepassword(oldP, newP, confirmP);
	}

	@When("^click to save button$")
	public void click_to_save_button() throws Throwable {
		profilPageObj.valider();
	}

	@Then("^check \"([^\"]*)\"$")
	public void check(String expected) throws Throwable {
		profilPageObj.verifier_modif_password(expected);
	}


	@After
	public void quit() throws InterruptedException {
		Thread.sleep(6);
		driver.quit();
	}
}
