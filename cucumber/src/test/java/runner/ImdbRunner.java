package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sivak\\eclipse-workspace\\cucumber\\src\\test\\java\\feature",
		glue = "stepdefinition", 
		tags= "@tag1 or @tag1",
		dryRun= true,
		monochrome = true,
		plugin= {"pretty",
				"html:target/cucumber.html",
				"json:target/cucumber.json",
				"junit:target/cukes.xml"})
public class ImdbRunner {


}
