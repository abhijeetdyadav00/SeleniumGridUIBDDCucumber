package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	public BasePage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	
	
	public WebElement waitForVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));		
	}
	
	
	public WebElement waitForElementToBeClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
	public void click(WebElement element) {
		waitForElementToBeClickable(element).click();
	}
	
	
	
	public void clearAndSendKeys(WebElement element, String textToBeSearched) {
		element=waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(textToBeSearched);	
	}
	
	
	
	

}
