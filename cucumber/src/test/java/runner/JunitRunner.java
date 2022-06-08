package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sivak\\eclipse-workspace\\cucumber\\src\\test\\java\\features",
		glue = "stepdefinitions",stepNotifications=true,
		plugin= {"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"junit:target/cutes.xml"},
		monochrome=true,
		dryRun= true,
		tags="@tag2 ")

public class JunitRunner {

}
