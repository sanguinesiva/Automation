package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sivak\\eclipse-workspace\\cucumber\\src\\test\\java\\features",
		glue = "stepdefinitions",stepNotifications=true,
		plugin= {"pretty",
				"html:target/cucumber.html",
				"json:target/cucumber.json",
				"junit:target/cukes.xml"},
		monochrome=true,
		dryRun= false,
		tags="@tag or loginScenario")

public class JunitRunner {

}
