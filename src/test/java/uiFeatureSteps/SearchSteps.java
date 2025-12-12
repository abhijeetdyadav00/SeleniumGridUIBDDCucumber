package uiFeatureSteps;

import driverManager.DriverFactory;
import driverManager.DriverFactory2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {

	SearchPage searchpage = new SearchPage(DriverFactory2.getDriver());  //To initialize the driver and creating object
	
	@When("user searches the {string} in text box")
	public void user_searches_the_in_text_box(String iphone) {
		searchpage.clickOnsearchBox(iphone);
	}

	@Then("mobile search results should display")
	public void mobile_search_results_should_display() {
		String phonePrice=searchpage.getIphoneprice();
		System.out.println("Iphone 16 price =  "+phonePrice);
	}
	
	
	
	
}
