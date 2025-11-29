package uiFeatureSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features={"src\\test\\resources\\uiFeatures"},
		features= {"@target/failedrun.txt"},
		glue= {"uiFeatureSteps"},
		plugin= {"html:target/cucumber_report/report.html",
				"rerun:target/failedrun.txt"}

		)
	


public class FailedAmazonTestRunner extends AbstractTestNGCucumberTests {

}
