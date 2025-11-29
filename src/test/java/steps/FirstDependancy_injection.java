package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstDependancy_injection {
	
    @Given("This is given step")
    public void this_is_given_step() {
        System.out.println("Executing: This is given step");
    }

    @When("This is when step")
    public void this_is_when_step() {
        System.out.println("Executing: This is when step");
    }

    @Then("This is then step")
    public void this_is_then_step() {
        System.out.println("Executing: This is then step");
    }

//    @Given("second scenario given")
//    public void second_scenario_given() {
//        System.out.println("Executing: Second scenario Given step");
//    }

}
