package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\appFeature\\DatatableListType.feature"},
		glue= {"steps"}
		
		)

public class DataTableListTypeRunner extends AbstractTestNGCucumberTests{

}
