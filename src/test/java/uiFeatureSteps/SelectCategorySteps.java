package uiFeatureSteps;

import driverManager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SelectTest;

public class SelectCategorySteps {

	SelectTest selectmain=new SelectTest(DriverFactory.getDriver());
	
	@When("User selects category")
	public void user_selects_category() throws InterruptedException {
		selectmain.selectCategory();
	}

	@When("searches the product")
	public void searches_the_product() {
		System.out.println("search the product");
		selectmain.searchProduct("Fortuner");
	}

	@Then("clicks on search")
	public void clicks_on_search() throws InterruptedException {
		System.out.println("CLick on product");
		selectmain.searchProductSelect("fortuner key cover");
		
	}
	
}
