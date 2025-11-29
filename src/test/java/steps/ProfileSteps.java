package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

	@Given("I have logged into application")
	public void loginToApplication() {
		System.out.println("First background given");
	}
	
	@Given("I am on home page")
	public void homePage() {
		System.out.println("navigating to home page");
	}
	
	@When("I clicked on add button")
	public void addButtonClick() {
		System.out.println("Clicked on add profile button");
	}
	
	@When("I I enter details")
	public void enterDetails() {
		System.out.println("Added profile details");
	}
	
	@Then("profile should get created")
	public void profileCrated() {
		System.out.println("profile is created");
	}
	
	
	@When("I clicked on edit button")
	public void editButtonClick() {
		System.out.println("clicked on edit button");
	}
	
	@When("Update data")
    public void updateData() {
		System.out.println("updated profile data");
	}
	
	@Then ("Profile should be updated")
	public void profileUpdate() {
		System.out.println("profile is update");
	}
	
	@When("I clicked on Delete button")
	public void clickDeletebutton() {
		System.out.println("clicking on delete button");
	}
	
	
	@When ("Profile should be deleted")
	public void profileDelete() {
		System.out.println("Profile is deleted");
	}
	
	
	
	
}
