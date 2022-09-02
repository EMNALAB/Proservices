package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObj {
	
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
	
	public  RegisterPageObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void accesForm() {
		logButton.click();
		registerLink.click();
	}
	
	public void enterUsername() {
		username.sendKeys("Amir");
	}
	public void enterEmail() {
		email.sendKeys("abcdf258963@gmail.com");
	}
	public void enterPassword() {
		password.sendKeys("1234Achbsx");
	}
	public void enterconfirmPassword() {
		confirmpassword.sendKeys("1234Achbsx");
	}
	public void validateAccount() {
		createAccountButton.click();
	}
	
	public void checkHome() {
		String actualResult =home.getText();
		String expectedResult = "Logout";
		Assert.assertEquals(expectedResult,actualResult);
	}
	
	public void enteruser() {
		username.sendKeys("EMNALABIDI");
		email.sendKeys("labidiemna230@gmail.com");
		password.sendKeys("1234Achbsx");
		confirmpassword.sendKeys("1234Achbsx");
	}
	public void check() {
		String actualResult =msg.getText();
		String expectedResult = "Erreur : cet identifiant est déjà utilisé. Veuillez en choisir un autre.";
		Assert.assertEquals(expectedResult,actualResult);
	}
}
