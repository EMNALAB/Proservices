package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import managers.ExcelReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AuthObject;
import pageObject.FormsPage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AuthSteps {

    WebDriver driver;
    AuthObject authobject;

    @Given("^access the authentication page$")
    public void access_the_authentication_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://proservices-training-company.com/espace-test/compte/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        authobject = new AuthObject(driver);
    }
    @When("^enter data \"([^\"]*)\" and rownumber (\\d+)$")
    public void enter_data_and_rownumber(String SheetName, int RowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
        //public void i_fill_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
            //throws InvalidFormatException, IOException
            //formspage = new FormsPage(driver);
            ExcelReader reader = new ExcelReader();
            List<Map<String,String>> testData =
                    reader.getData(".\\TestData\\DataTest.xlsx", SheetName);

            String nom = testData.get(RowNumber).get("Login");
            String email = testData.get(RowNumber).get("Password");
            authobject.putData(nom,email);

        }

    @When("^I click on connection button$")
    public void i_click_on_connection_button() throws Throwable {
        authobject.signIN();
    }
    @Then("^check the \"([^\"]*)\"$")
    public void check_the(String message) throws Throwable {
        authobject.checkResult(message);
    }
    @After
    public void quit() {
        driver.quit();
    }

}
