package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DevisPageObj {

	
	WebDriver driver;
	@FindBy(css = "input[placeholder='Nom et Prénom*']")
	WebElement fullName;
	@FindBy(xpath = "//input[@placeholder='Email *']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Téléphone *']")
	WebElement Phone;
	@FindBy(xpath = "//select[@name='menu-518']")
	WebElement dropdown1;
	@FindBy(xpath = "//select[@name='menu-517']")
	WebElement dropdown2;
	@FindBy(xpath = "//select[@name='menu-519']")
	WebElement dropdown3;
	@FindBy(xpath = "//select[@name='menu-520']")
	WebElement dropdown4;
	@FindBy(xpath = "//select[@name='menu-510")
	WebElement dropdown5;
	WebElement dropdown22 = driver.findElement(By.xpath( "//select[@name='menu-518']"));
	@FindBy(xpath = "//textarea[@placeholder='Message']")
	WebElement msg;
	@FindBy(xpath = "//input[@value='Envoyer']")
	WebElement Submit;
	@FindBy(xpath = "//div[@class='wpcf7-response-output']")
	WebElement Result;
	
	//initialize PageFactory
		//using constructor
		public  DevisPageObj(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			
		}
	

		public void enterFullname() {
			fullName.sendKeys("nizar triki");
			
		}
	
		public void enteremail() {
			Email.sendKeys("nizartriki@gmail.com");
			
		}
		public void enterphone() {
			Phone.sendKeys("226662888");
			
		}
		public void chooseR() {
			Select select1 = new Select (dropdown22);
			//((Select) dropdown1).selectByIndex(1);
			select1.selectByIndex(0);
			
		}
		public void chooseT() {
			Select select1 = new Select (dropdown2);
			select1.selectByIndex(7);
			
		}
		public void answerQ() {
			Select select1 = new Select (dropdown3);
			select1.selectByIndex(1);
			
		}
		public void chooseCP() {
			Select select1 = new Select (dropdown4);
			select1.selectByIndex(1);
			
		}
		public void faireChoix() {
			
			
		}
		public void writemsg() {
			msg.sendKeys("Bonjour, je souhaiterai etre contacter pour avoir des informations sur cette formation, et merci");
			
		}
		public void clickB() {
			Submit.click();
			
		}
	 
	   public void errorMsg() {
			String actualResult =Result.getText();
			String expectedResult = "Votre message a bien été envoyé. Merci.";
			Assert.assertEquals(expectedResult,actualResult);
			
		}
}
