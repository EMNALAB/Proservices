package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {
	WebDriver driver;
	@FindBy(name  = "your-name")
	WebElement nom;
	@FindBy(name  = "your-email")
	WebElement email;
	@FindBy(name  = "your-subject")
	WebElement sujet;
	@FindBy(name  = "your-message")
	WebElement msg;
	@FindBy(xpath  = "//input[@value='ENVOYER']")
	WebElement butonenvoyer;
	//Votre message a bien été envoyé. Merci.
	@FindBy(xpath  = "//div[1]/div[1]/form[1]/div[2]")
	WebElement finalmsg;
	public FormsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void fillContactUsForm(String NOM, String EMAIL, String SUJET, String MESSAGE) {
		//Select select = new Select(driver.findElement(subjectHeading));
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		//select.selectByVisibleText(heading);
		nom.sendKeys(NOM);
		email.sendKeys(EMAIL);
		sujet.sendKeys(SUJET);
		msg.sendKeys(MESSAGE);
	}
	public void clickSend()  {
		butonenvoyer.click();
	}
	public void checkResult(String message)  {
		String actualResult = finalmsg.getText();
		String expectedResult = message;
		Assert.assertEquals(expectedResult,actualResult);
	}
}
