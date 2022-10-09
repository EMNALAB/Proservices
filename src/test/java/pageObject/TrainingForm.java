package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingForm {
	WebDriver driver;
	@FindBy(xpath  = "//li[1]//div[1]//div[2]")
	WebElement nomf;
	@FindBy(xpath  = "//div[contains(@class,'rwmb-field rwmb-email-wrapper')]//div[2]")
	WebElement emailf;
	@FindBy(xpath  = "//div[@class='rwmb-field rwmb-text-wrapper']//div[@class='rwmb-input']")
	WebElement telf;
	@FindBy(xpath  = "//textarea[@id='bat_message']")
	WebElement msgf;
	@FindBy(xpath  = "//button[normalize-space()='Envoyer']")
	WebElement sendbouttonf;
	public TrainingForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillTrainingForm(String NOM, String EMAIL, String TEL, String MESSAGE) {
		//Select select = new Select(driver.findElement(subjectHeading));
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1300)");
		nomf.sendKeys(NOM);
		emailf.sendKeys(EMAIL);
		telf.sendKeys(TEL);
		msgf.sendKeys(MESSAGE);
		
	}
	public void clickSendf()  {
			
		sendbouttonf.click();
	}
}
