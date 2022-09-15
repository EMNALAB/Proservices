package pageObject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ReviewPageObj {
	
	
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
	@FindBy(xpath  = "//h4[normalize-space()='Q1']")
	WebElement Q1;
	@FindBy(xpath  = "//h4[normalize-space()='Q2']")
	WebElement Q2;
	@FindBy(xpath  = "//h4[normalize-space()='Q3']")
	WebElement Q3;
	@FindBy(xpath  = "//h4[normalize-space()='Q4']")
	WebElement Q4;
	@FindBy(xpath  = "//h4[normalize-space()='Q5']")
	WebElement Q5;
	@FindBy(xpath  = "//h4[normalize-space()='Q6']")
	WebElement Q6;
	@FindBy(xpath  = "//h4[normalize-space()='Q7']")
	WebElement Q7;
	@FindBy(xpath  = "//h4[normalize-space()='Q8']")
	WebElement Q8;
	@FindBy(xpath  = "//h4[normalize-space()='Q9']")
	WebElement Q9;
	@FindBy(xpath  = "//h4[normalize-space()='Q10']")
	WebElement Q10;
	@FindBy(xpath  = "//h4[normalize-space()='Q11']")
	WebElement Q11;
	@FindBy(xpath  = "//h4[normalize-space()='Q12']")
	WebElement Q12;
	@FindBy(xpath  = "//h4[normalize-space()='Q13']")
	WebElement Q13;
	@FindBy(xpath  = "//h4[normalize-space()='Q14']")
	WebElement Q14;
	@FindBy(xpath  = "//h4[normalize-space()='Q15']")
	WebElement Q15;
	@FindBy(xpath  = "//h4[normalize-space()='Q16']")
	WebElement Q16;
	
	
	@FindBy(xpath  = "//button[normalize-space()='Next']")
	WebElement nextButton;
	@FindBy(xpath  = "//button[normalize-space()='Summary']")
	WebElement summarryButton;
	
	
	
	
	public  ReviewPageObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void authentification() {
		loginButton.click();
		username.sendKeys("EMNALABIDI");
		password.sendKeys("emna123");
		cnxButton.click();
	}
	//Actions actions = new Actions(driver);
	public void accederProfil() {
		//Actions actions = new Actions(driver);
		//actions.click(profilButton).perform();
		PROFILE.click();
	}
	
	public void firstQuizLink() {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		firstLink.click();
	}
	public void firstCheck() {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1100)");
		String actualResult =firstVerif.getText();
		String expectedResult = "ISTQB Examen Blanc : Technique de conception de test";
		Assert.assertEquals(expectedResult,actualResult);
		
	}
	public void secondQuizLink() {
		secondLink.click();
	}
	public void secondCheck() {
		String actualResult =secondVerif.getText();
		String expectedResult = "YOUR RESULT"; 
		Assert.assertEquals(expectedResult,actualResult);
		//reviewButton.click();
	}
	public void clickReviewButton() {
		reviewButton.click();
	}
	public void checkQ1() {
		String actualResult =Q1.getText();
		String expectedResult = "Q1"; 
		Assert.assertEquals(expectedResult,actualResult);
		
	}
	
	public void clickNext() {
		nextButton.click();
	}
	public void checkQ2() {
		String actualResult =Q2.getText();
		String expectedResult = "Q2"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ3() {
		String actualResult =Q3.getText();
		String expectedResult = "Q3"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ4() {
		String actualResult =Q4.getText();
		String expectedResult = "Q4"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ5() {
		String actualResult =Q5.getText();
		String expectedResult = "Q5"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ6() {
		String actualResult =Q6.getText();
		String expectedResult = "Q6"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ7() {
		String actualResult =Q7.getText();
		String expectedResult = "Q7"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ8() {
		String actualResult =Q8.getText();
		String expectedResult = "Q8"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ9() {
		String actualResult =Q9.getText();
		String expectedResult = "Q9"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ10() {
		String actualResult =Q10.getText();
		String expectedResult = "Q10"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ11() {
		String actualResult =Q11.getText();
		String expectedResult = "Q11"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ12() {
		String actualResult =Q12.getText();
		String expectedResult = "Q12"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ13() {
		String actualResult =Q13.getText();
		String expectedResult = "Q13"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ14() {
		String actualResult =Q14.getText();
		String expectedResult = "Q14"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ15() {
		String actualResult =Q15.getText();
		String expectedResult = "Q15"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void checkQ16() {
		String actualResult =Q16.getText();
		String expectedResult = "Q16"; 
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void clickSummary() throws InterruptedException {
		summarryButton.click();
		Thread.sleep(3);
	}
	}
