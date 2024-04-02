package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="Features",
		glue="StepDefination",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		dryRun=true)
		//plugin={"pretty","json:target/cucumberReports.json"})
		 
		//plugin={"pretty","junit:target/cucumberReports.xml"})

public class Consultrunner extends AbstractTestNGCucumberTests{
  
}
