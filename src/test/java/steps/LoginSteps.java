package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I am on login page")
	public void preRequisites() {
		System.out.println("Given statement is execution");
	}
	
	@When("I enter username")
	public void enterUsername() {
		System.out.println("I am entering Username");
	}
	
	@When("I enter password")
	public void enterPassword() {
		System.out.println("entering password");
	}
	
	@When("I click on login button")
	public void clickOnLogin() {
		System.out.println("Clicking on login button");
	}
	
	@Then("I should able to login")
	public void outputValidation() {
		System.out.println("logged in");
	}
	
//	@Given("User should be at login page")
//	public void navToLoginPage() {
//		System.out.println("Pre requisite for second scenario");
//	}
	////Uncommenting this will show DuplicateStepDefinitionException exception
//	@Given("I am on login page") 
//	public void navToLoginPage() {
//		System.out.println("Pre requisite for second scenario");
//	}
	
	@Then("Page title should be displayed")
	public void test() {
		System.out.println("Page title is displayed");
	}
	
	
	
}
