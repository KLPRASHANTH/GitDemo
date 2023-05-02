package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By search= By.xpath("//input[@type='search']");
	private By producName= By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	//private By increment = By.xpath("(//a[@class='increment'])[1]");
	By increment = By.cssSelector("a.increment");
	By addTocart = By.cssSelector(".product-action button");
	
	public void searchitem(String string) {
		driver.findElement(search).sendKeys(string);
	}
	
	public void getSearchText() {
		
	 driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(producName).getText();
	}
	
	public void selecTopdealsPage() {
		driver.findElement(topDeals).click();
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public void incrementquatity(int num) {
		int i=num-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
		
	}
	
	public void addTocart() {
		driver.findElement(addTocart).click();
	}

}


