package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features= {"src\\test\\resources\\appFeature\\DataTableMapType.feature"},
		glue= {"steps"}
		
		)

public class DataTableMapRunner extends AbstractTestNGCucumberTests{

}
