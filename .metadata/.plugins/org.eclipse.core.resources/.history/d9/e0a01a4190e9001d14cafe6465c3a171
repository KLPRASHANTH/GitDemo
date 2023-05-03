package stepDefinitions;

import static org.testng.Assert.assertEquals;

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
import pageObject.CheckoutPage;
import pageObject.LandingPage;
import pageObject.PageFactoryManager;
import utils.TestContext;

public class CheckoutPageStepDefinition {
	
	public String offerPageProduct;
	
	public TestContext testcontext;
	public CheckoutPage checkoutpage;
	
	public TestContext landingPageproductname;
	public PageFactoryManager pagefactorymanager ;
	public CheckoutPageStepDefinition(TestContext testcontext){
		this.testcontext=testcontext;
		this.checkoutpage= testcontext.PageFactoryManager.getCheckoutPage();
	}
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException {
		
		checkoutpage.checkOutItem();
		Thread.sleep(2000);
	String checkoutproductname=	checkoutpage.getCheckoutProductName().split("-")[0].trim();
	System.out.println("first line added");
	System.out.println("Second line added");
	Assert.assertTrue(checkoutproductname.contains(name));
	    
	}

	@Then("verify the user as ability to enter the promo code and place the order")
	public void verify_the_user_as_ability_to_enter_the_promo_code_and_place_the_order() {
		 
		 Assert.assertTrue(checkoutpage.verifypromoButton());
		 Assert.assertTrue(checkoutpage.verifyplaceOrder());
		 
	}


	
	
}
