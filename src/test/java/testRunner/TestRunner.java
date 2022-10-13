package testRunner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

import cucumber.api.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"stepDefinition"},
//tags=" @SignIn,@Research,@UploadPicture,@Review_quiz,@Valid_Register,@Invalid_Register_with_username,@contactus",
		tags="@update_password",
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		
		snippets = SnippetType.CAMELCASE, 
		monochrome = true)
public class TestRunner {

	
	// Generation du rapport
	@AfterClass
	// methode qui nous permet de crèer le rapport
	
    public static void writeExtentReport() {
	Reporter.loadXMLConfig(new String("src/test/ressources/configs/extent-config.xml"));
	
	
}
}
