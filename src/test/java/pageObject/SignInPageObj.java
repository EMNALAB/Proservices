package pageObject;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObj {

	WebDriver driver;
	@FindBy(xpath = "//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")
	WebElement loginButton;
	@FindBy(name  = "log")
	WebElement username;
	@FindBy(name = "pwd")
	WebElement password;
	@FindBy(name="wp-submit")
	WebElement cnxButton;
	@FindBy(css = "li[class='menu-right'] a[class='logout']")  
	WebElement home;
	@FindBy(xpath = "//*[@id=\"post-2958\"]/div/div/div/div/div/div/p") 
	WebElement error1;
	
 
	//initialize PageFactory
	//using constructor
	public  SignInPageObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void displaypopup() {
		loginButton.click();
	}
	public void enterLogin() {
		username.sendKeys("EMNALABIDI");
	}
	
	public void enterPwd() {
		password.sendKeys("HBXX4854");
	}
	
	public void validate() {
		cnxButton.click();
	}
	public void checkHome() {
		String actualResult =home.getText();
		String expectedResult = "Logout";
		Assert.assertEquals(expectedResult,actualResult);
	}
	
	public void enterIU() {
		username.sendKeys("abcdef154");
	}
	
	public void invalidPwd() {
		password.sendKeys("525kbsT");
	}
	
	public void errorMsg() {
		String actualResult =error1.getText();
		String expectedResult = "The password is incorrect";
		Assert.assertEquals(expectedResult,actualResult);
	}
}
