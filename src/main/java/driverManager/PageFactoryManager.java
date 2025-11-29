package driverManager;

import org.openqa.selenium.WebDriver;

import pages.HomePage;

public class PageFactoryManager {
	
	public HomePage homepage;
	
	public HomePage getHomePageObject(WebDriver driver) {
		if (homepage==null) {
			return homepage=new HomePage(driver);
		}else {
			return homepage;
		}
	}

}
