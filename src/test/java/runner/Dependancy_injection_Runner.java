package runner;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	    features = {"src\\test\\resources\\appFeature\\Dependancy_Injection.feature"},
	    glue = {"steps"},
	    plugin = {"pretty"}
	)
	public class Dependancy_injection_Runner  extends AbstractTestNGCucumberTests {
	}

