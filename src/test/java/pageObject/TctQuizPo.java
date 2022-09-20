package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TctQuizPo {

	WebDriver driver;
	//Actions actions;
	@FindBy(partialLinkText  = "profile")
	WebElement PROFILE;
	@FindBy(xpath = "//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")
	WebElement loginButton;
	@FindBy(name  = "log")
	WebElement username;
	@FindBy(name = "pwd")
	WebElement password;
	@FindBy(name="wp-submit")
	WebElement cnxButton;
	@FindBy(xpath  ="//li[@class='menu-right']//a[@class='profile'][normalize-space()='Profile']")
	WebElement profilButton;
	@FindBy(css = "a[href='https://proservices-training-company.com/cours/istqb-fondation-examen-blanc-technique-conception-test/']")
	WebElement firstLink;
	@FindBy(xpath = "//h1[contains(text(),'ISTQB Examen Blanc : Technique de conception de te')]")
	WebElement firstVerif;
	@FindBy(css  = ".quiz-title.course-item-title.button-load-item")
	WebElement secondLink;
	@FindBy(xpath  = "//h3[normalize-space()='Your Result']]")
	WebElement secondVerif;
	@FindBy(xpath  = "//*[@id=\"content-item-quiz\"]/div[2]/form/button")
	WebElement reviewButton;
	@FindBy(className = "input[value='1612286792991260198b48f200e']")
	WebElement retake;
	
	
	@FindBy(css  = "input[value='1612286792991260198b48f200e']")
	WebElement question1;
	@FindBy(xpath  = "//button[normalize-space()='Next']")
	WebElement nextButton;
	@FindBy(xpath  = "//input[@value='1612287147884760198cabd8003']")
	WebElement question2;
	@FindBy(xpath  = "//input[@value='161228727857260198d2e8ba6b']")
	WebElement question3;
	@FindBy(xpath  = "//input[@value='1612287473925660198df1e1fd0']")
	WebElement question4;
	@FindBy(xpath  = "//input[@value='161228756225960198e4a3f3b4']")
	WebElement question5;
	@FindBy(xpath  = "//input[@value='1612287578805960198e5ac4c1d']")
	WebElement question6;
	@FindBy(xpath  = "//input[@value='161228770991160198eddde674']")
	WebElement question7;
	@FindBy(xpath  = "//input[@value='1612287661408960198ead63d4a']")
	WebElement question7V;
	@FindBy(xpath  = "//input[@value='161228774571360198f01ae154']")
	WebElement question8;
	@FindBy(xpath  = "//input[@value='161228774571360198f01ae143']")
	WebElement question8V;
	@FindBy(xpath  = "//input[@value='1612287839278960198f5f44173']")
	WebElement question9;
	@FindBy(xpath  = "//input[@value='1612287839278960198f5f44189']")
	WebElement question9V;
	@FindBy(xpath  = "//input[@value='1612287908156760198fa42643b']")
	WebElement question10;
	@FindBy(xpath  = "//input[@value='1612287908156760198fa426433']")
	WebElement question10V;
	@FindBy(xpath  = "//input[@value='1612287995268860198ffb41a25']")
	WebElement question11;
	@FindBy(xpath  = "//input[@value='16122880323922601990205fc32']")
	WebElement question11V;
	@FindBy(xpath  = "//input[@value='161228805834026019903a530c7']")
	WebElement question12;
	@FindBy(xpath  = "//input[@value='1612288354656360199162a03a4']")
	WebElement question13;
	@FindBy(xpath  = "//input[@value='1612288407724760199197b0ec1']")
	WebElement question14;
		@FindBy(xpath  = "//input[@value='16122884875513601991e7869ae']")
	WebElement question15;
		
	@FindBy(xpath  = "//input[@value='1612288551725960199227b1366']")
	WebElement question16;
	@FindBy(xpath  = "//button[normalize-space()='Terminer']")
	WebElement TerminerButton;
	@FindBy(xpath  = "//button[normalize-space()='Ben Oui']")
	WebElement ConfirmerTerminer;
	@FindBy(xpath  = "//div[contains(@class,'message-error')]")
	WebElement check1;
	
	
	
	

	public  TctQuizPo (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void authentification() {
		loginButton.click();
		username.sendKeys("patrick");
		password.sendKeys("12345");
		cnxButton.click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1500)");
		//firstLink.click();
		secondLink.click();
		retake.click();
	}
	
	public void PasserQuiz1() {
		question1.click();
		nextButton.click();
		question2.click();
		nextButton.click();
		question3.click();
		nextButton.click();
		question4.click();
		nextButton.click();
		question5.click();
		nextButton.click();
		question6.click();
		nextButton.click();
		question7.click();
		nextButton.click();
		question8.click();
		nextButton.click();
		question9.click();
		nextButton.click();
		question10.click();
		nextButton.click();
		question11.click();
		nextButton.click();
		question12.click();
		nextButton.click();
		question13.click();
		nextButton.click();
		question14.click();
		nextButton.click();
		question15.click();
		nextButton.click();
		question16.click();
		TerminerButton.click();
		ConfirmerTerminer.click();
	}
	public void checkResult1() {
		String actualResult =check1.getText();
		String expectedResult = "Your quiz grade failed. The result is 31.3% (the requirement is 65%)."; 
		Assert.assertEquals(expectedResult,actualResult);
		
	}
	public void PasserQuiz2() {
		retake.click();
		question1.click();
		nextButton.click();
		question2.click();
		nextButton.click();
		question3.click();
		nextButton.click();
		question4.click();
		nextButton.click();
		question5.click();
		nextButton.click();
		question6.click();
		nextButton.click();
		question7V.click();
		nextButton.click();
		question8V.click();
		nextButton.click();
		question9V.click();
		nextButton.click();
		question10V.click();
		nextButton.click();
		question11V.click();
		nextButton.click();
		question12.click();
		nextButton.click();
		question13.click();
		nextButton.click();
		question14.click();
		nextButton.click();
		question15.click();
		nextButton.click();
		question16.click();
		TerminerButton.click();
		ConfirmerTerminer.click();
	}
}
