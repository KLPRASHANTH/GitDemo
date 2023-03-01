package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By search= By.id("search-field");
	private By offerPageProduct = By.cssSelector("tr td:nth-child(1)");
	
	public void searchItem(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}
	
	public String getproductName() {
		return driver.findElement(offerPageProduct).getText();
	}
}
