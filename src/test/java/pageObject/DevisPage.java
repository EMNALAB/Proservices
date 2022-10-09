package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DevisPage {

	WebDriver driver;
	@FindBy(css = "input[placeholder='Nom et Prénom*']")
	WebElement fullName;
	@FindBy(xpath = "//input[@placeholder='Email *']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Téléphone *']")
	WebElement Phone;
	//@FindBy(name = "menu-518")
	//WebElement dropdown1;
	private By dropdown1 = By.name("menu-518");
	@FindBy(xpath = "//select[@name='menu-517']") 
	WebElement dropdown2;
	@FindBy(xpath = "//select[@name='menu-519']")
	WebElement dropdown3;
	@FindBy(xpath = "//select[@name='menu-520']")
	WebElement dropdown4;
	@FindBy(xpath = "//select[@name='menu-510")
	WebElement dropdown5;
	@FindBy(name = "menu-510[]")
	WebElement dropdown22;
	
	//WebElement dropdown22 = driver.findElement(By.xpath( "//select[@name='menu-518']"));
	@FindBy(xpath = "//textarea[@placeholder='Message']")
	WebElement msg;
	@FindBy(xpath = "//input[@value='Envoyer']")
	WebElement Submit;
	@FindBy(xpath = "//div[@class='wpcf7-response-output']")
	WebElement Result;
	
	//initialize PageFactory
		//using constructor
		public  DevisPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void fillForm(String NOMPRENOM, String EMAIL, String TEL, String FORMATION , String REGION , String RECONVERSION, String EP, String SOURCE , String MESSAGE) {
			
			//Select select = new Select(driver.findElement(subjectHeading));
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("scroll(0,1300)");
			fullName.sendKeys(NOMPRENOM);
			Email.sendKeys(EMAIL);
			Phone.sendKeys(TEL);
			Select select = new Select(driver.findElement(dropdown1));
			select.selectByVisibleText(FORMATION);
			//dropdown1.sendKeys(FORMATION);
			dropdown2.sendKeys(REGION);
			dropdown3.sendKeys(RECONVERSION);
			dropdown4.sendKeys(EP);
			dropdown5.sendKeys(SOURCE);
			dropdown22.sendKeys(MESSAGE);
			
		}
		public void validateForm()  {
			
			Submit.click();
		}
}
