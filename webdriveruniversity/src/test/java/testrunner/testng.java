package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="C:\\Users\\sivak\\eclipse-workspace\\webdriveruniversity\\src\\test\\java\\features",
		monochrome = true,
		dryRun = false,
		glue = "stepdefinitions" )




public class testng extends AbstractTestNGCucumberTests {

}
