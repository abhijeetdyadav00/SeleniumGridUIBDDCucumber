package uiFeatureSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/uiFeatures/HomePage.feature"},
		glue= {"uiFeatureSteps"},
		
		plugin= {"html:target/cucumber_report/report.html",
		"pretty"},
		
				
						//<--for failed scenario		
//		plugin= {"html:target/cucumber_report/report.html",
//				"rerun:target/failedrun.txt"},    
				
		publish=true
		
		
//		tags="@functional"
		)
	


public class AmazonTestRunner extends AbstractTestNGCucumberTests {

}
