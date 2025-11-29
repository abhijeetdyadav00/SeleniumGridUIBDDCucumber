package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("User is at login page")
	public void user_is_at_login_page() {
		System.out.println("Background=>User is at login page");
	}
	
	@Given ("User clicks on signup button")
	public void user_clicks_on_signUp() {
		System.out.println("Background=>User clicking on Signup button");
	}
	
	

	@When("user entering name as {string}")
	public void user_entering_name_as(String name) {
		System.out.println("User entered Name "+ name);
	}

	@When("User enters the gender as {string}")
	public void user_enters_the_gender_as(String gender) {
	   System.out.println("User entrred Gender  "+ gender);
	}

	@When("User enters the age as {int}")
	public void user_enters_the_age_as(int age) {
	    System.out.println("User enters age  "+ age);
	}

	@When("User enters weight as {double}")
	public void user_enters_weight_as(Double weight) {
	    System.out.println("User Enters weight  "+ weight);
	}

	@Then("Account should be created")
	public void account_should_be_created() {
	   System.out.println("Account is created successfully");
	}

}
