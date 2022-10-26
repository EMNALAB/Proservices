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
	@FindBy(css = ".button-retake-quiz")
	WebElement retake;
	
	
	
	@FindBy(xpath  = "//li[1]/label[1]/input[1]")
	WebElement locator1;
	@FindBy(xpath  = "//li[2]/label[1]/input[1]")
	WebElement locator2;
	@FindBy(xpath  = "//li[3]/label[1]/input[1]")
	WebElement locator3;
	@FindBy(xpath  = "//li[4]/label[1]/input[1]")
	WebElement locator4;
	@FindBy(xpath  = "//li[5]/label[1]/input[1]")
	WebElement locator5;
	//@FindBy(xpath  = "//input[@value='1612286792991260198b48f200e']")
	//WebElement question1;
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
	@FindBy(xpath  = "//div[3]/form[1]/button[1]")
	WebElement TerminerButton;
	@FindBy(xpath  = "//div[1]/div[1]/div[3]/button[1]")
	WebElement ConfirmerTerminer;
	@FindBy(xpath  = "//div[2]/div[1]/div[1]/div[1]/div[2]")
	WebElement msg;
	
	
	
	

	public  TctQuizPo (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void authentification() {
		loginButton.click();
		username.sendKeys("Sirinealoui");
		password.sendKeys("12345");
		cnxButton.click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1500)");
		//firstLink.click();
		secondLink.click();
		retake.click();
	}
	



	WebElement WebElement ;
	//public WebElement getresponse(String indexreponse ) {
	public void getresponse(String indexreponse ) {

		if (indexreponse.contains("a")){
			WebElement = locator1;
			//Thread.sleep(3000);
			locator1.click();
			System.out.println("ligne 141");
			//Thread.sleep(3000);
			nextButton.click();
		}
		 else if (indexreponse.contains("b")){
			WebElement = locator2;
			//Thread.sleep(3000);
			locator2.click();
			System.out.println("ligne 149");
			//Thread.sleep(3000);
			nextButton.click();}
		else if (indexreponse.contains("c")){
			WebElement = locator3;
			//Thread.sleep(3000);
			locator3.click();
			System.out.println("ligne 156");
			//Thread.sleep(3000);
			nextButton.click();}
		 else if (indexreponse.contains("d")){
			WebElement = locator4;
			//Thread.sleep(3000);
			locator4.click();
			System.out.println("ligne 163");
			//Thread.sleep(3000);
			nextButton.click();}
		else {
			//(indexreponse.contains("e") )
			WebElement = locator5;
			//Thread.sleep(3000);
			locator3.click();
			//Thread.sleep(3000);
			nextButton.click();
		}

		 // return WebElement;

		}



	public void getresponselast(String indexreponse ) throws InterruptedException {

		if (indexreponse.contains("a")){
			WebElement = locator1;
			Thread.sleep(3000);
			locator1.click();

		}
		else if (indexreponse.contains("b")){
			WebElement = locator2;
			Thread.sleep(3000);
			locator2.click();
			}
		else if (indexreponse.contains("c")){
			WebElement = locator3;
			Thread.sleep(3000);
			locator3.click();
			}
		else if (indexreponse.contains("d")){
			WebElement = locator4;
			Thread.sleep(3000);
			locator4.click();
			}
		else {
			//(indexreponse.contains("e") )
			WebElement = locator5;
			Thread.sleep(3000);
			locator3.click();
		}


	}

	//public WebElement getNext() {
		//return nextButton;
	//}
	public void clotureQuiz () throws InterruptedException {
		TerminerButton.click();
		Thread.sleep(3000);
		ConfirmerTerminer.click();
	}
	public void checkResult(String expected){
		String actualResult = msg.getText();

		String expectedResult = expected;
		Assert.assertTrue(actualResult.contains(expected));

	}
}
