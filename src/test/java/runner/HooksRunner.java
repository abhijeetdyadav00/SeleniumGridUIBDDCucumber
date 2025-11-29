package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src\\test\\resources\\appfeature\\Hooks.feature" },

		glue = { "steps", "hooks" },

		plugin = { "pretty" }
		)


public class HooksRunner extends AbstractTestNGCucumberTests {
	
	
	
}
