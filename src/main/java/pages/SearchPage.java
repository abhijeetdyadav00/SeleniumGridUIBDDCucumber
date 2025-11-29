package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") private WebElement searchBar;
	@FindBy(xpath="//span[contains(text(),'iPhone 16 Pro 128 GB: 5G Mobile Phone')]/ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//descendant::span[@class='a-price-whole']")
	private WebElement iphonePrice;
	@FindBy(xpath="//span[@id='nav-search-submit-text']") private WebElement clickSearch;
	
	
	
	public SearchPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);		
	}
	
	
	public void clickOnsearchBox(String iphone) {
		waitForVisibilityOfElement(searchBar);
		click(searchBar);
		clearAndSendKeys(searchBar,iphone);	
		click(clickSearch);
	}
	
	public String getIphoneprice() {
		waitForVisibilityOfElement(iphonePrice);
		String price=iphonePrice.getText();
		return price;
		
	}
	

	
	
	
}
