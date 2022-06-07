package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:/Users/sivak/eclipse-workspace/cucumber/src/test/java/feature/imdb.feature",
		glue = "stepdefinition" )
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
