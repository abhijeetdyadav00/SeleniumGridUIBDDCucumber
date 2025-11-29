package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableMapStep {

@Given("user is at the accounts page")
public void user_is_at_the_accounts_page() {
	System.out.println("Pre defined statement");
}

@When("user enters the following data")
public void user_enters_the_following_data(DataTable mapData) {
	List<Map<String,String>> map=mapData.asMaps();
	Map<String , String> firstMap=map.get(0);
	String value=firstMap.get("email");
	System.out.println("value=  "+value);
	String value2=mapData.asMaps().get(2).get("name");
	System.out.println("Value2= "+value2);
	
}

@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
	System.out.println("form submitted");
}

@Then("user should get confirmation")
public void user_should_get_confirmation() {
	System.out.println("Account successfully created");
}
	
	
}
