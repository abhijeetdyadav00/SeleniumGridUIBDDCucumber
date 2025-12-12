package uiFeatureSteps;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverManager.DriverFactory;
import driverManager.DriverFactory2;
import driverManager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utility.ReadProperty;


public class HomePageSteps {
	
	HomePage homepage;
	public HomePageSteps() {
	
		 homepage =  new PageFactoryManager().getHomePageObject(DriverFactory2.getDriver());
	}
	
	@Given("user is at the landing page")
	public void preRequisite() throws IOException
	{
		WebDriver driver=DriverFactory.getDriver();
		driver.get(ReadProperty.getPropData("testSiteUrl"));
	}
	
	@Then("page title should contains {string}")
	public void validateTitle(String expectedTitle)
	{
		String title=homepage.getTitleOfPage();
		Boolean isPresent= title.contains(expectedTitle);
		System.out.println(title);
		Assert.assertEquals(isPresent, true);
	}
	
	
	@Then("cart icon should get displayed")
	public void validateCartElement() throws InterruptedException
	{
		Boolean isDispayed=homepage.isCartIconDisplayed();
		System.out.println("Cart is displayed");
		Assert.assertEquals(isDispayed, true);
	}
	
	@When("user clicks on deals")
	public void clickingOnDeals()
	{
		homepage.primaeDealsSection();
		System.out.println("clicked on prime deal");
	}
	
	@Then("user should redirect to deal page")
	public void validateDealsPage()
	{
		Boolean validateBrandOnDeal=homepage.validateBrandOnDealsPage();
		Assert.assertEquals(validateBrandOnDeal, true);
		
		System.out.println("validateBrandOnDeal is displayed");
	}
	

}
