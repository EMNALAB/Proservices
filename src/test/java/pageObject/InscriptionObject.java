package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InscriptionObject {
	WebDriver driver;
	@FindBy(xpath = "//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")
	WebElement logButton;
	@FindBy(xpath="//a[@class='register']")
	WebElement registerLink;
	@FindBy(xpath = "//p[@class='message message-error']")
	WebElement msg;
	
	@FindBy(css = "#thim-popup-login > div > div > div.thim-popup-inner > div.thim-register > form > p:nth-child(3) > input")
	
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@placeholder='Validation du mot de passe']")
	WebElement confirmpassword;
	
	@FindBy(css ="input[value='Cree un compte']")
	WebElement createAccountButton;
	
	@FindBy(css = "#login-popup-3 > div > div > a.logout")
	WebElement home;
	@FindBy(xpath = "//p[@class='message message-error']")
	WebElement errorMsg;

	

	
	public  InscriptionObject(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void accesForm() {
		logButton.click();
		registerLink.click();
	}
	public void fillTrainingForm(String NOM, String EMAIL, String PASSWORD, String Confirmer_password) {
		//Select select = new Select(driver.findElement(subjectHeading));
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1300)");
		username.sendKeys(NOM);
		email.sendKeys(EMAIL);
		password.sendKeys(PASSWORD);
		confirmpassword.sendKeys(Confirmer_password);
		
	}
	public void clickSendf()  {
			
		createAccountButton.click();
	}
	public boolean chekHomPage(){
		Boolean isPresent = home.isDisplayed();
		System.out.println(isPresent);
		return isPresent;
	}
	public void checkMsg(String message)  {
		String actualResult = errorMsg.getText();
		String expectedResult = message;
		Assert.assertEquals(expectedResult,actualResult);
	}
	public void deconnexion(){
		home.click();
	}
}
