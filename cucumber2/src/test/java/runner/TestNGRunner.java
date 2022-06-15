package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:/Users/sivak/eclipse-workspace/cucumber2/src/test/java/features/imdb.feature",
		monochrome = true,
		dryRun = false,
		glue = "stepdefinitions" )
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
