package stepDefinition;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.TctQuizPo;
import managers.FileReaderManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//public class TctQuiz extends TestBase {
	public class TctQuiz {
	public TctQuiz() throws IOException {
		super(); // executer test base contructror

	}

	WebDriver driver;
	TctQuizPo tctquizpo;
	FileReaderManager filereadermanager;
	
	@Given("^I choose Istqb foundation quiz$")
	public void i_choose_Istqb_foundation_quiz() throws Throwable {
		//testbase = new TestBase();
		//initialization();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/espace-test/cours/istqb-fondation-examen-blanc-technique-conception-test/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tctquizpo = new TctQuizPo(driver);
		tctquizpo.authentification();
		
	}

		
	
	@When("^I anserwer question number \"([^\"]*)\"$")
	public void i_anserwer_question_number(String response) throws Throwable {

		tctquizpo.getresponse(response);
		//tctquizpo.getNext();
		//tctquizpo.clotureQuiz();

	}
	@When("^I anserwer last question number \"([^\"]*)\"$")
	public void i_anserwer_last_question_number(String response) throws Throwable {
		tctquizpo.getresponselast(response);
	}
	@When("^I click to finish button$")
	public void i_click_to_finish_button() throws Throwable {
		tctquizpo.clotureQuiz();
	}
	@Then("^result should be displayed \"([^\"]*)\"$")
	public void result_should_be_displayed(String expected) throws Throwable {
		tctquizpo.checkResult(expected);
	}
	@After
	public void quit() {
		driver.quit();
	}

}
