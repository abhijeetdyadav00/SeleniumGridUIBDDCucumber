package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appFeature\\ScenarioOutline_SignUP.feature"},
		glue= {"steps"}
		)

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {
	

}
