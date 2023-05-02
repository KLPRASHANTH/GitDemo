package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.reporter.FileUtil;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContext;

public class Hooks {
	TestContext testcontext;
	public Hooks(TestContext testcontext) {
		this.testcontext=testcontext;
	}
	
	//This will run after execution of each scenario
	@After
	public void closeBrowser() throws IOException {
		testcontext.testbase.WebDriverManager().quit();
	}
	
	//This will run after each step inside scenario
	@AfterStep
	public void Addscreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testcontext.testbase.WebDriverManager();
		if(scenario.isFailed()) {
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(file);
			scenario.attach(filecontent, "image/png", "image");

		}
	}

}
