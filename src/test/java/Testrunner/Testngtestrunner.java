package Testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(features = {"src\\test\\java\\featurefile"},monochrome = true,
dryRun = !true,glue = "Stepdefintion",tags = "@checkoutpage or @offerpage",
plugin = {"html:target/cucumber.html","json:target/cucumber.json"
,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"})
public class Testngtestrunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
