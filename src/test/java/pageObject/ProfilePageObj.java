package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageObj {
	
	WebDriver driver;
	@FindBy(id = "lp-upload-photo")
	WebElement uploadButton;
	
	
	@FindBy(xpath  = "//*[@id=\"learn-press-user-profile\"]/div[2]/ul/li[4]/a/span")
	WebElement settingButton;
	
	@FindBy(css = "a[href='https://proservices-training-company.com/profile/EMNAlabidi/settings/avatar/']")
	WebElement avatarButton;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement submitButton;
	@FindBy(id = "description")
	WebElement bibliog;
	@FindBy(id = "first_name")
	WebElement fname;
	@FindBy(id = "last_name")
	WebElement lname;
	@FindBy(id = "nickname")
	WebElement Nname;

	@FindBy(xpath = "//main[1]/article[1]/div[1]/div[1]/div[1]")
	WebElement msgI;

	@FindBy(name = "submit")
	WebElement savechanges;
	@FindBy(xpath = "//div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement principal;

	@FindBy(xpath = "//a[normalize-space()='Mot de passe']")
	WebElement mpicone;
	@FindBy(id = "pass0")
	WebElement oldpassword;
	@FindBy(id = "pass1")
	WebElement newpassword;
	@FindBy(id = "pass2")
	WebElement confirmpassword;
	@FindBy(id = "submit")
	WebElement validatemp;
	@FindBy(xpath = "//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")
	WebElement loginButton;
	@FindBy(name  = "log")
	WebElement username;
	@FindBy(name = "pwd")
	WebElement password;
	@FindBy(name="wp-submit")
	WebElement cnxButton;

	public ProfilePageObj(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void accesProfile() throws  AWTException, InterruptedException {
		loginButton.click();
		username.sendKeys("EMNALABIDI");
		password.sendKeys("emna123");
		cnxButton.click();
		//settingButton.click();
		//avatarButton.click();
	}
	public void changePicture() throws  AWTException, InterruptedException {
		uploadButton.click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		//submitButton.sendKeys("C:\\Users\\beaut\\Desktop\\proservices\\photo_profil.png");
		//Runtime.getRuntime().exec("C:\\Users\\beaut\\Desktop\\proservices\\Upload_Picture.exe");
		//submitButton.click();
		Robot robot = new Robot();
		String text = "C:\\Users\\beaut\\Downloads\\Proservices-20220711T192147Z-001\\Proservices\\TestData\\profil.PNG";
		//String text = "Proservices\\photo\\profil.PNG";
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
		robot.delay(15000);
		//Thread.sleep(5);
		
	}

	public void fillpersonnalinfor(String BIBLIOG, String FNAME, String LNAME, String nNAME) {
		//Select select = new Select(driver.findElement(subjectHeading));
		principal.click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");
		//select.selectByVisibleText(heading);
		bibliog.clear();

		bibliog.sendKeys(BIBLIOG);
		fname.clear();
		fname.sendKeys(FNAME);
		lname.clear();
		lname.sendKeys(LNAME);
		Nname.clear();
		Nname.sendKeys(nNAME);
		js.executeScript("scroll(0,500)");
	}
	public void valider() throws InterruptedException {
		savechanges.click();
		Thread.sleep(1000);
	}
	public void verifier_maj_personal_inf(String expected){
		String actualResult = msgI.getText();
		String expectedResult = expected;
		Assert.assertEquals(actualResult,expected);

	}
	public void iconepawword(){
		mpicone.click();
	}
	public void changepassword(String OLDPWD, String NEWPWD, String CONFIRMPWD) {
		//Select select = new Select(driver.findElement(subjectHeading));

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(0,500)");
		//select.selectByVisibleText(heading);
		oldpassword.sendKeys(OLDPWD);
		newpassword.sendKeys(NEWPWD);
		confirmpassword.sendKeys(CONFIRMPWD);
	}
	public void verifier_modif_password(String expected){
		String actualResult = msgI.getText();
		String expectedResult = expected;
		Assert.assertEquals(actualResult,expected);

	}

}
