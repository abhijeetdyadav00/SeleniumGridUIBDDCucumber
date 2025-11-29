package uiFeatureSteps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ReadProperty;

public class ApplicationHooks {
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException {
		DriverFactory df=new DriverFactory();
		String browser=ReadProperty.getPropData("browser");
		
		
		//Reading data from command prompt (command=>mvn test -DCLIBrowser="firefox")
		String cliValue=System.getProperty("CLIBrowser");
		if(cliValue!=null) {
			browser=cliValue;
		}
		
		
		driver=df.initbrowser(browser);
		driver.manage().window().maximize();
		
				
	}
	
	
	@After(order=2)
	public void tearDown(Scenario scenario) {
		Boolean scenarioFailed=scenario.isFailed();
		if(scenarioFailed) {
			TakesScreenshot ts= (TakesScreenshot)DriverFactory.getDriver();
			byte[] source=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", scenario.getName());
			
		}
	}
	
	
	@After(order=1)
	public void closeBrowser() {
		driver.quit();
	}
	
}
