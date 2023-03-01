package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.PageFactoryManager;

public class TestContext {
	
	public WebDriver driver;
	public String landingPageproductname;
	public PageFactoryManager PageFactoryManager;
	public TestBase testbase;
	public GenericUtils genericUtils;
	
	
	public TestContext() throws IOException {
		testbase = new TestBase();
		PageFactoryManager = new PageFactoryManager(testbase.WebDriverManager());
		genericUtils= new GenericUtils(testbase.WebDriverManager());
	}
	

}
