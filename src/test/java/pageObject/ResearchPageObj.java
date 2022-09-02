package pageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchPageObj {
	
	WebDriver driver;
	@FindBy(xpath = "//li[@class='menu-right']//input[@placeholder='Rechercher…']")
	WebElement searchArea;
	@FindBy(xpath  = "//*[@id=\"post-24334\"]/div/div/header/div[2]/h2/a")
	WebElement searchResult;
	@FindBy(xpath  = "//a[normalize-space()='2']")
	WebElement secondButton;
	@FindBy(xpath  = "//a[@href='https://proservices-training-company.com/cours/examen-blanc-istqb/'][normalize-space()='Lire la suite']")
	WebElement lirelasuite;
	@FindBy(xpath  = "//a[normalize-space()='Examen blanc ISTQB']")
	WebElement prenezcecours;
	
	public  ResearchPageObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clicksearchArea() {
		searchArea.click();
	}
    
	public void enterTraining() {
		searchArea.sendKeys("ISTQB");
	}
	
	public void validateResearch() {
		searchArea.sendKeys(Keys.ENTER);
		lirelasuite.click();
		prenezcecours.click();
	}
	
	public void checkResearch() {
		String actualResult =searchResult.getText();
		String expectedResult = "ISTQB : Examen à blanc 17";
		Assert.assertEquals(expectedResult,actualResult);
		
	}
}
