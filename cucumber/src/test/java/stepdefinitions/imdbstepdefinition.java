package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class imdbstepdefinition {
	public WebDriver driver;
	@Given("user is on landing page")
	public void user_is_on_landing_page() {
	System.out.println("hi");
	   System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.imdb.com/");
	   	 
	}

	@Given("in chrome browser")
	public void in_chrome_browser() throws InterruptedException {
	  driver.getTitle();
	  Thread.sleep(500);
	  
		}

	@When("using login id and password")
	public void using_login_id_and_password() {
		WebElement signin= driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a"));
			signin.click();
		
		
		
	
	}

	@When("wait for 100ms")
	public void wait_for_100ms() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with fake@emailid.com")
	public void i_want_to_write_a_step_with_fake_emailid_com() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I check for the fake in step")
	public void i_check_for_the_fake_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the fail in step")
	public void i_verify_the_fail_in_step(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with duplicate@emailid.com")
	public void i_want_to_write_a_step_with_duplicate_emailid_com() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I check for the duplicate in step")
	public void i_check_for_the_duplicate_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
