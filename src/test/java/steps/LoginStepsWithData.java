package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsWithData {
	
	@Given("User is at login Page")
	public void user_is_at_login_page() {

	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		System.out.println("User entering username as "+ username);
	}

	@When("User enters password as {int}")
	public void user_enters_password (int password){
		System.out.println("user Entering password "+ password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("User clicking on login button");
	}

	@Then("User logged in is validated with {string} and {int}")
	public void user_logged_in_is_validated_with_and(String username, int password) {
		System.out.println("User is logged in with correct username as "+username+" and password as "+password );
	}
	
	@Then("user is verifies for {string} and {string}")
	public void userverified(String surname, String name) {
		System.out.println("user's name is "+name+" and surname is "+surname);
	}
	


}
