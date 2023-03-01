package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By cartBag=By.cssSelector("img[alt='Cart']");
	By checkoutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	By promobtn = By.cssSelector(".promoBtn");
	By placeorder = By.xpath("//button[contains(text(),'Place Order')]");
	
	By checkoutProduct = By.xpath("//p[@class='product-name']");
	
	public void checkOutItem() {
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public boolean verifypromoButton() {
		return driver.findElement(promobtn).isDisplayed();
	}
	
	public boolean verifyplaceOrder() {
		return driver.findElement(placeorder).isDisplayed();
	}
	
	public String getCheckoutProductName() {
		return driver.findElement(checkoutProduct).getText();
	}
	


}


