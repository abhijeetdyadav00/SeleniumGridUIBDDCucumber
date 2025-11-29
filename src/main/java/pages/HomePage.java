package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='nav-cart-text-container']") private WebElement cartIcon;
	@FindBy(xpath="//*[@id='nav-primeday']")private WebElement primeDeal;
	@FindBy(xpath="//img[@alt='Electonics']") private WebElement electronicSection;
	
	
	public HomePage(WebDriver driver){
		super (driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleOfPage() {
		String title=driver.getTitle();
		return title;
	}
	
	public Boolean isCartIconDisplayed() throws InterruptedException {
		waitForVisibilityOfElement(cartIcon);
		Boolean cartIconDIsplayed=cartIcon.isDisplayed();
		return cartIconDIsplayed;
	}
	
	public void primaeDealsSection() {
		waitForVisibilityOfElement(primeDeal);
		click(primeDeal);
	}
	
	public Boolean validateBrandOnDealsPage() {
		waitForVisibilityOfElement(electronicSection);
		Boolean electronicSectionisDisplayed=electronicSection.isDisplayed();
		return electronicSectionisDisplayed;
	}
	
}
