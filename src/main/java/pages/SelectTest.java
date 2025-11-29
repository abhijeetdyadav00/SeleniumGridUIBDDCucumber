package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectTest extends BasePage{
	


	@FindBy(xpath="//select[@id='searchDropdownBox']") private WebElement SelectAll;
	@FindBy (xpath="//span[@id='nav-search-label-id']") private WebElement allSection;
	@FindBy (xpath="//input[@id='twotabsearchtextbox']") private WebElement searchCar;
	@FindBy (xpath="//div[@id='sac-autocomplete-results-container']//div[contains(@id,'sac-suggestion-row')]") private List<WebElement> listOfsuggetions;
	
	public SelectTest(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectCategory() throws InterruptedException {
		
		
		waitForElementToBeClickable(allSection);
		Thread.sleep(4000);
		
//		Actions act= new Actions(driver);
//		act.moveToElement(allSection).perform();


		Select selectCategory = new Select(SelectAll);
		selectCategory.selectByVisibleText("Car & Motorbike");
		Thread.sleep(4000);
			
	}
	
	
	public void searchProduct(String carName){
		waitForVisibilityOfElement(searchCar);
		searchCar.sendKeys(carName);
		

		
	}
	
	
	public void searchProductSelect(String searchName) throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement suggestion;
		
		for(int i=0;i<listOfsuggetions.size();i++) {
			suggestion = listOfsuggetions.get(i);
			System.out.println(suggestion.getText());
		}
		
		for(int i=0;i<listOfsuggetions.size();i++) {
			suggestion = listOfsuggetions.get(i);
			String suggetionText = suggestion.getText();
			System.out.println(suggetionText +" and "+ searchName);
			if (suggetionText.equalsIgnoreCase(searchName)) {
				waitForElementToBeClickable(suggestion);
				suggestion.click();
				System.out.println("clicked on fortuner key cover");
				break;
			}
		}
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	

}
