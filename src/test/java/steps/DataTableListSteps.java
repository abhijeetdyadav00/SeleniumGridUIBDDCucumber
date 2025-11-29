package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableListSteps {

	@Given("User is at accounts page")
	public void user_is_at_accounts_page() {
		System.out.println("User navigated on accounts page");
	}

	@When("User enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists();
		List<String> firstlist=data.get(0);
		String firstName=firstlist.get(0);
		String phoneNo=firstlist.get(3);
		System.out.println("FirstName is=>>>  "+ firstName);
		System.out.println("Phone Number is=>>>  "+ phoneNo);
		System.out.println(firstlist);
		String value=data.get(2).get(2);
		System.out.println("Get value from another index list==>  "+value);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("User clicking on submit button");
	}

	@Then("User should get confirmation")
	public void user_should_get_confirmation() {
	    System.out.println("User got the confirmation");
	}
	
	
	
}
