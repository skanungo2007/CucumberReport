package testRunner;



import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
			features = ".//src/test/java//feature//bankCucumber.feature",
			glue = {"stepDefinition"},
			plugin = {"pretty", "html:html_report", "json:json_report/JSONreport.json", "junit:xml_report/XMLreport.xml"},
			monochrome = true,
			dryRun = false,
			strict = true,
			tags = {"@Smoke, @Regression"}
		
		
		
		)


public class BankTestRunner {

	TestNGCucumberRunner testNGCucumberRunner;
	
	
	@BeforeClass
	public void initialize() {
		
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
		
	}
	
	@Test(description="Cucumber with TestNG", dataProvider="getFeature")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
	}
	
	@DataProvider
	public Object[][] getFeature() {
		
		return testNGCucumberRunner.provideFeatures();
		
		
		
	}
	
	@AfterClass
	public void close() {
		
		testNGCucumberRunner.finish();
	}
}
