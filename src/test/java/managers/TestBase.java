package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {
	public static WebDriver driver;
	public static Properties properties;


	//public TestBase() throws IOException {
		//properties = new Properties();
		//FileInputStream file = new FileInputStream("configs\\Configuration.properties");
		//properties.load(file);
//		String url = properties.getProperty("URL");
//		System.out.println(url);
	//}

	public void initialization() {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://proservices-training-company.com/dev-proservices/cours/istqb-fondation-examen-blanc-technique-conception-test/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	public static void takeScreenShots(String name) throws IOException {
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcFile, new File("target\\snopshots\\"+ name + ".png"));
//	}

	
	
}
