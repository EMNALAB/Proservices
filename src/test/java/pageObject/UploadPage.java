package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
	
	WebDriver driver;
	@FindBy(id = "lp-upload-photo")
	WebElement uploadButton;
	
	
	@FindBy(xpath  = "//*[@id=\"learn-press-user-profile\"]/div[2]/ul/li[4]/a/span")
	WebElement settingButton;
	
	@FindBy(css = "a[href='https://proservices-training-company.com/profile/EMNAlabidi/settings/avatar/']")
	WebElement avatarButton;
	@FindBy(id = "submit")
	WebElement submitButton;
	
	public  UploadPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void accesProfile() throws  AWTException, InterruptedException {
		
		settingButton.click();
		avatarButton.click();
		uploadButton.click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		//submitButton.sendKeys("C:\\Users\\beaut\\Desktop\\proservices\\photo_profil.png");
		//Runtime.getRuntime().exec("C:\\Users\\beaut\\Desktop\\proservices\\Upload_Picture.exe");
		//submitButton.click();
		Robot robot = new Robot();
		//String text = "C:\\Users\\beaut\\Desktop\\proservices\\profil.png";
		String text = "Proservices\\photo\\profil.PNG";
		//selectionner l'emplacement de la photo
		StringSelection selection = new StringSelection(text);
		
		//copier le chemin
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.delay(3000);
		// coller 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		// relacher les touches ctr et v
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(5000);
		//cliquer sur entrer su clavier
		robot.keyPress(KeyEvent.VK_ENTER);
		//relacher la touche entrer
		robot.keyRelease(KeyEvent.VK_ENTER);
		submitButton.click();
		js.executeScript("scroll(0,500)");
		//robot.delay(15000);
		Thread.sleep(5);
		
	}

}
