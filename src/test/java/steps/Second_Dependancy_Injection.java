package steps;

import io.cucumber.java.en.Given;

public class Second_Dependancy_Injection {

    @Given("second scenario given")
    public void second_scenario_given() {
        System.out.println("Executing: Second scenario Given step");
    }
	
	
}
