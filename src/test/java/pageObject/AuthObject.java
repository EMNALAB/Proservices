package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthObject {
    WebDriver driver;
    @FindBy(name = "log")
    WebElement username;
    @FindBy(name = "pwd")
    WebElement password;
    @FindBy(name = "wp-submit")
    WebElement loginbutton;
    @FindBy(xpath = "//article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    WebElement msg;
    public  AuthObject(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
    public void putData(String USER, String PWD){
        JavascriptExecutor js =((JavascriptExecutor)driver);
        js.executeScript("scroll(0,1300)");
        username.sendKeys(USER);
        password.sendKeys(PWD);
    }
    public void signIN(){
        loginbutton.click();
    }
    public void checkResult(String message)
    {
        String actualResult = msg.getText();
        String expectedResult = message;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
