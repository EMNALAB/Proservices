package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FpObj {
	WebDriver driver;
	
	@FindBy(xpath = "//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")
	WebElement loginButton;
	@FindBy(xpath = "//a[normalize-space()='Mot de passe perdu?']")
	WebElement link1;
	@FindBy(name = "user_login")
	WebElement ZoneSaisi;
	@FindBy(id = "wp-submit")
	WebElement ResetButton;
	
	//gmail 
	@FindBy(id = "identifierId")
	WebElement gmailid;
	
	//li[@class='mobile-header h-c-header__cta-li h-c-header__cta-li--primary']//a[@aria-label='Accéder à votre compte Google'][normalize-space()='Accéder au compte Google']
	@FindBy(id = "identifierNext")
	WebElement nextbutton1;
	@FindBy(name = "Passwd")
	WebElement gmailipwd;
	@FindBy(xpath = "//span[normalize-space()='Suivant']")
	WebElement nextbutton2;
	
	//*[@id="identifierNext"]/div/button/span
	 public FpObj (WebDriver driver) {
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	
	 public void accesform() {
			loginButton.click();
			link1.click();
			ZoneSaisi.sendKeys("EMNALABIDI");
			//ResetButton.click();
			ResetButton.sendKeys(Keys.RETURN);
			
		}
	 
	 public void gmailcnx() throws InterruptedException {
		   gmailid.sendKeys("labidiemna230@gmail.com");
		   Thread.sleep(4000);
		   nextbutton1.click();
		   
		   //driver.navigate().to("https://accounts.google.com/v3/signin/challenge/pwd?TL=AKqFyY8BGt5wCAKy64N1y5DyAhkc658v5J-Nwidhmvym69BwycBRzF5eEhcSLiSi&checkConnection=youtube%3A197%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&dsh=S-1006461355%3A1663022846955141&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Dwm&hl=fr&ifkv=AQDHYWoyA9EWuKUgnBJeqHH6N4joPRp3GgGsz1ahxV8yKTvvHHFF4u7-0e_f9g9TIUCSZWmU8LRDNA&pstMsg=1&service=mail");
		   //nextbutton1.sendKeys(Keys.RETURN);
		   gmailipwd.sendKeys("Emna@1990");
		   nextbutton2.click();
			
		}



	
}
