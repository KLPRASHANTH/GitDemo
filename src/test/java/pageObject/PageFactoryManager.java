package pageObject;

import org.openqa.selenium.WebDriver;

import utils.TestContext;

public class PageFactoryManager {
	LandingPage landingpage;
	OffersPage offerspage;
	CheckoutPage checkoutpage;
	
	WebDriver driver;
	public PageFactoryManager(WebDriver driver) {
		this.driver = driver;
	}
	public LandingPage getLandingPage() {
		 return new LandingPage(driver);
	}
	
	public OffersPage getOffersPage() {
		 return new OffersPage(driver);
	}
	
	public CheckoutPage getCheckoutPage() {
		 return new CheckoutPage(driver);
	}
	
	

}
