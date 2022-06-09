package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImdbstepDefinition {
	public WebDriver driver;

	@Given("validate the browser")
	public void validate_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.imdb.com");
	}

	@When("browser is triggered")
	public void browser_is_triggered() {
		driver.navigate()
				.to("https://www.imdb.com/registration/signin?ref=nv_generic_lgin&u=%2Fvideo%2Fvi2195767833%2F");
		;
	}

	@Then("check if browser has started")
	public void check_if_browser_has_started() {
		System.out.println("hi");
	}

	@Given("Print title of the page")
	public void print_title_of_the_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("set system Properties")
	public void set_system_properties() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("identify webelement for username, password")
	public void identify_webelement_for_username_password() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("thread sleep")
	public void thread_sleep() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
		// Write code here that turns the phrase above into concrete actions

	}

}
