package stepDefinitions;

import static org.testng.Assert.assertEquals;

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
import pageObject.OffersPage;
import pageObject.PageFactoryManager;
import utils.TestContext;

public class OffersPageStepDefinition {
	
	public String offerPageProduct;
	
	public TestContext testcontext;
	public PageFactoryManager pagefactory;
	
	public OffersPageStepDefinition(TestContext testcontext){
		this.testcontext=testcontext;
	}

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_go_and_search_for_the_same_shortname_in_offers_page(String shortName) {
	    // Write code here that turns the phrase above into concrete actions
		switchToOffersPage();
		OffersPage offerspage=testcontext.PageFactoryManager.getOffersPage();
	 //  pagefactory = new PageFactoryManager(testcontext.driver);
		//OffersPage offerspage=pagefactory.getOffersPage();
		//OffersPage offerspage = new OffersPage(testcontext.driver);
		offerspage.searchItem(shortName);
		System.out.println("2nd committed by IST guy with develop branch");
              System.out.println("2nd committed by Asian guy with develop branch");
              System.out.println("3rdd committed by IST guy with develop branch");
		//testcontext.driver.findElement(By.id("search-field")).sendKeys(shortName);
		 offerPageProduct=offerspage.getproductName();
		
	    
	}
	
	public void switchToOffersPage() {
		//testcontext.driver.findElement(By.linkText("Top Deals")).click();
		
		LandingPage landingPage=testcontext.PageFactoryManager.getLandingPage();
		//LandingPage landingPage = new LandingPage(testcontext.driver);
		landingPage.selecTopdealsPage();
		testcontext.genericUtils.switchTochildWindow();
	}
	
	@And("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(testcontext.landingPageproductname, offerPageProduct);
	}

	
}
