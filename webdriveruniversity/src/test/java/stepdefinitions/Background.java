package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {
	public WebDriver driver;
	@Given("user is on  webdriveruniversity.com webpage")
	public void user_is_on_webdriveruniversity_com_webpage() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/sivak/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.https:/webdriveruniversity.com/"); 
		System.out.println("hi");
	}

	@When("using chrome browser")
	public void using_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("navigates to login page")
	public void navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
