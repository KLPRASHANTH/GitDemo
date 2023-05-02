package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	WebDriver driver;
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void switchTochildWindow() {
		String parentwind=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		
		String parid=itr.next();
		String chwindow=itr.next();
		driver.switchTo().window(chwindow);
	}

}
