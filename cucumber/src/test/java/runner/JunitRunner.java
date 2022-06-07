package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/sivak/eclipse-workspace/cucumber/src/test/java/features/imdb.feature",
		glue = "stepdefinition",stepNotifications=true,
		tags="@tag2 or @tag1")

public class JunitRunner {

}
