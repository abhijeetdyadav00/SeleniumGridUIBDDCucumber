package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appFeature\\tags.feature"},
		glue= {"steps","hooks"},
		plugin= {"pretty"},
		publish=true,
//		tags="sanity"
//		tags="@sanity and @regression"
//		tags="not @sanity"
//		tags="not (@sanity or @regression)"
		tags="@campaign"    /////To run all feature file
		
		
		
		
		)

public class tagsRunner extends AbstractTestNGCucumberTests{

}
