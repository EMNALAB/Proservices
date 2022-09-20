package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import pageObject.ReviewPageObj;
import pageObject.TctQuizPo;

public class TctQuiz {
	
	WebDriver driver;
	TctQuizPo tctquizpo;
	
	@Given("^I choose Istqb foundation quiz$")
	public void i_choose_Istqb_foundation_quiz() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/cours/istqb-fondation-examen-blanc-technique-conception-test/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tctquizpo = new TctQuizPo(driver);
		tctquizpo.authentification();
		
	}

	@Given("^I click to start$")
	public void i_click_to_start() throws Throwable {
		
		tctquizpo.PasserQuiz1();
		tctquizpo.checkResult1();
		tctquizpo.PasserQuiz2();
	}

}
