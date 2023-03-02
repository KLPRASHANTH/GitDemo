package stepDefinitions;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.PageFactoryManager;
import utils.TestContext;

public class LandingPageStepDefinition {
	
	public String offerPageProduct;
	
	 TestContext testcontext;
	 LandingPage landingpage;
	public TestContext landingPageproductname;
	public PageFactoryManager pagefactorymanager ;
	public LandingPageStepDefinition(TestContext testcontext){
		this.testcontext=testcontext;
		 this.landingpage= testcontext.PageFactoryManager.getLandingPage();
	}
	@Given("User is on green cart landing page")
	public void user_is_on_green_cart_landing_page() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//testcontext.driver = new ChromeDriver();
		//testcontext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//testcontext.testbase.WebDriverManager();
		//here the driver will get initialised with out invoking because the driver will get initialised 
		// by calling from TestContext and in that testcontext it will call from Pagefactorymanager
	//	Assert.assertTrue(landingpage.getLandingPageTitle().contains("GreenKart"));
	System.out.println("testing git");
        System.out.println("committed by Asian guy");
        System.out.println("committed by IST guy with develop branch");
        System.out.println("committed by Asian guy with develop branch");
        
	}

	@When("^user search with short name (.+) and extracts actual name of the product$")
	public void user_search_with_short_name_and_extracts_actual_name_of_the_product(String string) throws InterruptedException {
		// pagefactorymanager = new PageFactoryManager(testcontext.driver);
		
		// LandingPage landingpage= testcontext.PageFactoryManager.getLandingPage();
		//LandingPage landingpage= new LandingPage(testcontext.driver);
		landingpage.searchitem(string);
		//testcontext.driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tom");
	    Thread.sleep(2000);
	    testcontext.landingPageproductname=  landingpage.getProductName().split("-")[0].trim();
	    System.out.println(testcontext.landingPageproductname+"Extracted from home page");
	}
	
	@When("added {string} items to selected product to cart")
	public void added_items_to_selected_product_to_cart(String string) {
		landingpage.incrementquatity(Integer.parseInt(string));
		landingpage.addTocart();
		
	}

	
	
}
